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

    int n = 30000;
    
    boolean [] m;
    m = getSieve(n);
    String s = "1";
    for (int i = 0; i < n; i++){
    if (m[i]) s+= Integer.toString(i);
    }
    
    int M = sc.nextInt();
    int NUM = 0;
    
    pw = new PrintWriter(new File("output.txt"));
    for (int i = 0; i < M; i++) {
        NUM = sc.nextInt();
        pw.print(s.charAt(NUM));
    }
    pw.close();
  }
  
  
  public boolean[] getSieve(int n) {
		boolean[] primes = new boolean[n + 1];
		Arrays.fill(primes, 2, n + 1, true);
		for (int i = 2; i * i <= n; i++) {
			if (primes[i]) {
				for (int k = i * i; k <= n; k += i) {
					primes[k] = false;
				}
			}
		}
		return primes;
	}
}