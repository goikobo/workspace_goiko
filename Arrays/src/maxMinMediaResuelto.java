import java.util.Arrays;


public class maxMinMediaResuelto {

	public static void main(String[] args) {
		int[] arrayNums = new int[20];
		
		for (int i = 0; i<arrayNums.length;i++){
			arrayNums[i] = (int)(Math.random()*50 + 1);
		}
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int suma =0;
		
		for (int i = 0; i<arrayNums.length;i++){
			if (arrayNums[i]>max){
				max = arrayNums[i];
			}
			if (arrayNums[i]<min){
				min = arrayNums[i];
			}
			//suma = suma + arrayNums[i];
			suma += arrayNums[i];
		}
		
		for (int i = 0; i<arrayNums.length;i++){
			System.out.print(arrayNums[i]+" ");
		}
		System.out.println("el m�ximo es:"+max);
		System.out.println("el m�nimo es:"+min);
		System.out.println("la media es:"+suma / arrayNums.length);
		
	}

}
