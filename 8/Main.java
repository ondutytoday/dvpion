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
    
	//������
	int a = sc.nextInt();
	int b = sc.nextInt();
        int c = sc.nextInt();
        String s = "";
        if (a*b == c) s = "YES";
        else s = "NO";
        	
	//�����
    pw = new PrintWriter(new File("output.txt"));
    pw.print(s);
    pw.close();
  }
}