import java.util.*;
import java.io.*;

public class Main{ //имя класса должно быть Main
  public static void main(String[] argv) throws IOException{
    new Main().run();
  }
  PrintWriter pw;
  Scanner sc;
  public void run() throws IOException{
    sc = new Scanner(new File("input.txt"));
    int a=sc.nextInt();
	//Начало
	
	int b = 0;
	if(a>0) {	
		b = (1+a)*a/2;
	}
	if(a==0) b = 1;
	if(a<0) {
		for(int i = a; i <=1; i++) {
			b+=i;
		}
	}	
	
	//Конец
    pw = new PrintWriter(new File("output.txt"));
    pw.print(b);
    pw.close();
  }
}