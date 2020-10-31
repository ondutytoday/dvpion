import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main{
  public static void main(String[] argv) throws IOException{
    new Main().run();
  }

  //////////////////////////////////////////////////////////////////////////
  
  PrintWriter pw;
  Scanner sc;
  
  public void run() throws IOException{
    sc = new Scanner(new File("input.txt")); 
    String a = sc.nextLine();
    String b = sc.nextLine();
    
    BigInteger m = new BigInteger (a);
    BigInteger n = m.subtract(new BigInteger (b));
    
    pw = new PrintWriter(new File("output.txt"));
    pw.print(n);
    pw.close();
  }

}