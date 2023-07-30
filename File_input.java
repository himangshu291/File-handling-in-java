//Taking keyboard input into a file
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class File_input
{
    public static void main(String args[])
    {
        Scanner sc=null;
        FileWriter writer=null;
        String inputtext;
        try
        {
            sc=new Scanner(System.in);
            writer=new FileWriter("New.txt");
            System.out.println("Type Exit for stop writing.");
            while(true)
            {
                inputtext=sc.nextLine();
                if(inputtext.equals("Exit"))
                {
                    break;
                }
                writer.write(inputtext);
                writer.write("\n");
            }
        }
        catch(IOException e)
        {
            System.out.print("An exception occurred.");
            e.printStackTrace();
        }
        finally
        {
            if(sc!=null)
                sc.close();
            try
            {
                if(writer!=null)
                {
                    writer.close();
                }
            }
            catch(IOException e)
            {
                System.out.print("Closing was not successfully!");
            }
        }
    }
}