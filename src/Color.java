
/**
 * @author John Doe
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
        // TODO getRed
        return 0.0f;
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
        // TODO getGreen
        return 0.0f;
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
        // TODO getBlue
        return 0.0f;
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
        // TODO getGray
        return 0.0f;
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
        // TODO getRGB
        return 0;
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
        // TODO getRGB
        return 0;
    }

    /**
     * Converts packed RGB image to grayscale float image.
     * @param image a HxW int array
     * @return a HxW float array
     * @see #toRGB
     * @see #getGray
     */
    public static float[][] toGray(int[][] image) {
        // TODO toGray
        return null;
    }

    /**
     * Converts grayscale float image to packed RGB image.
     * @param channels a HxW float array
     * @return a HxW int array
     * @see #toGray
     * @see #getRGB(float)
     */
    public static int[][] toRGB(float[][] gray) {
        // TODO toRGB
        return null;
    }

}
