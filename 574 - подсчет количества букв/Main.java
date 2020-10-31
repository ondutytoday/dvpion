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
    String s = "";
    String alphabet = "";
     for(char ch='A';ch<='Z';ch++){
            alphabet+=ch;
        }
    int [] counter_s1 = new int [26];
    for (int i = 0; i < 26; i++) {
        counter_s1[i] = 0;
    }
    int [] counter_s2 = new int [26];
    for (int i = 0; i < 26; i++) {
        counter_s2[i] = 0;
    }
    String s1 = sc.nextLine();
    String s2 = sc.nextLine();
 
    for (int  i = 0; i < s1.length(); i++) {
        counter_s1[s1.charAt(i) - 'A']++;
    }
    for (int  i = 0; i < s2.length(); i++) {
        counter_s2[s2.charAt(i) - 'A']++;
    }
    boolean abbrev = true;
    for (int i = 0; i < 26; i++) {
        if (counter_s1[i] != counter_s2[i]){ abbrev = false; break;}
    }
    if(abbrev) s = "YES";
    else s = "NO";
	//Конец
    
    pw = new PrintWriter(new File("output.txt"));
    pw.print(s);
    pw.close();
    }
}