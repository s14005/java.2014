import java.util.Scanner;
import java.util.Random;

abstract class Ex {
	abstract void execute();
}

class Ex2_0 extends Ex{
	void execute(){
		int x;
		int y;

		x = 63;
		y = 18;

		System.out.println("xの値は" + x + "です。");
		System.out.println("yの値は" + y + "です。");
		System.out.println("合計は" + (x + y) + "です。");
		System.out.println("平均は" + (x + y) / 2 + "です。");
	}
}

class Ex2_1 extends Ex{
         void execute(){
                 double x;
                 double y;
 
                 x = 63;
                 y = 18;
 
                 System.out.println("xの値は" + x + "です。");
                 System.out.println("yの値は" + y + "です。");
                 System.out.println("合計は" + (x + y) + "です。");
                 System.out.println("平均は" + (x + y) / 2 + "です。");         }
   }
class Ex2_2 extends Ex{                                                      
          void execute(){
                  int x;
                  int y;
                  int z;
      
                  x = 63;
                  y = 18;
                  z = 6;

                  System.out.println("xの値は" + x + "です。");
                  System.out.println("yの値は" + y + "です。");
                  System.out.println("zの値は" + z + "です。");
                  System.out.println("合計は" + (x + y + z) + "です。");
                  System.out.println("平均は" + (x + y + z) / 2 + "です。");          }
         }      
 class Ex2_3 extends Ex{                                                  
   void execute(){
   Scanner stdIn = new Scanner(System.in);

         System.out.print("整数値:");
         int a = stdIn.nextInt();
        
         System.out.println(a);
          }
          }
class Ex2_4 extends Ex{
void execute(){
Scanner stdIn = new Scanner(System.in);

System.out.print("整数値:");
int a = stdIn.nextInt();

System.out.println(a - 10);
System.out.println(a + 10);
}
}
class Ex2_5 extends Ex{
void execute(){
Scanner stdIn = new Scanner(System.in);

System.out.println("xの値");
int x = stdIn.nextInt();

System.out.println("yの値");
int y = stdIn.nextInt();

System.out.println((x + y) + "和");
System.out.println((x + y)/2 + "平均");
}
}
class Ex2_6 extends Ex{
void execute(){
Scanner stdIn = new Scanner(System.in);

System.out.println("底辺");
double x = stdIn.nextDouble();

System.out.println("高さ");
double y = stdIn.nextDouble();

System.out.println((x*y/2)+"三角形の面積");
}
}

class Ex2_7 extends Ex{
void execute(){
Random rand = new Random();
int x = rand.nextInt(9);
x = x + 1;
int y = rand.nextInt(9);
y = y - 9;
int z = rand.nextInt(90);
z = z + 10;
System.out.println(x + "です。");
System.out.println(y + "です。");
System.out.println(z + "です。");
}
}

class Ex2_8 extends Ex{
void execute(){
Random rand = new Random();
int r  = rand.nextInt(11);
r = r - 5;

Scanner stdIn = new Scanner(System.in);   
System.out.print("整数値:");
int s = stdIn.nextInt();
s = r + s;
System.out.println(s + "です。");
}
}

class Ex2_9 extends Ex{
void execute(){
Random rand = new Random();
double x = rand.nextDouble();
int y = rand.nextInt(10);
int z = rand.nextInt(2);
System.out.println(x + "です。");
System.out.println(x + y + "です。");
System.out.println((x - 1) + z + "です。");
}
}

class Ex2_10 extends Ex{
void execute(){
Scanner stdIn = new Scanner(System.in);
System.out.print("姓");
String x = stdIn.next();
System.out.print("名");
String y = stdIn.next();
System.out.println("こんにちは" + x + y + "さん。");
}
}
      public class Ex2 {
	public static void main(String[] args){
		Ex a;
		a = new Ex2_0();
		a.execute();
                a = new Ex2_1();
                a.execute();
                a = new Ex2_2();
                a.execute();
                a = new Ex2_3();
                a.execute();
                a = new Ex2_4();
                a.execute();
                a = new Ex2_5();
                a.execute();
                a = new Ex2_6();
                a.execute();
	        a = new Ex2_7();
                a.execute();
                a = new Ex2_8();
                a.execute();
                a = new Ex2_9();
                a.execute();
                a = new Ex2_10();
                a.execute();
        }
        }

