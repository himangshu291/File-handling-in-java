import java.io.File;
import java.io.IOException;
public class RenameFile 
{
    public static void main(String[] args)
    {
        String old="abc.txt";
        String newf="bio.txt";
        File oldFile=new File(old);
        File newFile=new File(newf);
        boolean success=oldFile.renameTo(newFile);
        if(success==true)
        {
            System.out.println("File renamed successfully.");
        }
        else
        {
            System.out.println("File doesn't exist.");
        }
    }
}