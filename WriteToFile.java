import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			FileWriter writer = new FileWriter("D:\\java\\Corejava\\src\\name.txt",true);
			BufferedWriter bwr = new BufferedWriter(writer);
			
			bwr.write("James");
			bwr.newLine();
			//bwr.write("\n");
			bwr.write("Hobert");
			bwr.close();
			
			System.out.println("successfully written to a File");
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}

	}

}
