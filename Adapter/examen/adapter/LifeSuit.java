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
public class LifeSuit {
    private double temperature;

    public LifeSuit(double temperature) {
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public boolean adapts(Celsius cel) {
        boolean result;
        result = (this.getTemperature() >= cel.getTemperature());
        return result;
    }
}
