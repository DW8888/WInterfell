
package gomez.VIRUS;




public class B_Virus extends ComputerVirus{
    private String BCode;
   
    public B_Virus(String virusID, String virusPayload, String virusTrigger,
            String virusTarget, boolean isEncrypted) {
        super(virusID, "B"+virusID, 6, virusPayload, virusTrigger, virusTarget, isEncrypted);
        BCode = " Virus_Beta";
         ;
    }
  
    @Override
    public void displayMe(){
        System.out.println("""
                           ***B Virus***
                           BCode: """+BCode+"\n"+super.toString()+"\n");

    }
   
    
}

