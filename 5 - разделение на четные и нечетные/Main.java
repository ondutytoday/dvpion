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
    	//Начало
    int a=sc.nextInt();
    int[] days = new int[a];
    for (int i = 0; i < a; i++) {
        int b = sc.nextInt();
        days [i] = b;
    }

    int n = 0;
    for (int i = 0; i < a; i++) {
        if(days[i]%2 == 1) n++;
        }
    int[] odd = new int[n];
    int j = 0;
    for (int i = 0; i < a; i++) {
        if(days[i]%2 == 1) {
            odd[j] = days[i];
            j++;
        }                
        }
    int [] even = new int [a-n];
    int m = 0;
    for (int i = 0; i < a; i++) {
        if(days[i]%2 == 0) {
            even[m] = days[i];
            m++;
        }
        }
    String s = "";
    if (even.length >= odd.length)
        s = "YES";
    else s = "NO";

	//Конец
    pw = new PrintWriter(new File("output.txt"));
    for (int i: odd){
    pw.print(i + " ");
      }
    pw.println();
    for (int i: even){
    pw.print(i + " ");
      }
    pw.println();
    pw.print(s);
    pw.close();
  }

}