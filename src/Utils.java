public class Utils {

	public static void AfficheTableau(float[][] tableau) {
		for (int i = 0; i < tableau.length; i++) {
			for (int j = 0; j < tableau[0].length; j++) {
				System.out.print("| " + tableau[i][j] + " | ");
			}
			System.out.println();

		}



	}
}
