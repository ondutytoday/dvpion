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
    int n = sc.nextInt();
    int sum = 0;
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }
    for (int i: arr) {
        if(i > 0) sum +=i;
    }
    int prod = 1;
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    int max_idx = -1;
    int min_idx = -1;
    for (int i = 0; i < n; i++) {
        if (arr[i] > max) {
            max = arr[i];
            max_idx = i;
        }
    }
    for (int i = 0; i < n; i++) {
        if (arr[i] < min) {
            min = arr[i];
            min_idx = i;
        }
    }
    if (Math.abs(max_idx - min_idx) == 1) prod = 0;
    else if(max_idx > min_idx) {
        for(int i = min_idx+1; i < max_idx; i++) {
            prod *=arr[i];
        }
    } else if (max_idx < min_idx) {
        for(int i = max_idx+1; i < min_idx; i++) {
            prod *=arr[i];
        }
    }

	//Конец
    
    pw = new PrintWriter(new File("output.txt"));
    pw.print(sum + " " + prod);
    pw.close();

    }
}