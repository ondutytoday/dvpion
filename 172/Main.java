import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {

    public static void main(String[] argv) throws IOException{
    new Main().run();
    }
    PrintWriter pw;
    Scanner sc;

    public void run() throws IOException{
    sc = new Scanner(new File("input.txt"));
        //������
    String n = sc.next();
    String m = sc.next();
    String s = "";

    BigInteger a = new BigInteger (n);
    BigInteger b = a.mod( new BigInteger (m));

    
	//�����
    pw = new PrintWriter(new File("output.txt"));    
    pw.print(b);
    pw.flush();
  }
}