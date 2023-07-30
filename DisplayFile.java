import java.io.*;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class DisplayFile
{
    public static void main(String[] args)
    {
        try
        {
            File display=new File("bio.txt");
            Scanner sc=new Scanner(display);
            while(sc.hasNextLine())				//used to check if there is another line in the input of this scanner sc.
            {
                String data=sc.nextLine();			//takes each line one by one
                System.out.println(data);
            }
            sc.close();
            
        }
        catch(IOException e)
        {
            System.out.println("File not found.");
            e.printStackTrace();				//It returns all the details of an error message
        }
    }
}