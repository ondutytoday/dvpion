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
    int result = 0;
    int n = sc.nextInt();
	double [] [] coord = new double [n] [10];
    for (int i = 0; i < n; i++) {
        for (int j = 0; j <10; j++) {
            coord[i][j] = sc.nextDouble();
        }
    }
	double s_rect;
	double s_tri1;
	double s_tri2;
	double s_tri3;
	double s_tri4;
	double sum;
	for (int i = 0; i< n; i++) {
		//площадь прямоугольника
		s_rect = (Math.sqrt(Math.pow(coord[i][5] - coord[i][3],2) + Math.pow(coord[i][4] - coord[i][2],2)))*
					 (Math.sqrt(Math.pow(coord[i][7] - coord[i][5],2) + Math.pow(coord[i][6] - coord[i][4],2)));
		//площадь треугольников
		s_tri1 = (Math.abs((coord[i][4]-coord[i][2])*(coord[i][1] - coord[i][3]) - (coord[i][0] - coord[i][2])*(coord[i][5] - coord[i][3])))/2;
		s_tri2 = (Math.abs((coord[i][6]-coord[i][4])*(coord[i][1] - coord[i][5]) - (coord[i][0] - coord[i][4])*(coord[i][7] - coord[i][5])))/2;
		s_tri3 = (Math.abs((coord[i][8]-coord[i][6])*(coord[i][1] - coord[i][7]) - (coord[i][0] - coord[i][6])*(coord[i][9] - coord[i][7])))/2;
		s_tri4 = (Math.abs((coord[i][8]-coord[i][2])*(coord[i][1] - coord[i][3]) - (coord[i][0] - coord[i][2])*(coord[i][9] - coord[i][3])))/2;
		sum =   s_tri1 + s_tri2 + s_tri3 + s_tri4;
 
		 //проверка на принадлежность точки отрезку
		 boolean o1 =otrezok (coord[i][0], coord[i][1], coord[i][2], coord[i][3], coord[i][4], coord[i][5]);
		 
		 //если прямоугольник == точке
		if (coord[i][0]==coord[i][2] &&
                coord[i][0]==coord[i][4] &&
                coord[i][0]==coord[i][6]  &&
                coord[i][0]==coord[i][8] &&
                coord[i][1]==coord[i][3] &&
                coord[i][1]==coord[i][5] &&
                coord[i][1]==coord[i][7] &&
                coord[i][1]==coord[i][9]) result++;
		//если прямоугольник == отрезку
		else if (o1) result++;
		// если прямоугольник == тру-прямоугольник
		else if (s_rect !=0 && Math.abs(s_rect - sum)<0.01) result++;

	}
	//Конец
    
    pw = new PrintWriter(new File("output.txt"));
    pw.print(result);
    pw.close();

    System.out.print (result);
    }

  boolean otrezok (double x, double y, double x1, double y1, double x2, double y2) {
      boolean naotrezke = false;
      double a = Math.sqrt(Math.pow(y2 - y,2) + Math.pow(x2-x,2));
      double b = Math.sqrt(Math.pow(y2 - y,2) + Math.pow(x2-x,2));
      double c = Math.sqrt(Math.pow(y2 - y1,2) + Math.pow(x2-x1,2));
      if ( Math.abs(a+b-c)<0.01)naotrezke = true;            
      return naotrezke;
  }
}