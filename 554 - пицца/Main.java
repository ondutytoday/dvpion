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
    int m = 0;
    int n = sc.nextInt();

    for (int i = 1; i <= n-2; i++) {
        m +=i;
    }
   
	//Конец
    
    pw = new PrintWriter(new File("output.txt"));
    pw.print(m +2*n);
    pw.close();

    System.out.print (m +2*n);
    }
}