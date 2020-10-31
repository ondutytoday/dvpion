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
    int [][] ms = new int[N][N];    
    
    for (int i = 0; i< N; i++) {
        for (int j=0; j<N; j++) {
            ms[i][j] = sc.nextInt();
        }
    }
    
    int [] clr = new int [N];
    
    for (int i = 0; i< N; i++) {
        clr[i] = sc.nextInt();
    }
    
    int t = 0;
    
    for (int i = 0; i< N; i++) {         
        for (int j=0; j<N; j++) {
            if (ms[i][j]==1 && clr[i] != clr[j])
                t++;
        }         
    }
    
    
    pw = new PrintWriter(new File("output.txt"));
    pw.print(t/2);
    System.out.print(t/2);
    pw.close();
  }
}