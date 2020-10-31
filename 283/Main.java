import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] argv) throws IOException{
    new Main().run();
  }

  PrintWriter pw;
  Scanner sc;
  
  public void run() throws IOException{
    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
    sc = new Scanner(new File("input.txt"));
    pw = new PrintWriter(new File("output.txt"));
    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
    String s = sc.nextLine();
    boolean b = true;
    int t = 0;
    List <Integer> aa = new ArrayList <Integer> ();
    for (int i = 0; i <s.length(); i++) {
        if (Character.isUpperCase(s.charAt(i))) {
            if (t!=0) aa.add(t);
            t =0;
        }
        t++; 
        if (i == s.length()-1 && Character.isLowerCase(s.charAt(i))) aa.add(t);
    }
    if (aa.size() == 0) b= false;
    else {
        for (Integer a: aa) {
            if (a <2 || a>4) {
                b = false; 
                break;
            }
        }
    }
    if (b) pw.print("Yes");
    else pw.print("No");
    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
    pw.close();
  }
}