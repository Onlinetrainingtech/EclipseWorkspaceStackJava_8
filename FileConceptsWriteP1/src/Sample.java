import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.SequenceInputStream;

import javax.sound.midi.Sequence;

public class Sample {

	void writeData() throws IOException
	{
		try
		{
			FileOutputStream fos=new FileOutputStream("D:\\f1.txt");
			String name="Welcome";
			byte s[]=name.getBytes();
			fos.write(s);
			System.out.println("FileWrite Success!!!");
		}
		catch(FileNotFoundException r)
		{
			System.out.println(r);
		}
	}
	void readData() throws IOException
	{
		try
		{
			FileInputStream fis=new FileInputStream("D:\\f1.txt");
			FileOutputStream fos1=new FileOutputStream("D:\\f2.txt");
			int i;
			while((i=fis.read())!=-1)
			{
				//System.out.print((char)i);
				fos1.write((byte)i);
			}
			System.out.println("New File Copy..");
		}
		catch(FileNotFoundException t)
		{
			System.out.println(t);
		}
	}
	void sequenceRead() throws IOException
	{
		try
		{
			FileInputStream f1=new FileInputStream("D:\\f1.txt");
			FileInputStream f2=new FileInputStream("D:\\f2.txt");
			SequenceInputStream sis=new SequenceInputStream(f1,f2);
			int i;
			while((i=sis.read())!=-1)
			{
				System.out.print((char)i);
			}
		}
		catch(FileNotFoundException r)
		{
			System.out.println(r);
		}
	}
	void fileReader() throws IOException
	{
		try
		{
			FileReader fr=new FileReader("D:\\f1.txt");
			int i;
			while((i=fr.read())!=-1)
			{
				System.out.print((char)i);
			}
							
		}
		catch(FileNotFoundException r)
		{
			System.out.println(r);
		}
	}
	
	
	public static void main(String[] args) throws IOException {
		
		Sample f1=new Sample();
		//f1.writeData();
		//f1.readData();
		//f1.sequenceRead();
		f1.fileReader();

	}

}
