
import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] argv) throws IOException{
    new Main().run();
    }
    PrintWriter pw;
    Scanner sc;

    public void run() throws IOException{
    sc = new Scanner(new File("input.txt"));
        //Начало
    String s = sc.nextLine();
    String number = "";
    String answer = "";
    String realAnswer = "";
    long n = 1;
    for (int i = 0; i < s.length(); i++) {

        if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            number += Character.toString(s.charAt(i));
            n = Long.parseLong(number);
            if (n == 0) n =1;
        }

        if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
            for (long j = 0; j< n; j++) {
                answer += Character.toString(s.charAt(i));                
            }
            number = "";
            n = 1;
        }
    }
    for (int j = 0; j< answer.length(); j++) {
        realAnswer += Character.toString(answer.charAt(j));
                if (j!=0 && (j+1)%40 ==0) {
                    realAnswer += "\n";
                }
    }

	//Конец
    pw = new PrintWriter(new File("output.txt"));

    pw.print(realAnswer);
    System.out.println(realAnswer);
    pw.flush();
  }
}