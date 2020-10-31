import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] argv) throws IOException{
    new Main().run();
    }
    PrintWriter pw;
    Scanner sc;
    String s = "";

    public void run() throws IOException{
    sc = new Scanner(new File("input.txt"));
        //Начало
    s = sc.nextLine();
    String answer = "";
    if (isNotTrue()
            || isFirstChar ()
            || isLastChar ()
            || isDoubleChar ()
            || (s.contains("_") && isBig())) {
        answer = "Error!";
    } else {
        if (!s.contains("_") && !isBig()) {
            answer = s;
        } else
        if (!s.contains("_") && isBig()) {
            for (int i = 0; i < s.length(); i++) {

                if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                    answer = answer + "_" + Character.toString((char) (s.charAt(i) + 32));
                    continue;
                }
                answer +=Character.toString(s.charAt(i));
            }
        } else
        if (s.contains("_") && !isBig()) {
            for (int i = 0; i < s.length(); i++) {

                if (s.charAt(i) == '_') {
                    answer = answer + Character.toString((char) (s.charAt(i+1) - 32));
                    ++i;
                    continue;
                }
                answer +=Character.toString(s.charAt(i));
            }
        }
    }

	//Конец
    pw = new PrintWriter(new File("output.txt"));

    pw.print(answer);
    System.out.println(answer);
    pw.flush();
  }

    boolean isBig () {
        for (char i = 'A'; i <= 'Z'; i++) {
           if(s.contains(Character.toString(i))) {
               return true;
           }

        }
        return false;
    }


    boolean isNotTrue () {
        for (int i = 0; i <s.length(); i++) {
            if (s.charAt(i) != '_' && (s.charAt(i) < 'A' ||
                    s.charAt(i) > 'z' ||
                    (s.charAt(i) > 'Z' && s.charAt(i) < 'a')))
                return true;
        }
        return false;
    }
    boolean isNotTrueChar (char ch) {

            if (ch != '_' && (ch < 'A' ||
                    ch > 'z' ||
                    (ch > 'Z' && ch < 'a')))
                return true;
        return false;
    }
    boolean isFirstChar () {

            if (isNotTrueChar(s.charAt(0))
                    || s.charAt(0) == '_'
                    || (s.charAt(0) >= 'A'
                    && s.charAt(0) <= 'Z'))
                return true;

        return false;
    }
    boolean isLastChar () {

            if (isNotTrueChar(s.charAt(s.length()-1))
                    || s.charAt(s.length()-1) == '_')
                return true;

        return false;
    }
    boolean isDoubleChar () {

     for (int i = 0; i < s.length()-1;i++) {
         if (s.charAt(i)== '_' && s.charAt(i+1)== '_')
         return true;
     }
     return false;
    }

}