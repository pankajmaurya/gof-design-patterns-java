package net.hackspace.behavioural.iterator;

import java.util.Iterator;
import java.util.List;

class FemaleEmployeeIterator implements Iterator<Employee> {

   private List<Employee> employeeList;
   private int position;
   public FemaleEmployeeIterator(List<Employee> emplyeelist){
       this.employeeList = emplyeelist;
   }

   @Override
   public boolean hasNext() {
       for (; position < employeeList.size(); position++) {
           if ("f".equalsIgnoreCase ((employeeList.get(position)).sex())) {
               return true;
           }
       }
       return false;
   }

   @Override
   public Employee next() {
       Employee employee = employeeList.get(position);
       position++;
       return employee;
   }

   @Override
   public void remove() {
       employeeList.iterator().remove();
   }

    @Override
    public String toString() {
        return "Female Employees Iterator";
    }
}
