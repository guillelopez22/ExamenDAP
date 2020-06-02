/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.observer;

/**
 *
 * @author Guillermo
 */
public class ExamenObserver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CampusPlatform cp = new CampusPlatform();
	cp.registerObserver(new Student("Roman"));
	cp.registerObserver(new Student("Arturo"));
        
        cp.addAssignment("Math");
        cp.addAssignment("Physics");
        
        cp.getAssignments();
    }
    
}
