
/**
 * @author Alexia BOGAERT & Sacha KOZMA
 */
public final class Color {

	/**
	 * Returns red component from given packed color.
	 * @param rgb 32-bits RGB color
	 * @return a float between 0.0 and 1.0
	 * @see #getGreen
	 * @see #getBlue
	 * @see #getRGB(float, float, float)
	 */
	public static float getRed(int rgb) {
		rgb = rgb >> 16;
		rgb = rgb & 0b11111111;

		float rgbFLOAT = rgb / 255.0f;

		return rgbFLOAT;
	}

	/**
	 * Returns green component from given packed color.
	 * @param rgb 32-bits RGB color
	 * @return a float between 0.0 and 1.0
	 * @see #getRed
	 * @see #getBlue
	 * @see #getRGB(float, float, float)
	 */
	public static float getGreen(int rgb) {
		rgb = rgb >> 8;
		rgb = rgb & 0b11111111;

		float rgbFLOAT = rgb / 255.0f;

		return rgbFLOAT;
	}

	/**
	 * Returns blue component from given packed color.
	 * @param rgb 32-bits RGB color
	 * @return a float between 0.0 and 1.0
	 * @see #getRed
	 * @see #getGreen
	 * @see #getRGB(float, float, float)
	 */
	public static float getBlue(int rgb) {
		rgb = rgb & 0b11111111;

		float rgbFLOAT = rgb / 255.0f;

		return rgbFLOAT;    
	}

	/**
	 * Returns the average of red, green and blue components from given packed color.
	 * @param rgb 32-bits RGB color
	 * @return a float between 0.0 and 1.0
	 * @see #getRed
	 * @see #getGreen
	 * @see #getBlue
	 * @see #getRGB(float)
	 */
	public static float getGray(int rgb) {
		float rgbSum = 0;
		rgbSum += getRed(rgb);
		rgbSum += getBlue(rgb);
		rgbSum += getGreen(rgb);

		float rgbMoyenne = (rgbSum / 3.0f);


		return rgbMoyenne;
	}

	/**
	 * Returns packed RGB components from given red, green and blue components.
	 * @param red a float between 0.0 and 1.0
	 * @param green a float between 0.0 and 1.0
	 * @param blue a float between 0.0 and 1.0
	 * @return 32-bits RGB color
	 * @see #getRed
	 * @see #getGreen
	 * @see #getBlue
	 */
	public static int getRGB(float red, float green, float blue) {
		int rgb = 0b00000000;

		red = Utils.roundToLimits(1, 0, red);
		green = Utils.roundToLimits(1, 0, green);
		blue = Utils.roundToLimits(1, 0, blue);

		rgb = rgb << 8;
		rgb += red*255;

		rgb = rgb << 8;
		rgb += green * 255;

		rgb = rgb << 8;
		rgb += blue * 255;
		return rgb;
	}

	/**
	 * Returns packed RGB components from given grayscale value.
	 * @param red a float between 0.0 and 1.0
	 * @param green a float between 0.0 and 1.0
	 * @param blue a float between 0.0 and 1.0
	 * @return 32-bits RGB color
	 * @see #getGray
	 */
	public static int getRGB(float gray) {
		int rgb = 0b00000000;
		

		if (gray < 0) {
			gray = 0;
		} else if (gray > 1){
			gray = 1;
		}
		int grayInt = (int)(gray * 255.0);

		rgb = rgb << 8;
		rgb += grayInt;

		rgb = rgb << 8;
		rgb += grayInt;

		rgb = rgb << 8;
		rgb += grayInt;

		return rgb;
	}

	/**
	 * Converts packed RGB image to grayscale float image.
	 * @param image a HxW int array
	 * @return a HxW float array
	 * @see #toRGB
	 * @see #getGray
	 */
	public static float[][] toGray(int[][] image) {
		float imageGray[][] = new float [image.length][image[0].length];

		for (int i = 0; i < image.length; i++) {
			for (int j = 0; j < image[0].length; j++) {
				imageGray[i][j] = getGray(image[i][j]);
			}
		}
		return imageGray;
	}

	/**
	 * Converts grayscale float image to packed RGB image.
	 * @param channels a HxW float array
	 * @return a HxW int array
	 * @see #toGray
	 * @see #getRGB(float)
	 */
	public static int[][] toRGB(float[][] gray) {
		int imageRGB[][] = new int [gray.length][gray[0].length];

		for (int i = 0; i < gray.length; i++) {
			for (int j = 0; j < gray[0].length; j++) {
				imageRGB[i][j] = getRGB(gray[i][j]);
			}
		}
		return imageRGB;
	}

}
