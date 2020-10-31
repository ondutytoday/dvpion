import java.io.*;
import java.math.BigInteger;

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
       int m = nextInt();
       BigInteger n = new BigInteger ("1");
       BigInteger k;
       for (int i = 2; i <= m; i++ ) {
           k = n.multiply(new BigInteger(Integer.toString(i)));
           n = k;
       }
       out.print(n);
       System.out.print(n);
        
         
   }
}