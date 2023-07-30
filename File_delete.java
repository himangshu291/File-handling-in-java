import java.io.File;
import java.io.IOException;
public class File_delete
{
    public static void main(String args[])
    {
        try
        {
            File obj=new File("xyz1.txt");
            if(obj.delete())			//delete() method delete the file and return true if delete successfully else false
            {
                System.out.println("File deleted successfully.");
            }
            else
            {
                System.out.println("File doesn't exist.");
            }
        }
        catch(Exception e)
        {
            System.out.println("An error occured.");
            e.printStackTrace();			//It returns all the details of an error message
        }
    }
}