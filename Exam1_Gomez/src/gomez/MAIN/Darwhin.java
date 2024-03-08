
package gomez.MAIN;

import gomez.VIRUS.ComputerVirus;
import gomez.FACTORY.VirusBuilder;

public class Darwhin {
   // main method calls the program takes 3 ints and displays viruser of that 
    // amount for wach type int [0] A virus, int [1] B virus, int [2] C virus
    public static void main(String[] args) {
        ComputerVirus[] viruses = (ComputerVirus[]) VirusBuilder.buildVirus(1, 1, 1);
        VirusBuilder.displayVirus(viruses);
    }
    
}