import java.io.File;
import java.io.IOException;
public class File_info
{
    public static void main(String args[])
    {
        try
        {
            File obj=new File("himangshu.txt");
            if(obj.exists())
            {
                System.out.println("File name:"+obj.getName());
                System.out.println("Absolute path:"+obj.getAbsolutePath());
                //If you want to only read the file dont want to write then go to file properties then click the read only
                System.out.println("Writeable:"+obj.canWrite());
                System.out.println("Readable:"+obj.canRead());
                System.out.println("File size in bytes:"+obj.length());
            }
            else
            {
                System.out.println("The file does not exist");
            }
        }
        catch(Exception e)
        {
            System.out.println("An exception occured.");
            e.printStackTrace();				//It returns all the details of an error message
        }
        
    }
}