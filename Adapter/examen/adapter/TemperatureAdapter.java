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
public class TemperatureAdapter extends Celsius {
    private Kelvin kel;

    public TemperatureAdapter(Kelvin kel) {
        this.kel = kel;
    }

    @Override
    public double getTemperature() {
        double result;
        // Calculate a minimum circle radius, which can fit this peg.
        result = kel.getTemperature() - 273.15;
        return result;
    }
}
