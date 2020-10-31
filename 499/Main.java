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
    int K = sc.nextInt();
    int W = sc.nextInt();
    int [] a = new int [3];
    int [] b = new int [3];
    String s = "NO";
    
    for (int i = 0; i < 3; i++) {
       a[i] = sc.nextInt();
       b[i] = sc.nextInt();
    }
    for (int i = 0; i < 3; i++) {
        if (a[i] <= W && b[i] >=K) s = "YES";
    }
    if (((a[0]+a[1]) <= W && (b[0] + b[1]) >=K) ||
            ((a[0]+a[2]) <= W && (b[0] + b[2]) >=K) ||
            ((a[2]+a[1]) <= W && (b[2] + b[1]) >=K) ||
            ((a[0]+a[2]+a[1]) <= W && (b[0] + b[2] + b[1]) >=K))
            s = "YES";
    pw = new PrintWriter(new File("output.txt"));
    pw.println(s);
    System.out.append(s);
    pw.close();
  }
}