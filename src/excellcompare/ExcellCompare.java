/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excellcompare;
/**
 *
 * @author Justine
 */
import java.io.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Logger;

public class ExcellCompare 
{
    public static void main(String[] args) throws IOException
    {
        
        File f1 = new File("C:\\Users\\Justine\\Desktop\\insularInput\\kulangwithDetails.txt");
        //INPUT
        File f2 = new File("C:\\Users\\Justine\\Desktop\\insularInput\\allTimeAccounts.txt");
                    
        //OUTPUT
        
        FileReader fR1 = new FileReader(f1);
        FileReader fR2 = new FileReader(f2);
        BufferedReader reader1 = new BufferedReader(fR1);
        BufferedReader reader2 = new BufferedReader(fR2);
        String line1 = null;
        String line2 = "";
        String line3 = null;
        String line4 = "";
        int flag = 1;
        
              System.out.println("File information:");
               while((line1 = reader1.readLine()) != null)
               {
                   line2 +=line1+"\n";   
               }
               System.out.println(line2);
               while((line3 = reader2.readLine()) != null)
               {
                   //System.out.println(line3+":found") ;
                   if(line2.indexOf(line3)!=-1)
                   {
                       System.out.println(line3+":found") ;
                   }
                   else
                   {
                       System.out.println(line3+":Not found");
                   }
               }
                
        }
}