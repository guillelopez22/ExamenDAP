/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.adapter;

/**
 *
 * @author Guillermo
 */
public class ExamenAdapter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LifeSuit ls = new LifeSuit(50);
        
        
        
        Celsius cel = new Celsius(55);
        if (ls.adapts(cel)) {
            System.out.println("Celsius temperature is fit for lifesuit.");
        } else {
            System.out.println("Celsius temperature is not fit for lifesuit.");
        }
        System.out.println("");

        Kelvin lowk = new Kelvin(2);
        Kelvin higherK = new Kelvin(5000);
        
        
        TemperatureAdapter lowkAdapter = new TemperatureAdapter(lowk);
        TemperatureAdapter higherKApapter = new TemperatureAdapter(higherK);
        
        
        
        
        if (ls.adapts(lowkAdapter)) {
            System.out.println("Lower Kelvin temperature is fit for lifesuit");
            System.out.println("");
        } else {
            System.out.println("Lower Kelvin temperature is not fit for lifesuit");
            System.out.println("");
        }
        if (ls.adapts(higherKApapter)) {
            System.out.println("Higher Kelvin temperature is fit for lifesuit");
            System.out.println("");
        } else {
            System.out.println("Higher Kelvin temperature is not fit for lifesuit");
            System.out.println("");
        }
        
        
        
    }
    
}
