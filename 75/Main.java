
import java.io.*;
import java.math.BigInteger;
import java.util.Scanner;

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
    BigInteger a = new BigInteger("45");
    a = a.pow(n);
	//Конец
    pw = new PrintWriter(new File("output.txt"));    
    pw.print(a);
    System.out.println(a);
    pw.flush();
  }
}