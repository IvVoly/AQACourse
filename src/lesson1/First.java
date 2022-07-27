package lesson1;

class First{
	public static void main(String[] args){
		
		System.out.println("My first task!!!");  //1
		
		final double POINTS = 32.0; // 6. constants
		final int NUMOFCOINS= 13;    // Error cannot assign a value
		int totalPoints = (int) POINTS*NUMOFCOINS;
		System.out.println("total points: " + totalPoints);
		
		byte alfa = 1;  //2. primitives types
		short beta = 456;
		int gamma = 68794;
		long zetta = 123L;
		float omega = 3.14f;
		double iny = 5.23434;
		char two = 'H';
		boolean keyOn = true;
	
		int a = 14; //3 Try to assign a value to it that doesn't match the allowed range. What happened? = Error integer number too large
		
		int hello = 72+101+108+108+111; // 5.  "Hello" in unicode ASCII
		char h = 'H';
		char e = 'e';
		char l = 'l';
		char o = 'o';
		System.out.println("test of Hello in unicode :" + (h+e+l+l+o)+" = "+hello);
		
		
		int[] b = new int[10];   //7.
		System.out.println("length array b = " + b.length);  
		
		double[] w = {21.3,45.6,78.3,56.1,90.12}; //8.
		double wFirst = w[0];
		double wLast = w[w.length-1];
		System.out.println("First and last element of array w: " + wFirst+" "+wLast);	
	}
}