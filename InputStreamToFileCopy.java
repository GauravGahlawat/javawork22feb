import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class InputStreamToFileCopy {
	public static void main(String args[])
	{
		try
		{
			InputStream is = new FileInputStream("D:/java/Corejava/src/source.txt");
			OutputStream os = new FileOutputStream("D:/java/Corejava/src/new_source.txt");
			
			byte[] buffer = new byte[1024];
			int bytesRead;
			
			// read from is to buffer
			
			while((bytesRead = is.read(buffer)) != -1)
			{
				os.write(buffer, 0, bytesRead);
			}
			System.out.println("File Copied");
			is.close();
			
			// flush output Stream to write any buffer data to file
			
			os.flush();
			os.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
