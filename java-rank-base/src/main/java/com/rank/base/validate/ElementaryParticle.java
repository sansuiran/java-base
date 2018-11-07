package com.rank.base.validate;

public class ElementaryParticle {
    /**
     * @param name  has content.
     * @param speed is in the range 0 (inclusive) to 1 (inclusive), and
     *              is expressed as a fraction of the speed of light. (The photon is
     *              an example of an elementary particle which travels at this speed.)
     * @throws IllegalArgumentException if a param does not comply.
     */
    public ElementaryParticle(String name, double speed) {
        if (!textHasContent(name)) {
            throw new IllegalArgumentException("Name has no content.");
        }
        if (speed < 0.0 || speed > 1.0) {
            throw new IllegalArgumentException("Speed not in range [0..1]: " + speed);
        }
        this.name = name;
        this.speed = speed;
    }


    // PRIVATE
    private String name;
    private double speed;

    /**
     * Returns true if aText is non-null and has visible content.
     * <p>
     * This is a test which is often performed, and should probably
     * be placed in a general utility class.
     */
    private boolean textHasContent(String text) {
        String EMPTY_STRING = "";
        return (text != null) && (!text.trim().equals(EMPTY_STRING));
    }
}
