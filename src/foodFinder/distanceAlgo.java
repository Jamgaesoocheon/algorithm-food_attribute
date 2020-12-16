package foodFinder;

/*
 * class that compare two foods with edited minimum edit distance
 */
public class distanceAlgo {


	/*
	 * 'insert' and 'delete' and 'copy' substract difference between x value and y value from left, up, diagonal
	 * at this moment 'copy' adds 5 to the result
	 */
	public int insert(int[][] table, int i, int j,Taste[] user,Taste[] menu) {
		return table[i][j - 1] - Math.abs(user[i].tasteLevel - menu[j].tasteLevel);

	}

	public int delete(int[][] table, int i, int j,Taste[] user,Taste[] menu) {
		return table[i-1][j] - Math.abs(user[i].tasteLevel - menu[j].tasteLevel);

	}

	public int copy(int[][] table, int i, int j,Taste[] user,Taste[] menu) {
		return table[i - 1][j - 1] + 5 - Math.abs(user[i].tasteLevel - menu[j].tasteLevel);

	}


	/*
	 * a function that execute minimum edit algorithm
	 */
	public int findTasteResult(Taste[] userTaste, Taste[] menuTaste,int sizeOfUser) {

		sizeOfUser++; 
		Taste[] arr = new Taste[sizeOfUser];
		Taste[] menu = new Taste[10];
		int[][] table = new int[sizeOfUser][10];
		
		for(int i=0;i<10;i++) {
			table[0][i] = 0;
			menu[i] = menuTaste[i];
		}

		for (int i = 0; i < sizeOfUser; i++) {
			arr[i] = userTaste[i];
			table[i][0] = 0;
		}


		for (int i = 1; i < sizeOfUser; i++) {
			for (int j = 1; j < 10; j++) {
				if (!arr[i].tasteType.equals(menu[j].tasteType)) {
					table[i][j] = Math.max(insert(table, i, j,userTaste,menuTaste), delete(table, i, j,userTaste,menuTaste));
				} else {
					table[i][j] = Math.max(insert(table, i, j,userTaste,menuTaste), Math.max(delete(table, i, j,userTaste,menuTaste), copy(table, i, j,userTaste,menuTaste)));
				}
			}

		}
		return table[--sizeOfUser][9];

	}

}
