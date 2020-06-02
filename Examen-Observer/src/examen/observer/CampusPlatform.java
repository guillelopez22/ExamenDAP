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
import java.util.ArrayList;
 
public class CampusPlatform implements Subject{
 
	private final ArrayList<Observer> students;
	private final ArrayList<String> assignments;

        @Override
	public void registerObserver(Observer newStudent) {
		students.add(newStudent);
	}
 
	@Override
	public void removeObserver(Observer o) {}
 
	@Override
	public void notifyAllObservers() {
            students.forEach((o) -> {
                o.update(this);
            });
	}
        
	public CampusPlatform(){
		students = new ArrayList<Observer>();
		assignments = new ArrayList<String>();
	}

 
	public void addAssignment(String job) {
		this.assignments.add(job);
		notifyAllObservers();
	}
 
	
 
        @Override
	public String toString(){
            String ret = assignments.get(assignments.size() -1);
		return ret;
	}
        
        public void getAssignments() {
            String ret = "Assigned HW: ";
            for (int i = 0; i < assignments.size(); i++) {
                ret = ret + " " + assignments.get(i);
            }
            System.out.println(ret);
        }
}
