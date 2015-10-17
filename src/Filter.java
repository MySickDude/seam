
/**
 * @author Alexia BOGAERT & Sacha KOZMA
 */
public final class Filter {

	/**
	 * Get a pixel without accessing out of bounds
	 * @param gray a HxW float array
	 * @param row Y coordinate
	 * @param col X coordinate
	 * @return nearest valid pixel color
	 */
	public static float at(float[][] gray, int row, int col) {
		if (row < 0) {
			row = 0;
		} else if (row > (gray.length -1 )){
			row = (gray.length - 1);
		}

		if (col < 0){
			col = 0;
		} else if (col > (gray[0].length - 1)) {
			col = (gray[0].length - 1);
		}
		return gray[row][col];
	}

	/**
	 * Convolve a single-channel image with specified kernel.
	 * @param gray a HxW float array
	 * @param kernel a MxN float array, with M and N odd
	 * @return a HxW float array
	 */
	public static float[][] filter(float[][] gray, float[][] kernel) {
		float[][] filtered = new float [gray.length][gray[0].length];

		for (int i = 0; i < filtered.length; i++) {
			for (int j = 0; j < filtered[0].length; j++) {


				for (int p = i - (kernel.length / 2), q = 0; q < kernel.length; p++, q++) {
					for (int r = j - (kernel.length / 2), s = 0; s < kernel[0].length; r++, s++) {

						filtered[i][j] += at(gray,p,r) * kernel[q][s];

					}
				}


			}
		}

		return filtered;
	}

	/**
	 * Smooth a single-channel image
	 * @param gray a HxW float array
	 * @return a HxW float array
	 */
	public static float[][] smooth(float[][] gray) {
		float[][] smooth = {{0.1f, 0.1f, 0.1f},{0.1f, 0.2f, 0.1f}, {0.1f,0.1f,0.1f}};
		return filter(gray, smooth);
	}

	/**
	 * Compute horizontal Sobel filter
	 * @param gray a HxW float array
	 * @return a HxW float array
	 */
	public static float[][] sobelX(float[][] gray) {
		float[][] sobelX = {{-1.0f, 0.0f, 1.0f},{-2.0f, 0.0f, 2.0f}, {-1.0f,0f,1.0f}};
		return filter(gray, sobelX);
	}

	/**
	 * Compute vertical Sobel filter
	 * @param gray a HxW float array
	 * @return a HxW float array
	 */
	public static float[][] sobelY(float[][] gray) {
		float[][] sobelY = {{-1.0f, -2.0f, -1.0f},{0.0f, 0.0f, 0.0f}, {1.0f,2.0f,1.0f}};
		return filter(gray, sobelY);
	}

	/**
	 * Compute the magnitude of combined Sobel filters
	 * @param gray a HxW float array
	 * @return a HxW float array
	 */
	public static float[][] sobel(float[][] gray) {
		float[][] sobel = new float [gray.length][gray[0].length];
		float[][] sobelX = sobelX(gray);
		float[][] sobelY = sobelY(gray);
				
		for (int i = 0; i < gray.length; i++) {
			for (int j = 0; j < gray[0].length; j++) {
				sobel[i][j] = (float)(Math.sqrt((sobelX[i][j] * sobelX[i][j]) + (sobelY[i][j]*sobelY[i][j])));
			}
		}

	
		
		return sobel;
	}

}
