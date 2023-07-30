import java.io.*;
import java.io.IOException;
public class WriteToFile
{
    public static void main(String[] args)
    {
        try
        {
            FileWriter myWriter=new FileWriter("New.txt");
            myWriter.write("My name is Himangshu chandra das. I'm from siliguri. I study MCA at Siliguri Institute of Technology.");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        }
        catch(IOException e)
        {
            System.out.println("An error occured.");
            e.printStackTrace();				//It returns all the details of an error message
        }
    }
}