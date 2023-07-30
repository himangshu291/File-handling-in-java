import java.io.File;
import java.io.IOException;
public class CreateFile
{
    public static void main(String[] args)
    {
        try
        {
            File obj=new File("New.txt");
            if(obj.createNewFile())				//This method creates an empty file and return true.
            {
                System.out.println("File created: "+obj.getName());				//return the name of the  file
                System.out.println("File path: "+obj.getAbsolutePath());		//return the absolute path of the file
            }
            else
            {
                System.out.println("File already exists.");
            }
        }
        catch(IOException e)
        {
            System.out.println("An error occured.");
            e.printStackTrace();			//It returns all the details of an error message
        }
    }
}