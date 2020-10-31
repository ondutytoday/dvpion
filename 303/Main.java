import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] argv) throws IOException{
    new Main().run();
  }

  PrintWriter pw;
  Scanner sc;
  
  public void run() throws IOException{
    ///////////////////////////////////////////////////////////////////////
    sc = new Scanner(new File("input.txt"));
    pw = new PrintWriter(new File("output.txt"));
    ////////////////////////////////////////////////////////////////////////////
    String N = sc.nextLine();
    int max = Integer.MIN_VALUE;
    
    for (int i = 0; i < N.length(); i++) {
        int temp = 0;
        boolean b = true;
        for (int j = 0; j < N.length(); j++) {
            if (j!=i) {
                if (b) {
                    temp+=Integer.parseInt(Character.toString(N.charAt(j)));
                    b= false;
                }
                else {
                    temp-=Integer.parseInt(Character.toString(N.charAt(j)));
                    b = true;
                }
            }
            
        }
        if (temp > max) max = temp;
    }
    pw.print(max);
    ///////////////////////////////////////////////////////////////////////////
    pw.close();
  }
} 