package javetrial;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class filereadandwrite {
	
	public static void main(String[] args) {
	    try {
	      FileWriter myWriter = new FileWriter("C:\\Users\\hpoll\\OneDrive\\Documents\\javareadandwritepractice\\hashim1check");
	    
	    myWriter.write("java has an extemsive file read and write methofd and i can not ignore it to the valley of the bottom of my heart and i will definetloy salute the process you ,<br>"
	    		+ "you are making and i am so glad to see you  . actually thiat was my real plan <br>"
	    		+ "anyway i am not gonna talk to much and rather than subject knowldge and see you soon and rather than tell us to the mothn of decemver.");
	    
	    myWriter.close();
	    System.out.println(" Successfully wrote the file");
	    
	    } catch(IOException e) {
	    	System.out.println(" an error thas occured");
	    	e.printStackTrace();
	    	
	    }
	    
	    
	    try {
	        File myObj1 = new File("C:\\\\Users\\\\hpoll\\\\OneDrive\\\\Documents\\\\javareadandwritepractice\\\\hashim1check");
	        Scanner myReader = new Scanner(myObj1);
	        while (myReader.hasNextLine()) {
	          String data = myReader.nextLine();
	          System.out.println(data);
	          
	          System.out.println("File name: " + myObj1.getName());
	          System.out.println("Absolute path: " + myObj1.getAbsolutePath());
	          System.out.println("Writeable: " + myObj1.canWrite());
	          System.out.println("Readable " + myObj1.canRead());
	          System.out.println("File size in bytes " + myObj1.length());
	        }
	        myReader.close();
	      } catch (FileNotFoundException e) {
	        System.out.println("An error occurred.");
	        e.printStackTrace();
	      }   
	    

}
}
