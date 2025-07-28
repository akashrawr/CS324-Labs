/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1;

/**
 *
 * @author akashrawr
 */
public class Music {
    public static void tune(Instrument i) {
        // Play note MIDDLE_C
        i.play(Note.MIDDLE_C);
        // Play note C_SHARP
        i.play(Note.C_SHARP);
    }
    public static void main(String[] args){
        // Create objects of Flute and Guitar
        Flute flute = new Flute();
        Guitar guitar = new Guitar();
        
        // Call tune method
        System.out.println("Tuning flute:");
        tune(flute);
        
        System.out.println("\nTuning guitar:");
        tune(guitar);
    
        System.out.println("End of program.");
  }
}
