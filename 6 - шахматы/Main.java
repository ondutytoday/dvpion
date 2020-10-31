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
    String result = "";   
    String s = sc.nextLine();
    if (s.length() == 5) {
    int a = s.charAt(0);
    int b = s.charAt(1);
    int c = s.charAt(3);
    int d = s.charAt(4);
    
    int n = (a-'A')*10 + b;
    int m = (c-'A')*10 + d;
    
    if (a < 'A' || a > 'H' || c < 'A' || c > 'H'
            || b < '1' || b > '8' || d < '1' || d > '8' || s.charAt(2) != '-'){
        result = "ERROR";
    } else if (Math.abs(m-n) == 12 || Math.abs(m-n) == 21 
            || Math.abs(m-n) == 19 || Math.abs(m-n) == 8) {
        result = "YES";
    } else result = "NO";
    }
    else result = "ERROR";
    
    pw = new PrintWriter(new File("output.txt"));
    pw.print(result);
    pw.close();
    
    }
}