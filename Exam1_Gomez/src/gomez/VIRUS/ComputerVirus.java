
package gomez.VIRUS;

import gomez.INTERFACE.Viral;

// this is an abtract class Computer Virus that implements the Viral interface
public abstract class ComputerVirus implements Viral{
    private String virusID;
    private String virusName;
    private int virusSize;
    private String virusPayload;
    private String virusTrigger;
    private String virusTarget;
    private boolean isEncrypted;
    public static int virusCount;

    /**
     * Constructs a new instance of the ComputerVirus class.
     * This constructor increments the virusCount variable by 1.
     */
    public ComputerVirus() {
        virusCount++;
    }

    /**
     * Constructs a new ComputerVirus object with the specified virus properties.
     *
     * @param virusID      the ID of the virus
     * @param virusName    the name of the virus
     * @param virusSize    the size of the virus
     * @param virusPayload the payload of the virus
     * @param virusTrigger the trigger of the virus
     * @param virusTarget  the target of the virus
     * @param isEncrypted  true if the virus is encrypted, false otherwise
     */
    public ComputerVirus(String virusID, String virusName, int virusSize, String virusPayload, String virusTrigger,
            String virusTarget, boolean isEncrypted) {
        this.virusID = virusID;
        this.virusName = virusName;
        this.virusSize = virusSize;
        this.virusPayload = virusPayload;
        this.virusTrigger = virusTrigger;
        this.virusTarget = virusTarget;
        this.isEncrypted = isEncrypted;
        
    }

    public String getVirusID() {
        return virusID;
    }

    public void setVirusID(String virusID) {
        this.virusID = virusID;
    }

    public String getVirusName() {
        return virusName;
    }

    public void setVirusName(String virusName) {
        this.virusName = virusName;
    }

    public int getVirusSize() {
        return virusSize;
    }

    public void setVirusSize(int virusSize) {
        this.virusSize = virusSize;
    }

    public String getVirusPayload() {
        return virusPayload;
    }

    public void setVirusPayload(String virusPayload) {
        this.virusPayload = virusPayload;
    }

    public String getVirusTrigger() {
        return virusTrigger;
    }

    public void setVirusTrigger(String virusTrigger) {
        this.virusTrigger = virusTrigger;
    }

    public String getVirusTarget() {
        return virusTarget;
    }

    public void setVirusTarget(String virusTarget) {
        this.virusTarget = virusTarget;
    }

    public boolean isEncrypted() {
        return isEncrypted;
    }

    public void setEncrypted(boolean isEncrypted) {
        this.isEncrypted = isEncrypted;
    }

    public static int getVirusCount() {
        return virusCount;
    }

    public static void setVirusCount(int virusCount) {
        ComputerVirus.virusCount = virusCount;
    }

    @Override
    public String toString() {

        String isEncrypted = this.isEncrypted ? "Yes" : "No";
        return "Virus ID: " + virusID + "\nVirus Name: " + virusName + "\nVirus Size: " + virusSize
                + "\nVirus Payload: " + virusPayload + "\nVirus Trigger: " + virusTrigger + "\nVirus Target: "
                + virusTarget + "\nIs Encrypted: " + isEncrypted;
    }
  
   

   
}