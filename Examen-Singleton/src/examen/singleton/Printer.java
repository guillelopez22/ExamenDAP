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
public class Printer {

    private static Printer printer;
    private int nrOfPages;

    private Printer() {
    }

    public static Printer getInstance() {
        return printer == null ? 
                printer = new Printer() : 
                printer;
    }

    public void print(String text){
        System.out.println(text +
                "\n" + "Pages printed today " + ++nrOfPages +
                "\n" + "---------");
    }
}
