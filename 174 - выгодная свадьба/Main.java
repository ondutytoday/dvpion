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
    double [] bablo = new double [n];
    //заполняю массив
    for (int i =0; i < n; i++) {
            bablo[i] = sc.nextDouble();
    }
    //начальный капитал
    double begin = sc.nextDouble();
    //конечный
    double end = 0;
    Arrays.sort(bablo);
    //если все женихи беднее
    if (begin > bablo[n-1]) end = begin;
    else {
            int m = 0;
            //убираем бедных
            for (int i = 0; i < n; i++) {
                if (bablo [i] <= begin) bablo [i] = 0;
            }
              for (int i = 0; i < n; i++) {
                if (bablo [i] == 0) m++;
            }
           double [] new_bablo = new double [n-m];
           int j = 0;
           for(double i : bablo) {               
               if(i != 0) {
                   new_bablo[j] = i;
                   j++;
               }          
           }
           //подсчитываем денюжкэ
           for (int i = 0; i < n-m; i ++) {
            end = (begin + new_bablo[i])/2;
            begin = end;
            }
    }

	//Конец
    
    pw = new PrintWriter(new File("output.txt"));
    pw.printf("%.6f ", end);
    pw.close();

    System.out.printf("%.6f ", end);
    
    }

}

