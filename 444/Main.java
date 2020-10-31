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
    int[] aa = new int [n];
    for (int i = 0; i < n; i++) {
        aa[i] = sc.nextInt();        
    }
    Arrays.sort(aa);
    pw.print(aa[0] + ", " + aa[1] + ", " + aa[2] + ", ..., " + aa[n-1]);
    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
    pw.close();
  }
}