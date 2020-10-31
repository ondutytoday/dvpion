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
   GregorianCalendar date1 = new GregorianCalendar(n, 0,1);
  if ( n%4 !=0) {
       pw = new PrintWriter(new File("output.txt"));
   pw.printf("13/09/" + "%tY", date1);
   pw.close();
   System.out.printf ("13/09/" + "%tY", date1);
  }
  else  if (n%100 == 0 &&  n%400 != 0) {
   pw = new PrintWriter(new File("output.txt"));
   pw.printf("13/09/" + "%tY", date1);
   pw.close();
    System.out.printf ("13/09/" + "%tY", date1);
   } else {
       pw = new PrintWriter(new File("output.txt"));
   pw.printf("12/09/" + "%tY", date1);
   pw.close();
   System.out.printf ("12/09/" + "%tY", date1);
   }
   
}

}


