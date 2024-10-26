package operator;

public class Relationaloperator {

	public static void main(String[] args) {
		int x=10;
		int y=20;
		int z=30;
		int a=10;
		System.out.println("THE X VALUE IS : 10");
		System.out.println("THE Y VALUE IS : 20");
		System.out.println("THE Z VALUE IS : 30");
		System.out.println("THE A VALUE IS : 10");
		boolean exp1=x==y;
		System.out.println("THE EXPRESSION ( X==Y ) IS :"+exp1);
		boolean exp2=x==a;
		System.out.println("THE EXPRESSION ( X==A ) IS :"+exp2);
		boolean exp3=y<=z;
		System.out.println("THE EXPRESSION ( Y<=Z ) IS :"+exp3);
	}

}
