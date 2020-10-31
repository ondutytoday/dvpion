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
       int a = nextInt(), b, k = 0;
       for (int i = 0; i < a*a; i++) {
           b = nextInt();
           if (b == 1) k++;
       }
       int n = k/2;
       
       out.print(n);
        System.out.print(n);
        
         
   }
}