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
    int n = sc.nextInt();
    List <Integer> aa = new LinkedList <Integer> ();
    aa.add(1);aa.add(1);aa.add(2);aa.add(3);aa.add(5);
    int i = 4;
    while (aa.get(i-1) < n) {
        aa.add(aa.get(i)+aa.get(i-1));
        i++;
    }
    if (aa.contains(n)) {
        pw.println(1);
        for (int j = 0; j < aa.size(); j++) {
            if (aa.get(j).equals(n)) {
                pw.print(j+1);
                break;
            }         
        }
    }
    else pw.println(0);
    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
    pw.close();
  }
}