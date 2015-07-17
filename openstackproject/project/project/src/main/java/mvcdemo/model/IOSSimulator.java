package mvcdemo.model;

import java.io.*;

public class IOSSimulator {
 public static void main(String args[])throws IOException{
   Runtime r=Runtime.getRuntime();
   Process p=null;
   try
   {
     String s="c:\\Program Files (x86)\\iPadian\\iPadian.exe";
     p=r.exec(s);
   }
   catch(Exception e){
     System.out.println("error==="+e.getMessage());
     e.printStackTrace();
   }
 }
}