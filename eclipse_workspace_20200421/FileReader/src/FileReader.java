import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReader {

	public static void main(String[] args) throws IOException {

		File file = new File("/Users/aysegonen/Desktop/captmidn.txt") ;
		Scanner scan = new Scanner(file);
		
			while (scan.hasNextLine()) {
				System.out.println(scan.nextLine());
			}
		

// **********************************************************		
		
// to export that to a new file: 
		
		String fileContent = "THIS IS A NEW FILE MADE BY US.";
		
		while (scan.hasNextLine()) {
			fileContent = fileContent.concat(scan.nextLine() + "\n");
		}
		
		FileWriter writer = new FileWriter("/Users/aysegonen/Desktop/hellofile.txt");
		writer.write(fileContent);
		writer.close();
		
		
		
		
		
		
		
		
	}

}
