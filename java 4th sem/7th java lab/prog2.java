import java.io.*;
import java.util.*;
import java.lang.*;
public class FileReadWrite {
	public static void main(String[] args) throws IOException{
		File file = new File("src/Priyansu.txt");
		try {
			file.createNewFile();
			System.out.println("File created");
		}catch(IOException e) {
			System.out.println("Error occured");
		}
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))){
			bw.write("LMAO DED XD");
			bw.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("src/Priyansu.txt"));
			String line;
			while((line =br.readLine())!= null) {
				StringBuilder input1 = new StringBuilder();
				input1.append(line);
				input1.reverse();
				String newValue = input1.toString();
				System.out.println(newValue);
				File nf = new File("src/PriyansuRev.txt");
				nf.createNewFile();
				BufferedWriter nbw = new BufferedWriter(new FileWriter(nf));
				nbw.write(newValue);
				nbw.close();
				
			}
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}
}