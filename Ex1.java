abstract class Ex {
	abstract void execute();
}

class Ex1_0 extends Ex {
	void execute(){
		System.out.println("Hello World!");
	}
}

class Ex1_2 extends Ex {
	void execute(){
		System.out.println("古\n賀\n裕\n貴");
	}
}

class Ex1_3 extends Ex {
        void execute(){
                System.out.println("古\n賀\n\n裕\n貴");
        }
}


public class Ex1 {
	public static void main(String[] args){
		Ex a;
		a = new Ex1_0();
		a.execute();
		a = new Ex1_2();
		a.execute();
                a = new Ex1_3();
                a.execute();
	}
}
