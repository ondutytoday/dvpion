import java.util.*;
import java.io.*;
import java.math.BigInteger;

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
    BigInteger n = new BigInteger (sc.next());
    int m = sc.nextInt();
    String s = n.pow(m).toString();
    
    
    
    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
    System.out.print (s.valueOf(s.charAt(s.length()-1)));
    pw.print(s.valueOf(s.charAt(s.length()-1)));
    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
    pw.close();
  }
}