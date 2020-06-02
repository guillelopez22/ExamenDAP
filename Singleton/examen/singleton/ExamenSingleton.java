/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.singleton;

/**
 *
 * @author Guillermo
 */
public class ExamenSingleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee graham = new Employee("Graham",
                "CEO",
                "Making excutive decisions");
        Employee sara = new Employee("Sara",
                "Consultant",
                "Consuting the company");
        Employee tim = new Employee("Tim",
                "Salesmen",
                "Selling the company's products");
        Employee emma = new Employee("Emma",
                "Developer",
                "Developing the latest mobile app.");

        graham.printCurrentAssignment();
        sara.printCurrentAssignment();
        tim.printCurrentAssignment();
        emma.printCurrentAssignment();
    }
    
}
