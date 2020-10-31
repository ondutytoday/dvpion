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
    int m = sc.nextInt();
    int max = Integer.MAX_VALUE, min = Integer.MIN_VALUE;
    int [] t1 = new int [n];
    int [] t2 = new int [m];
    int [][] aa = new int [n][m];
    for (int i = 0; i < n; i++) {
        for (int j = 0; j <m; j++) {
            aa[i][j] = sc.nextInt();            
        }
    }
    
    for (int i = 0; i < n; i++) {
        for (int j = 0; j <m; j++) {
            if (aa[i][j] < max) max = aa[i][j];
        }
        t1[i] = max; 
        max = Integer.MAX_VALUE;
    }    
    
    for (int i = 0; i < m; i++) {
        for (int j = 0; j <n; j++) {
            if (aa[j][i] > min) min = aa[j][i];
        } 
        t2 [i] = min;
        min = Integer.MIN_VALUE;
    }
    
        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;
    for (int i = 0; i < n; i++) {
        if (t1[i] > max) max = t1[i];        
    }
    for (int i = 0; i < m; i++) {
        if (t2[i] < min) min = t2[i];
    }
    pw.print (max + " " + min);
    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
    pw.close();
  }
}