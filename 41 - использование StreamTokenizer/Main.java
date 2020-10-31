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
       int n = nextInt();
        int [] temperature = new int [n];
       
        for(int i = 0; i < n; i++) {
            temperature [i] =  nextInt();
        }

        Arrays.sort(temperature);
       
        for (int i = 0; i < n; i++) {
           
               out.print( temperature [i] + " ");
        }
         
   }
}