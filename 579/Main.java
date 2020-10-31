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
    
    int n = sc.nextInt();
    int [] array = new int[n];
    LinkedList <Integer> arPlus = new LinkedList <Integer> ();
    LinkedList <Integer> arMinus = new LinkedList <Integer> ();
    int sumPlus = 0;
    int sumMinus = 0;
    int idx = 0;
    for(int i =0; i < n; i++) {
        array[i] = sc.nextInt();
    }
    for (int i =0; i < n; i++) {
        if (array[i] < 0) arMinus.add(array[i]);
        else arPlus.add(array[i]);
    }
    for (int i =0; i < arPlus.size(); i++) {
        sumPlus +=arPlus.get(i);
    }
    
    for (int i =0; i < arMinus.size(); i++) {
        sumMinus += Math.abs(arMinus.get(i));
    }
    pw = new PrintWriter(new File("output.txt"));   
    if (sumPlus >= sumMinus) {
        pw.println(arPlus.size());
        for (int i =0; i < n; i++) {
            if (array[i] == arPlus.get(idx)) {
                pw.print((i+1) + " ");
                idx++;
                if (idx == arPlus.size()) break;
            }
        }
    } else {
        pw.println(arMinus.size());
        for (int i =0; i < n; i++) {
            if (array[i] == arMinus.get(idx)) {
                pw.print((i+1) + " ");
                idx++;
                if (idx == arMinus.size()) break;
            }
        }
    }
    pw.close();
  }
}