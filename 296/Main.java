import java.util.*;
import java.io.*;


public class Main{
  public static void main(String[] argv) throws IOException{
    new Main().run();
  }

  PrintWriter pw;
  Scanner sc;
  
  public void run() throws IOException{
    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
    sc = new Scanner(new File("input.txt"));
    pw = new PrintWriter(new File("output.txt"));
    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
    int s = sc.nextInt();
    int n = s/5;
    int a = 0;
    int m = s%5;
    if (m!= 0) {
        if (m == 3) a =1; 
        if (m<3) { m+=5; n--;}
         
            for (;;) {
                if (m%3 ==0) {
                a = m/3;     
                break;
                }
                m+=5;
                n--;
            } 
        
    }
    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
    System.out.print (n + " " + a);
    pw.print(n + " " + a);
    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
    pw.close();
  }
}