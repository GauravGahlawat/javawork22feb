import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			Writer w = new FileWriter("D:\\java\\Corejava\\src\\filedemo1.txt");
			String content = "She sells Sea Shells In The Seas";
			w.write(content);
			w.close();
			System.out.println("DATA WRITTEN");
			
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}

}
