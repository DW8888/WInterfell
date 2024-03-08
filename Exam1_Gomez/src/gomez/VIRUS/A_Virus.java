
package gomez.VIRUS;


public class A_Virus extends ComputerVirus{
    private String ACode;
    
    
    public A_Virus(String virusID, String virusPayload, String virusTrigger,
            String virusTarget, boolean isEncrypted) 
            {
        super(virusID, "A"+ virusID, 4, virusPayload, virusTrigger, virusTarget, isEncrypted);
        ACode=" VIRUS_ALPHA";
       
    }
    @Override
    public void displayMe(){
        System.out.println("""
                           ***A Virus***
                           ACode: """+ ACode);
        System.out.println(super.toString()+"\n");

    }
   
}