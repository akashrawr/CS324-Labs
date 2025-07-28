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
public class Guitar extends Instrument{
    @Override
    public void play(Note n) {
        System.out.println("Guitar is playing " + n);
    }
}
