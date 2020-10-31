import java.util.*;
import java.io.*;


public class Main{ 
  public static void main(String[] argv) throws IOException{
    new Main().run();
  }
  PrintWriter pw;
  Scanner sc;
  public void run() throws IOException{
    sc = new Scanner(new File("input.txt"));
    	//Начало
    int c_m = 0;
    int c_w = 0;
   String n = sc.next();
   String m = sc.next();

   for (int i =0; i < 4; i++) {
       if (n.charAt(i) - m.charAt(i) == 0) c_m++;
   }

   for (int i =0; i < 4; i++) {
        for (int j =0; j < 4; j++)  {
             if (n.charAt(i) - m.charAt(j) == 0) c_w++;
        }
   }
	//Конец
    
    pw = new PrintWriter(new File("output.txt"));
    pw.print(c_m + " " + (c_w-c_m));
    pw.close();

    System.out.print (c_m + " " + (c_w-c_m));
    }
}
