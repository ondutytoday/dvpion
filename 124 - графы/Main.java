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
    
    final int N = sc.nextInt();
    final int M = sc.nextInt();
    int [][] cr = new int[N][N];
    int a, b, m = 0;
    int [] asw = new int [N];
    for (int i = 0; i< N; i++) {
        for (int j=0; j<N; j++) {
            cr[i][j] = 0;
        }
    }
    while ( m<M) {
        a=sc.nextInt()-1;
        b=sc.nextInt()-1;
        cr[a][b] = 1;
        cr[b][a] = 1;
        m++;
    }
    for (int i = 0; i< N; i++) {
         int t = 0;
        for (int j=0; j<N; j++) {
            if (cr[i][j] == 1)  t++;
        }
        asw[i] = t;
    }
    
    
    pw = new PrintWriter(new File("output.txt"));
    for (int i = 0; i< N; i++) {
        pw.print(asw[i] + " ");
    }
    pw.close();
  }
}