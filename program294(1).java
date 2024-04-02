import java.lang.*;
import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

class program293
{
    public static void main(String arg[])
    {
        try
        {
        Scanner sobj=new Scanner(System.in);

        System.out.println("please enter directory/folder name");
        String Folderame=sobj.nextLine();

        File dobj=new File(Folderame);

        File allfiles[]=dobj.listFiles();
        String name;

        for(int i=0;i<allfiles.length;i++)
        {
            name=allfiles[i].getName();
            if(name.endsWith(".txt"))
            {
                System.out.println(name);
            }
            
        }

        }
        catch(Exception obj)
        {
            System.out.println(obj);
        }
    }
}