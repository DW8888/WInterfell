/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gomez.VIRUS;

import gomez.INTERFACE.Viral;

/**
 *
 * @author darwh
 */
public class C_Virus extends ComputerVirus {
    private String CCode;
    
   
    public C_Virus(String virusID, String virusPayload, String virusTrigger,
            String virusTarget, boolean isEncrypted) {
        super(virusID, "C"+virusID, 8, virusPayload, virusTrigger, virusTarget, isEncrypted);
        CCode = " Virus_Gamma";
        
    }
  @Override
    public void displayMe(){
        System.out.println("""
                           ***C Virus***
                           CCode:  """+CCode+"\n"+super.toString()+"\n");

    }
}