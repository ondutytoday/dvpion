import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] argv) throws IOException{
    new Main().run();
  }

   StreamTokenizer in;
   PrintWriter out;

   int nextInt() throws IOException
   {
      in.nextToken();
      return (int)in.nval;
   }

   void run() throws IOException
   {
      in = new StreamTokenizer(new BufferedReader(new FileReader(new File("input.txt"))));
      out = new PrintWriter(new File("output.txt"));
      solve();
      out.flush();
   }

   void solve() throws IOException
   {
       int a = nextInt();
       int b = nextInt();
       int c, n, m, nod;

       if (a < 0) n = 0-a; else n = a;
       if (b < 0) m = 0-b; else m = b;

       while (n*m>0) {
           if (n >= m) n = n%m;
           else m = m%n;
       }
       nod = n+m;
       
       c = a*b/nod;

        out.print(c);
        System.out.print(c);
        
         
   }
}