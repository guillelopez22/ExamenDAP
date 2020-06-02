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
public class Student implements Observer {
 
	private String student;
 
	public Student(String teacher){
		this.student = student;
	}
	@Override
	public void update(Subject assignment) {
		System.out.println("Student " + this.student + " has received the assignment..." + assignment);
	}
}
