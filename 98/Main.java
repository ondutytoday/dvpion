import java.util.*;
import java.io.*;
import java.lang.Integer;

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
    ArrayList <Integer> array= new ArrayList <Integer>();

    for (int i = 0; i < n; i++) {
        array.add(i, sc.nextInt());
    }
    long a = 0;
    long b = 0;
    int t = 0;

    while (!array.isEmpty()) {
        if (t%2 == 0) {
            if (array.get(0) < array.get(array.size()-1)) {
                a+= (long) array.get(array.size()-1);
                array.remove(array.size()-1);
                t++;
            } else {
                a+= (long) array.get(0);
                array.remove(0);
                t++;
            }
        } else {
            if (array.get(0) < array.get(array.size()-1)) {
                b+= (long) array.get(array.size()-1);
                array.remove(array.size()-1);
                t++;
            } else {
                b+= (long) array.get(0);
                array.remove(0);
                t++;
            }
        }
    }

    
	//Конец
    pw = new PrintWriter(new File("output.txt"));    
    pw.print(a + ":" + b);
    pw.flush();
  }
}