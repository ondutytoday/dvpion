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
    	//Начало
   int n = sc.nextInt();
   int m = 0;
   if (n%2 == 0) {
       m = n/2;
   } else  if (n ==1) m = 0;
   else m = n;
	//Конец
    
    pw = new PrintWriter(new File("output.txt"));
    pw.print(m);
    pw.close();

    System.out.print(m);
    
    }

}

