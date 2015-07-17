package rackspace.openstack;
import java.io.IOException;

public class Android{
 public void runAndroidEmulator()throws IOException{
   Runtime android_run = Runtime.getRuntime();
   Process p=null;
   try
   {
     String s="c:\\Program Files\\Andy\\HandyAndy.exe startandy";
     //following will launch the android emulator where apk can be later tested
     p= android_run.exec(s);
   }
   catch(Exception e){
     System.out.println("error :"+e.getMessage());
     e.printStackTrace();
   }
 }
 
 
}