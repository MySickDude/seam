public class Utils {

	public static void displayArray(float[][] tableau) {
		for (int i = 0; i < tableau.length; i++) {
			for (int j = 0; j < tableau[i].length; j++) {
				System.out.print("| " + tableau[i][j] + " | ");
			}
			System.out.println();

		}



	}
	
	public static void displayArray(int[][] tableau) {
		for (int i = 0; i < tableau.length; i++) {
			for (int j = 0; j < tableau[i].length; j++) {
				System.out.print("| " + tableau[i][j] + " | ");
			}
			System.out.println();

		}



	}
	
	public static void displayArray(float[] tableau) {
			for (int j = 0; j < tableau.length; j++) {
				System.out.println("| " + tableau[j] + " | ");

		}



	}
	
	public static void displayArray(int[] tableau) {
		for (int j = 0; j < tableau.length; j++) {
			System.out.println("| " + tableau[j] + " | ");

	}



}
	
	public static float roundToLimits (float max, float min, float valeur){
		if (valeur < min) {
			valeur = min;
		} else if (valeur > max){
			valeur = max;
		}
		
		return valeur;
	}
	
	
}
