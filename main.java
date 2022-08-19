package javaprogram;

public class main {

	public static void main(String[] args) {
		boolean t = true;
		byte b = 2;
	    short s = 100;
	    char c ='c';
	    int i = 200;
	    long l = 24000;
	    float f = 3.14f;
	    double d = 0.0000000053;
	    String g ="string";
	    System.out.println("value of the variable:");
	    System.out.println("t ="+ t);
	    System.out.println("b=" + b);
	    System.out.println("s ="+s);
	    System.out.println("c="+c);
	    System.out.println("i="+i);
	    System.out.println("l="+l);
	    System.out.println("f="+f);
	    System.out.println("d="+d);
	    System.out.println("g="+g);
	    System.out.println();
	    int sum = (int)(b+i+l+d+f);
	    System.out.println("value of the sum:" + sum);
	    int sub = (int)(b-i-l-d-f);
	    System.out.println("value of the sub:" + sub);
        int multi = (int)(b*i*l);
	    System.out.println("value of the multi:"+ multi);
	    int divide = (int)(b/b);
	    System.out.println("value of the divide:"+ divide);



		

	}

}
