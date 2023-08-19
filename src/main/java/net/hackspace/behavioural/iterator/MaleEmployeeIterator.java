package net.hackspace.behavioural.iterator;

import java.util.Iterator;
import java.util.List;

public class MaleEmployeeIterator implements Iterator<Employee> {

	private List<Employee> emplyeelist;
	private int position;
	public MaleEmployeeIterator(List<Employee> emplyeelist){
		this.emplyeelist = emplyeelist;
	}
	
	@Override
    public boolean hasNext() {
		for ( ;position < emplyeelist.size(); position++) {
			if ("m".equalsIgnoreCase ((emplyeelist.get(position)).sex())) {
				return true;
			}
		}
		return false;
    }

	@Override
    public Employee next() {
		Employee employee = emplyeelist.get(position);
		position++;
		 return employee;
    }

	@Override
    public void remove() {
		emplyeelist.iterator().remove();
    }

	@Override
	public String toString() {
		return "Male Employees Iterator";
	}
}


