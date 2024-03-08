package gomez.FACTORY;
import gomez.VIRUS.*;
import gomez.INTERFACE.*;
import java.util.Random;
    // import random to build random values for each constructor


public class VirusBuilder {
    // the class returns an arr of the type ComputerVirus
    // it accepts 3 intergers witch will be used to determine how many 
    //virus of each type will be built
    public static ComputerVirus[] buildVirus(int A, int B, int C){
        ComputerVirus[] viruses = new ComputerVirus[A+B+C];
        int index = 0; // create an index to navigat viruses[]
        Random R = new Random(); //random onstructor

        // Generate A_Virus
        for (int i = 0; i < A; i++) {
            viruses[index++] = new A_Virus(Viral.generateID(),
                    // use.nextInt againist the lenth of each arttibute array 
                    //to genrate a random value for that attribute
                    Viral.payload[R.nextInt(Viral.payload.length)],
                    Viral.trigger[R.nextInt(Viral.trigger.length)],
                    Viral.target[R.nextInt(Viral.target.length)], 
                    Viral.isEncrypted[R.nextInt(Viral.isEncrypted.length)]);
        }

        // Generate B_Virus
        for(int i = 0; i < B; i++){
             // use.nextInt againist the lenth of each arttibute array 
                    //to genrate a random value for that attribute
            viruses[index++] = new B_Virus(Viral.generateID(),
                    Viral.payload[R.nextInt(Viral.payload.length)],
                    Viral.trigger[R.nextInt(Viral.trigger.length)], 
                    Viral.target[R.nextInt(Viral.target.length)],
                    Viral.isEncrypted[R.nextInt(Viral.isEncrypted.length)]);
        }

        // Generate C_Virus
        for(int i = 0; i < C; i++){
             // use.nextInt againist the lenth of each arttibute array 
                    //to genrate a random value for that attribute
            viruses[index++] = new C_Virus(Viral.generateID(),
                    Viral.payload[R.nextInt(Viral.payload.length)],
                    Viral.trigger[R.nextInt(Viral.trigger.length)],
                    Viral.target[R.nextInt(Viral.target.length)],
                    Viral.isEncrypted[R.nextInt(Viral.isEncrypted.length)]);
        }

        return viruses;
    }

    public static void displayVirus(ComputerVirus[] viruses) {
        
        // itterate through viruses[] and call displayMe() 
        //for each element within
        for (ComputerVirus computerVirus : viruses) {
            computerVirus.displayMe();
        }
    }
}
