import java.util.*;
import java.io.*;
import java.math.BigDecimal;

public class Main {

    public static void main(String[] argv) throws IOException{
    new Main().run();
    }
    PrintWriter pw;
    Scanner sc;

    public void run() throws IOException{
    sc = new Scanner(new File("input.txt"));
        //Начало
    String n = sc.next();
    String m = sc.next();
    String s = "";

    BigDecimal a = new BigDecimal (n);
    BigDecimal b = new BigDecimal (m);

    if (a.compareTo(b) == 0) s = "=";
    if (a.compareTo(b) < 0) s = "<";
    if (a.compareTo(b) > 0) s = ">";
	//Конец
    pw = new PrintWriter(new File("output.txt"));    
    pw.print(s);
    pw.flush();
  }
}