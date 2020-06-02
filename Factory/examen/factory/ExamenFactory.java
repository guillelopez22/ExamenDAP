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
public class ExamenFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      ComputerPartFactory factory = new ComputerPartFactory();
      
      
      ComputerPart part1 = factory.getPart(ComputerPartType.CPU);
      ComputerPart part2 = factory.getPart(ComputerPartType.MOBO);
      ComputerPart part3 = factory.getPart(ComputerPartType.RAM);
      
      
      part1.build();
      part2.build();
      part3.build();
    }
    
}
