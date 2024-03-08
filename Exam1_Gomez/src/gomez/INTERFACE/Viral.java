
package gomez.INTERFACE;

/**
 *
 * @author darwh
 */
/**
 * The Viral interface represents a viral object that can be used to generate IDs
 * and display information.
 */
public interface Viral {
    /**
     * An array of letters.
     */
    public static String[] ltrs = {"A", "B", "C", "D", "E", "F"};

    /**
     * An array of digits.
     */
    public static String[] digits = {"1", "2", "3", "4", "5", "6"};

    /**
     * An array of payload types.
     */
    public static String[] payload = {"Worm", "Trojan Horse", "Spyware"};

    /**
     * An array of trigger types.
     */
    public static String[] trigger = {"File Download", "Macro Run"};

    /**
     * An array of target operating systems.
     */
    public static String[] target = {"Windows", "Linux"};

    /**
     * An array of encryption flags.
     */
    public static boolean[] isEncrypted = {true, false};

    /**
     * Displays information about the viral object.
     */
    public abstract void displayMe();

    /**
     * Generates a random ID using the letters and digits arrays.
     *
     * @return a randomly generated ID.
     */
    public static String generateID() {
        return ltrs[(int) (Math.random() * 6)] + digits[(int) (Math.random() * 6)] 
                + ltrs[(int) (Math.random() * 6)];
    }
}

