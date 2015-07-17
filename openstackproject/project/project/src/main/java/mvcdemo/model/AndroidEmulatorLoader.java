package mvcdemo.model;

import java.io.*;

public class AndroidEmulatorLoader{
 public void runAndroidEmulator()throws IOException{
   Runtime r=Runtime.getRuntime();
   Process p=null;
   try
   {
     String s="c:\\Program Files\\Andy\\HandyAndy.exe startandy";
     p=r.exec(s);
   }
   catch(Exception e){
     System.out.println("error==="+e.getMessage());
     e.printStackTrace();
   }
 }
 
 
}