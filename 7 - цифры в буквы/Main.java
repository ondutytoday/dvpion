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
    String a1 = sc.next();
    String a2 = sc.next();
    String a3 = sc.next();
    String s = "";
    if (a1.length() > a2.length() && a1.length() > a3.length()) s = a1;
    if (a2.length() > a1.length() && a2.length() > a3.length()) s = a2;
    if (a3.length() > a1.length() && a3.length() > a2.length()) s = a3;
    if (a1.length() == a2.length() && a1.length() > a3.length()) {
        if (a1.equals(a2)) s = a1; 
        else {
        for (int i = 0; i < a1.length(); i++) {
            if (a1.charAt(i) > a2.charAt(i)) {
                s = a1; break;
            }
            else if (a2.charAt(i) > a1.charAt(i)) {
                s = a2; break;
            }            
        }
        }
    }
    if (a1.length() == a3.length() && a1.length() > a2.length()) {
        if (a1.equals(a3)) s = a1;
        else {
        for (int i = 0; i < a1.length(); i++) {
            if (a1.charAt(i) > a3.charAt(i)) {
                s = a1; break;
            }
            else if (a3.charAt(i) > a1.charAt(i)) {
                s = a3; break;
            }
        }
        }
    }

    if (a2.length() == a3.length() && a2.length() > a1.length()) {
        if (a2.equals(a3)) s = a2;
        else {
        for (int i = 0; i < a2.length(); i++) {
            if (a3.charAt(i) > a2.charAt(i)) {
                s = a3; break;
            }
            else if (a2.charAt(i) > a3.charAt(i)) {
                s = a2; break;
            }
        }
        }
    }

    if (a2.length() == a3.length() && a2.length() == a1.length()) {
        if (a1.equals(a2) && a1.equals(a3)) s = a1;
        else {
        for (int i = 0; i < a2.length(); i++) {
            if (a3.charAt(i) > a2.charAt(i) && a3.charAt(i) > a1.charAt(i)) {
                s = a3; break;
            }
            else if (a2.charAt(i) > a1.charAt(i) && a2.charAt(i) > a3.charAt(i)) {
                s = a2; break;
            }
            else if (a1.charAt(i) > a2.charAt(i) && a1.charAt(i) > a3.charAt(i)) {
                s = a1; break;
            }
        }
        }
        
    }



	//Конец
    
    pw = new PrintWriter(new File("output.txt"));
    pw.print(s);
    pw.close();
   
  }
}