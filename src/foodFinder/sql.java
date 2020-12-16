package foodFinder;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Class that connects to DB and performs various syntaxes
 */
public class sql {

	/*
	 * Function that connects to DB, used in all other functions
	 * To use this function, the ID and password of MySql should be 'root' and '12345' if it is not, you should edit this syntax
	 * If the connection is still not possible, the time zone of mySql should be modified.
	 */
	public Connection getConnection() {
		try {
			String driver = "com.mysql.cj.jdbc.Driver";
			String URL = "jdbc:mysql://localhost:3306/test?&serverTimezone=UTC";
			String user = "root";
			String password = "12345";

			Class.forName(driver);
			Connection con = DriverManager.getConnection(URL, user, password);
			// System.out.println("Connection successful");
			return con;
		} catch (Exception e) {
			System.out.println("wrong with connection " + e.getMessage());
			return null;
		}
	}

	public static void main(String[] args) {
		sql test = new sql();
		test.createTableFood();
		test.createTableMenu();
		test.createTableDistance1();
		test.createTableDistance2();
		test.createTableDistance3();
	}

	/*
	 * function that create table of food
	 * the food's name is primary key
	 */
	public void createTableFood() {
		try {
			Connection con = getConnection();
			PreparedStatement createTable = con
					.prepareStatement("CREATE TABLE IF NOT EXISTS " + "food2(name varchar(255),value varchar(255),"
							+ "spicy int, sweet int, bitter int,salty int, sour int, "
							+ "hard int, hot int, chewy int, oily int," + " PRIMARY KEY(name))");
			createTable.execute();
			con.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Successed");
		}
	}


	/*
	 * function that create table of Menu
	 * the store's name and menu's name are primary key, so it prevent duplicate inputs
	 */
	public void createTableMenu() {
		try {
			Connection con = getConnection();
			PreparedStatement createTable = con.prepareStatement(
					"CREATE TABLE IF NOT EXISTS " + "Menu(storeName varchar(255)," + "menu varchar(255))");
			createTable.execute();
			PreparedStatement alterTable = con
					.prepareStatement("ALTER TABLE " + "Menu " + "ADD PRIMARY KEY (storeName, menu) " + "");
			alterTable.execute();
			con.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Successed");
		}
	}

	/*
	 * function that create table of distance information of points in school area
	 * both of point's names are primary key, so it prevent duplicate inputs
	 */
	public void createTableDistance1() {
		try {
			Connection con = getConnection();
			PreparedStatement createTable = con.prepareStatement("CREATE TABLE IF NOT EXISTS "
					+ "distanceSchool(name1 varchar(255)," + "name2 varchar(255), dist int)");
			createTable.execute();
			PreparedStatement alterTable = con
					.prepareStatement("ALTER TABLE " + "distanceSchool " + "ADD PRIMARY KEY (name1, name2) " + "");
			alterTable.execute();
			con.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Successed");
		}
	}
	/*
	 * function that create table of distance information of points in BokJeong-dong
	 * both of point's names are primary key, so it prevent duplicate inputs
	 */
	public void createTableDistance2() {
		try {
			Connection con = getConnection();
			PreparedStatement createTable = con.prepareStatement("CREATE TABLE IF NOT EXISTS "
					+ "distanceBok(name1 varchar(255)," + "name2 varchar(255), dist int)");
			createTable.execute();
			PreparedStatement alterTable = con
					.prepareStatement("ALTER TABLE " + "distanceBok " + "ADD PRIMARY KEY (name1, name2) " + "");
			alterTable.execute();
			con.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Successed");
		}
	}

	/*
	 * function that create table of distance information of points in TaePyeong-Dong
	 * both of point's names are primary key, so it prevent duplicate inputs
	 */
	public void createTableDistance3() {
		try {
			Connection con = getConnection();
			PreparedStatement createTable = con.prepareStatement("CREATE TABLE IF NOT EXISTS "
					+ "distanceTae(name1 varchar(255)," + "name2 varchar(255), dist int)");
			createTable.execute();
			PreparedStatement alterTable = con
					.prepareStatement("ALTER TABLE " + "distanceTae " + "ADD PRIMARY KEY (name1, name2) " + "");
			alterTable.execute();
			con.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Successed");
		}
	}

	/*
	 * function that input food's information into 'food2' table
	 */
	public void insertFood(String name, String value, int spicy, int sweet, int bitter, int salty, int sour, int hard,
			int hot, int chewy, int oily) {
		try {
			Connection con = this.getConnection();
			PreparedStatement insert = con.prepareStatement("" + "INSERT INTO food2 "
					+ "(name, value, spicy, sweet, bitter,salty, sour, hard, hot, chewy, oily) " + "VALUES " + "('"
					+ name + "','" + value + "'," + spicy + "," + sweet + "," + bitter + "," + salty + "," + sour + ","
					+ hard + "," + hot + "," + chewy + "," + oily + ")");
			insert.executeUpdate();
			con.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Successed");
		}
	}

	/*
	 * function that input menu information into 'food2' Menu
	 */
	public void insertMenu(String name, String menu) {
		try {
			Connection con = this.getConnection();
			PreparedStatement insert = con.prepareStatement(
					"" + "INSERT INTO Menu " + "(storeName, menu) " + "VALUES " + "('" + name + "','" + menu + "')");
			insert.executeUpdate();
			con.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Successed");
		}
	}

	/*
	 * function that check if there is a point that has same name with entered String
	 * and return result as boolean value
	 */
	public boolean checkStore(String name) {
		try {

			Connection con = getConnection();
			PreparedStatement statement = con
					.prepareStatement("" + "SELECT name1 FROM distanceSchool WHERE name1 = '" + name + "'");
			ResultSet results = statement.executeQuery();
			if (results.next()) {
				return true;
			}
			con = getConnection();
			statement = con.prepareStatement("" + "SELECT name1 FROM distanceBok WHERE name1 = '" + name + "'");
			results = statement.executeQuery();
			if (results.next()) {
				return true;
			}
			con = getConnection();
			statement = con.prepareStatement("" + "SELECT name1 FROM distanceTae WHERE name1 = '" + name + "'");
			results = statement.executeQuery();
			if (results.next()) {
				return true;
			}
			con.close();
			return false;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	/*
	 * function that add new distance information of two points that are in school area
	 * it is not one-way, so input A-B information and B-A information at the same time
	 */
	public void insertDistance1(String name1, String name2, int distance) {
		try {
			Connection con = this.getConnection();
			PreparedStatement insert = con.prepareStatement("" + "INSERT INTO distanceSchool " + "(name1, name2, dist) "
					+ "VALUES " + "('" + name1 + "','" + name2 + "'," + distance + ")");
			insert.executeUpdate();
			insert = con.prepareStatement("" + "INSERT INTO distanceSchool " + "(name1, name2, dist) " + "VALUES "
					+ "('" + name2 + "','" + name1 + "'," + distance + ")");
			insert.executeUpdate();
			con.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Successed");
		}
	}

	/*
	 * function that add new distance information of two points that are in BokJeong-dong
	 * it is not one-way, so input A-B information and B-A information at the same time
	 */
	public void insertDistance2(String name1, String name2, int distance) {
		try {
			Connection con = this.getConnection();
			PreparedStatement insert = con.prepareStatement("" + "INSERT INTO distanceBok " + "(name1, name2, dist) "
					+ "VALUES " + "('" + name1 + "','" + name2 + "'," + distance + ")");
			insert.executeUpdate();
			insert = con.prepareStatement("" + "INSERT INTO distanceBok " + "(name1, name2, dist) " + "VALUES " + "('"
					+ name2 + "','" + name1 + "'," + distance + ")");
			insert.executeUpdate();
			con.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Successed");
		}
	}

	/*
	 * function that add new distance information of two points that are in TaePyeong-dong
	 * it is not one-way, so input A-B information and B-A information at the same time
	 */
	public void insertDistance3(String name1, String name2, int distance) {
		try {
			Connection con = this.getConnection();
			PreparedStatement insert = con.prepareStatement("" + "INSERT INTO distanceTae " + "(name1, name2, dist) "
					+ "VALUES " + "('" + name1 + "','" + name2 + "'," + distance + ")");
			insert.executeUpdate();
			insert = con.prepareStatement("" + "INSERT INTO distanceTae " + "(name1, name2, dist) " + "VALUES " + "('"
					+ name2 + "','" + name1 + "'," + distance + ")");
			insert.executeUpdate();
			con.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Successed");
		}
	}

	/*
	 *function that enters the Dessert and Meal as value variables 
	 *and outputs all of the corresponding menus as ArrayList.
	 */
	public ArrayList<food> getFood(String value) {
		try {
			Connection con = getConnection();
			PreparedStatement statement = con
					.prepareStatement("" + "SELECT * FROM food2  WHERE value = '" + value + "'");
			ResultSet results = statement.executeQuery();
			ArrayList<food> list = new ArrayList<food>();

			while (results.next()) {
				food newFood = new food();
				newFood.setFood(results.getString("name"), results.getInt("spicy"), results.getInt("sweet"),
						results.getInt("bitter"), results.getInt("salty"), results.getInt("sour"),
						results.getInt("hard"), results.getInt("hot"), results.getInt("chewy"), results.getInt("oily"));
				list.add(newFood);
			}
			con.close();
			return list;

		} catch (Exception e) {
			System.out.println("getUser " + e.getMessage());
			return null;
		}
	}

	/*
	 * function that gets the name of a restaurant and returns all the menus that the restaurant has.
	 */
	public ArrayList<String> getMenu(String storeName) {
		try {
			Connection con = getConnection();
			PreparedStatement statement = con
					.prepareStatement("" + "SELECT menu FROM Menu  WHERE storeName = '" + storeName + "'");
			ResultSet results = statement.executeQuery();
			ArrayList<String> list = new ArrayList<String>();

			while (results.next()) {
				String tmp;
				tmp = results.getString("menu");
				list.add(tmp);
			}
			con.close();
			return list;

		} catch (Exception e) {
			return null;
		}
	}

	/*
	 * Function that gets a menu name and return all restaurants that have that menu
	 */
	public ArrayList<String> getStores(String menu) {
		try {
			Connection con = getConnection();
			PreparedStatement statement = con
					.prepareStatement("" + "SELECT storeName FROM Menu  WHERE menu = '" + menu + "'");
			ResultSet results = statement.executeQuery();
			ArrayList<String> list = new ArrayList<String>();

			while (results.next()) {
				String tmp;
				tmp = results.getString("storeName");
				list.add(tmp);
			}
			con.close();
			return list;

		} catch (Exception e) {
			return null;
		}
	}
	/*
	 * function that return all point's name that are in school area
	 */
	public ArrayList<String> getPoints1() {
		try {
			Connection con = getConnection();
			PreparedStatement statement = con.prepareStatement("" + "SELECT distinct name1 FROM distanceSchool");
			ResultSet results = statement.executeQuery();
			ArrayList<String> list = new ArrayList<String>();

			while (results.next()) {
				String tmp;
				tmp = results.getString("name1");
				list.add(tmp);
			}
			con.close();
			return list;

		} catch (Exception e) {
			return null;
		}
	}

	/*
	 * function that return all point's name that are in BokJeong-dong
	 */
	public ArrayList<String> getPoints2() {
		try {
			Connection con = getConnection();
			PreparedStatement statement = con.prepareStatement("" + "SELECT distinct name1 FROM distanceBok");
			ResultSet results = statement.executeQuery();
			ArrayList<String> list = new ArrayList<String>();

			while (results.next()) {
				String tmp;
				tmp = results.getString("name1");
				list.add(tmp);
			}
			con.close();
			return list;

		} catch (Exception e) {
			return null;
		}
	}

	/*
	 * function that return all point's name that are in TaePyeong-dong
	 */
	public ArrayList<String> getPoints3() {
		try {
			Connection con = getConnection();
			PreparedStatement statement = con.prepareStatement("" + "SELECT distinct name1 FROM distanceTae");
			ResultSet results = statement.executeQuery();
			ArrayList<String> list = new ArrayList<String>();

			while (results.next()) {
				String tmp;
				tmp = results.getString("name1");
				list.add(tmp);
			}
			con.close();
			return list;

		} catch (Exception e) {
			return null;
		}
	}

	/*
	 * function that gets two points in school area and return distance between them
	 */
	public int getDistance1(String name1, String name2) {
		int result = -1;
		try {
			Connection con = getConnection();
			PreparedStatement statement = con.prepareStatement(
					"" + "SELECT dist FROM distanceSchool WHERE name1 = '" + name1 + "'and name2 = '" + name2 + "'");
			ResultSet results = statement.executeQuery();

			while (results.next()) {
				result = results.getInt("dist");
			}
			con.close();
			return result;

		} catch (Exception e) {
			return -1;
		}
	}

	/*
	 * function that gets two points in Bokjeong-dong and return distance between them
	 */
	public int getDistance2(String name1, String name2) {
		int result = -1;
		try {
			Connection con = getConnection();
			PreparedStatement statement = con.prepareStatement(
					"" + "SELECT dist FROM distanceBok WHERE name1 = '" + name1 + "'and name2 = '" + name2 + "'");
			ResultSet results = statement.executeQuery();

			while (results.next()) {
				result = results.getInt("dist");
			}
			con.close();
			return result;

		} catch (Exception e) {
			return -1;
		}
	}

	/*
	 * function that gets two points in TaePyeong-dong and return distance between them
	 */
	public int getDistance3(String name1, String name2) {
		int result = -1;
		try {
			Connection con = getConnection();
			PreparedStatement statement = con.prepareStatement(
					"" + "SELECT dist FROM distanceTae WHERE name1 = '" + name1 + "'and name2 = '" + name2 + "'");
			ResultSet results = statement.executeQuery();

			while (results.next()) {
				result = results.getInt("dist");
			}
			con.close();
			return result;

		} catch (Exception e) {
			return -1;
		}
	}

	/*
	 * function that input point's name and return if the point is in schoolarea(1),BokJeong-dong(2), TaePyeong-dong(3)
	 */
	public int getPlace(String name1) {
		int result = -1;
		try {
			Connection con = getConnection();
			PreparedStatement statement = con
					.prepareStatement("" + "SELECT name1 FROM distanceSchool WHERE name1 = '" + name1 + "'");
			ResultSet results = statement.executeQuery();
			if (results.next()) {
				return 1;
			}
			con = getConnection();
			statement = con.prepareStatement("" + "SELECT name1 FROM distanceBok WHERE name1 = '" + name1 + "'");
			results = statement.executeQuery();
			if (results.next()) {
				return 2;
			}
			con = getConnection();
			statement = con.prepareStatement("" + "SELECT name1 FROM distanceTae WHERE name1 = '" + name1 + "'");
			results = statement.executeQuery();
			if (results.next()) {
				return 3;
			}
			con.close();
			return -1;

		} catch (Exception e) {
			return -1;
		}
	}

	/*
	 * function that gets index of schoolarea(1), bokjeongdong(2), TaePyeong-dong(3)
	 * and return the number of points in selected area
	 */
	public int getPlaceNum(int i) {
		int result = -1;
		try {
			Connection con = getConnection();
			PreparedStatement statement;
			if (i == 1) {
				statement = con.prepareStatement("" + "SELECT COUNT(distinct name1) FROM distanceSchool ");
			} else if (i == 2) {
				statement = con.prepareStatement("" + "SELECT COUNT(distinct name1) FROM distanceBok ");
			} else {
				statement = con.prepareStatement("" + "SELECT COUNT(distinct name1) FROM distanceTae ");
			}
			ResultSet results = statement.executeQuery();

			while (results.next()) {
				result = results.getInt("COUNT(distinct name1)");
			}
			con.close();
			return result;

		} catch (Exception e) {
			return result;
		}
	}

}
