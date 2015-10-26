public class Utils {

	/**
	 * Print array in console
	 * @param array to be displayed
	 */
	public static void displayArray(float[][] tableau) {
		for (int i = 0; i < tableau.length; i++) {
			for (int j = 0; j < tableau[i].length; j++) {
				System.out.print("| " + tableau[i][j] + " | ");
			}
			System.out.println();

		}
	}

	/**
	 * Print array in console
	 * @param array to be displayed
	 */
	public static void displayArray(int[][] tableau) {
		for (int i = 0; i < tableau.length; i++) {
			for (int j = 0; j < tableau[i].length; j++) {
				System.out.print("| " + tableau[i][j] + " | ");
			}
			System.out.println();

		}
	}

	/**
	 * Print array in console
	 * @param array to be displayed
	 */
	public static void displayArray(float[] tableau) {
		for (int j = 0; j < tableau.length; j++) {
			System.out.println("| " + tableau[j] + " | ");

		}

	}

	/**
	 * Print array in console
	 * @param array to be displayed
	 */
	public static void displayArray(int[] tableau) {
		for (int j = 0; j < tableau.length; j++) {
			System.out.println("| " + tableau[j] + " | ");

		}
	}

	/**
	 * Round value to the limits
	 * @param max value
	 * @param min value
	 * @param value to be rounded
	 * @return rounded value
	 */
	public static float roundToLimits (float max, float min, float valeur){
		if (valeur < min) {
			valeur = min;
		} else if (valeur > max){
			valeur = max;
		}

		return valeur;
	}


}
