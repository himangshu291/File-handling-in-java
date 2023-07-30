import java.io.*;
import java.io.IOException;
public class mkdir
{
    public static void main(String args[])
    {
        String folder_name="ExampleFolder";
        File obj=new File(folder_name);
        boolean success=obj.mkdir();			//It creates a directory.
        if(success==true)
        {
            System.out.println("Folder created successfully");
        }
        else
        {
            System.out.println("Failed to create folder");
        }
    }
}