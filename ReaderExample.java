
import java.io.FileReader;
import java.io.Reader;

public class ReaderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			Reader reader = new FileReader("D:\\java\\Corejava\\src\\filedemo1.txt");
			int data = reader.read();
			while(data != -1)
			{
				System.out.print((char)data);
				data = reader.read();
			}
			reader.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}


	}

}
