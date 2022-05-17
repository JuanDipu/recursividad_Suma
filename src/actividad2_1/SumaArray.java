package actividad2_1;

import java.util.Random;

public class SumaArray {
	
	 public static int[] llenarArrayAleatorio(int desde, int hasta, int tam) {
	        int[] numeros = new int[tam];
	        Random rnd = new Random();
	        for (int i = 0; i < numeros.length; i++) {
	            numeros[i] = rnd.nextInt(hasta - desde + 1) + desde;
	        }
	        return numeros;
	    }
	
	public static int sumArray(int[]array1,int []array2,int tam) {
		int suma=0;
		
		if (tam==0) {
			return array1[tam]+array2[tam];
		}else {
			suma=array1[tam]+array2[tam]+sumArray(array1,array2,tam-1);
		}
		
		return suma;
		
	}
	
	public static int mulArray(int[]array1,int []array2,int tam) {
		int mul=0;
		
		if (tam==0) {
			return array1[tam]*array2[tam];
		}else {
			mul=array1[tam]*array2[tam]*mulArray(array1,array2,tam-1);
		}
		
		return mul;
		
	}

}
