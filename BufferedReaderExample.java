import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		try
		{
			BufferedReader br = new BufferedReader(new FileReader(new File("D:/java/Corejava/src/name.txt")));
					String line = "";
			while((line=br.readLine())!=null)
			{
				System.out.println(line);
			}
			br.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not exists or insufficient rights");
			e.printStackTrace();
		}
		catch(IOException ex)
		{
			System.out.println("An Exception Occured while reading the file");
			ex.printStackTrace();
			
		}

	}

}
