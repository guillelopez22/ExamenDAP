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
public class ComputerPartFactory {
    public ComputerPart getPart(ComputerPartType cpType){
        switch (cpType) {
            case CPU:
                return new CPU();
            case MOBO:
                return new Motherboard();
            case RAM:
                return new RAM();
            default:
                break;
        }
      
      return null;
   }
}
