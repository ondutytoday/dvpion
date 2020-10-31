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

    final int N = sc.nextInt();
    final int BID = sc.nextInt()-1;
    String s = "No";
    
    ArrayList <LinkedList <Integer>> list = new ArrayList <LinkedList <Integer>> ();
    for (int i = 0; i<N; i++) {
        list.add(new LinkedList <Integer> ());
    }    
    int l, f;
    for (;;){
      l = sc.nextInt();
      if (l ==0) break;
      f = sc.nextInt();
      list.get(l-1).add(f-1); 
    }
    
    LinkedList <Integer> target = list.get(BID);
    Queue <Integer> qu = new LinkedList <Integer> ();
    qu.add(BID);
    while (!qu.isEmpty()) {
        LinkedList <Integer> t = list.get(qu.peek());
        for (int i = 0; i <t.size(); i++) {
            if (!target.contains(t.get(i))) {
                target.add(t.get(i));
                qu.add(t.get(i));
            }
        }
        qu.remove();
    }            
    if (target.size() == N-1) s = "Yes";
    pw = new PrintWriter(new File("output.txt"));
    pw.println(s);
    System.out.println (s);
    pw.close();
  }
}