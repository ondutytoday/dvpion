import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] argv) throws IOException{
    new Main().run();
    }
    PrintWriter pw;
    Scanner sc;

    public void run() throws IOException{
    sc = new Scanner(new File("input.txt"));
    String a = sc.nextLine();

    char[] p = a.toCharArray();
    

    pw = new PrintWriter(new File("output.txt"));
    do {
      pw.println(p);

    } while (nextPermutation(p));
    pw.flush();
  }



  public static boolean nextPermutation(char[] p) {
    for (int a = p.length - 2; a >= 0; --a)
      if (p[a] < p[a + 1])
        for (int b = p.length - 1;; --b)
          if (p[b] > p[a]) {
            int t = p[a];
            p[a] = p[b];
            p[b] = (char) t;
            for (++a, b = p.length - 1; a < b; ++a, --b) {
              t = p[a];
              p[a] = p[b];
              p[b] = (char) t;
            }
            return true;
          }
    return false;
  }

}