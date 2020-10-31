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
    int r1 = sc.nextInt();
    int r2 = sc.nextInt();
    int r3 = sc.nextInt();
    String s = "";
    if ((r2 + r3) <= r1) s = "YES";
    else s = "NO";
	//Конец
    
    pw = new PrintWriter(new File("output.txt"));
    pw.print(s);
    pw.close();

    }
}