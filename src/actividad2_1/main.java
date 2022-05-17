package actividad2_1;

import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []ar1= SumaArray.llenarArrayAleatorio(1, 5, 5);
		int []ar2= SumaArray.llenarArrayAleatorio(1, 5, 5);
		
		System.out.println("Array 1 "+ Arrays.toString(ar1));
		System.out.println("Array 2 "+ Arrays.toString(ar2));
		
		System.out.println("Suma: "+ SumaArray.sumArray(ar1,ar2,ar1.length-1));
		System.out.println("Multiplicación: "+ SumaArray.mulArray(ar1,ar2,ar1.length-1));
	}

}
