package javetrial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		System.out.println( " heloo world");
		
		String[]cars= {"Volvo","BMW","TOYTA","MAZDA"};
		System.out.println(cars[0]);
		for(int i=0;i<cars[i].length();i++) {
			cars[1]="hashim";
			System.out.println(cars[i]);
		}
		
		*/
		/*System.out.println(" this is multidimentioinal array: ");
		
		int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
	    for (int i = 0; i < myNumbers.length; ++i) {
	      for(int j = 0; j < myNumbers[i].length; ++j) {
	        System.out.println(myNumbers[i][j]);
	      }
	    }
	    
	    int myNum1 = plusMethod(8, 5);
	    double myNum2 = plusMethod(4.3, 6.26);
	    System.out.println("int: " + myNum1);
	    System.out.println("double: " + myNum2);
	    
	    
	    
	    
	    int result = sum(10);
	    System.out.println(result);
	    
	    
	    LocalTime myObj = LocalTime.now();
	    System.out.println(myObj);
	    
	    
		System.out.println(" array ListPractice:");
		
		
		ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    
	    
	    //change an item 
	    cars.set(0, "oppel");
	    
	    for (int i = 0; i < cars.size(); i++) {
		      System.out.println(cars.get(i));
		    }
	    
	    
	    
	    LinkedList<String> cars1 = new LinkedList<String>();
	    cars1.add("Volvo");
	    cars1.add("BMW");
	    cars1.add("Ford");
	    cars1.add("Mazda");
	    cars1.addFirst("hashim");
	    System.out.println(cars1);
	    
	    
	    //HashMap:
	    
	    HashMap<String, String> capitalCities = new HashMap<String, String>();

	    // Add keys and values (Country, City)
	    capitalCities.put("England", "London");
	    capitalCities.put("Germany", "Berlin");
	    capitalCities.put("Norway", "Oslo");
	    capitalCities.put("USA", "Washington DC");
	    
	    System.out.println(capitalCities);
	    
	    System.out.println(capitalCities.get("England"));
	    
	    System.out.println(capitalCities.size());
	    
	    
	    for (String i : capitalCities.keySet()) {
	    	  System.out.println(i);
	    	}
	    
	    for (String i : capitalCities.values()) {
	    	  System.out.println(i);
	    	}
	    
	    
	    //Lambda Expressioin :
	    
	    ArrayList<Integer> numbers = new ArrayList<Integer>();
	    numbers.add(5);
	    numbers.add(9);
	    numbers.add(8);
	    numbers.add(1);
	    numbers.forEach( (n) -> { System.out.println(n); } );
	    
	    
	    
	    
	    // file read and write
	    
	    
	    
	    
	  
	}
	
	
	static int plusMethod(int x, int y) {
		  return x + y;
		}

		static double plusMethod(double x, double y) {
		  return x + y;
		}
		
		
		
		public static int sum(int k) {
		    if (k > 0) {
		      return k + sum(k - 1);
		    } else {
		      return 0;
		    }*/
		
		 try {
	            // db parameters

	            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr", "root", "Sylhetbd07");
	            Statement statement = conn.createStatement();
	            ResultSet resultSet=statement.executeQuery("select * from countries");
	            while (resultSet.next()){
	                System.out.println(resultSet.getString("country_name"));
	            }




	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
		
		
		  }

}
