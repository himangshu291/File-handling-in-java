import java.io.*;
import java.io.IOException;
import java.util.Scanner;
public class CopyFile
{
    public static void main(String[] args)
    {
        String input="New.txt";				//Input file name
        String output="Himangshu.txt";		//Output file name 
        try
        {
            File reader=new File(input);
            FileWriter writer=new FileWriter(output);
            if(reader.exists())			//It tests whether the file exists or not
            {
                Scanner sc=new Scanner(reader);
                while(sc.hasNextLine())
                {
                    String data = sc.nextLine();
                    writer.write(data);
                }
                // reader.close();
                writer.close();
                System.out.println("File copied successfully.");
            }
            else
            {
                System.out.println("File doesn't exists.");
            }
        }
        catch(IOException e)
        {
            System.out.println("Error occured while copying the file.");
            e.printStackTrace();				//It returns all the details of an error message
        }
    }
}