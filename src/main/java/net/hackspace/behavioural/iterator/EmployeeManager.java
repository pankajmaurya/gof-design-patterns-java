package net.hackspace.behavioural.iterator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class EmployeeManager {

	List<Employee> emplyeelist = new ArrayList<Employee>();
	Map<Integer, Employee> employeeMap = new HashMap<Integer, Employee>();

	void addEmployee(Employee emp) {
		emplyeelist.add(emp);
	}

	boolean removeEmployee(Employee emp) {
		return emplyeelist.remove(emp);
	}

	MaleEmployeeIterator getMaleEmployeeIterator() {
		return new MaleEmployeeIterator(emplyeelist);
	}

	FemaleEmployeeIterator getFeMaleEmployeeIterator() {
		return new FemaleEmployeeIterator(emplyeelist);
	}

	Iterator<Employee> getAllEmployeeIterator() {
		return emplyeelist.iterator();
	}

	public Iterator<Entry<Integer, Employee>> printEmployeeMap() {
	    return employeeMap.entrySet().iterator();
    }

	void calculateEmpSalary() {

	}

}
