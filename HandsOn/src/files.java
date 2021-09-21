import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class files {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc=new Scanner(new File("src/Names.txt"));
			FileWriter file = new FileWriter("src/Names.txt");
			file.write("Mwesigye\nJoseph\nZeus");
			file.close();
			while(sc.hasNextLine()) 
			{
 				System.out.println("name:"+sc.next());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
