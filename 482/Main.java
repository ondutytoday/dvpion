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
    int n = sc.nextInt();
    int t = 1, i = 1;    
    String s = "";
    while (s.length() < n) {
        while (t <=i){
            s += Integer.toString(t);
            t++;
        } 
        i++;
        t=1;
    }
    
    
    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
    //System.out.print (n + " " + a);
    pw.print(s.charAt(n-1));
    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
    pw.close();
  }
}