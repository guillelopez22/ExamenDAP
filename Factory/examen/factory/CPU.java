/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.factory;

/**
 *
 * @author Guillermo
 */
public class CPU implements ComputerPart {

    @Override
    public void build() {
        System.out.println("CPU constructed...");
    }
    
}
