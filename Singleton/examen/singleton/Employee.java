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
public class Employee {

    private final String name;
    private final String role;
    private final String assignment;

    public Employee(String name, String role, String assignment) {
        this.name = name;
        this.role = role;
        this.assignment = assignment;
    }

    public void printCurrentAssignment(){
        Printer printer = Printer.getInstance();
        printer.print("Employee: " + name + "\n" +
                "Role: " + role + "\n" +
                "Assignment: " + assignment + "\n");
    }
}
