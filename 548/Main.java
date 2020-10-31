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
    s+=sc.nextLine();
    char [] ch = s.toCharArray();
    Arrays.sort(ch);
    
    
    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
    //System.out.print (n + " " + a);
    for (int i =0; i < ch.length; i++){
        pw.print(ch[i]);
    }
    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
    pw.close();
  }
}
