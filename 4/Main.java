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
	int b = 9-a;
        String s = a + "9" + b;
        	
	//�����
    pw = new PrintWriter(new File("output.txt"));
    pw.print(s);
    pw.close();
  }
}