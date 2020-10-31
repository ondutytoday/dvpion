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
    long a=sc.nextInt();
	//Начало

	long b = a*a;

	//Конец
    pw = new PrintWriter(new File("output.txt"));
    pw.print(b);
    pw.close();
  }
}