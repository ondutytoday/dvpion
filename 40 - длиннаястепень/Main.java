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
        //Начало
    int n = sc.nextInt();
    BigInteger b = new BigInteger ("2");
    BigInteger s = b.pow(n);

	//Конец
    pw = new PrintWriter(new File("output.txt"));    
    pw.print(s);
    pw.flush();
  }
}