package foodFinder;

public class food {
	
	String name;
	
	int[] taste = new int[9];
	String[] tasteName = {"spicy","sweet","bitter","salty","sour","hard","hot","chewy","oily"};
	
	public void setFood(String name, int spicy,int sweet, int bitter,int salty, int sour, int hard, int hot, int chewy, int oily) {
		
		this.name = name;
		taste[0]=spicy;
		taste[1]=sweet;
		taste[2]=bitter;
		taste[3]=salty;
		taste[4]=sour;
		taste[5]=hard;
		taste[6]=hot;
		taste[7]=chewy;
		taste[8]=oily;

	}
}
