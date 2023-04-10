package practies;

import java.io.Serializable;

public class Employee implements Serializable,Comparable<Employee> {
	
	int id;
    String ename;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }
    public Employee() {
        
    }

    public Employee(int id, String ename) {
        this.id = id;
        this.ename = ename;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", ename='" + ename + '\'' + '}';
    }
	
    @Override
	public int compareTo(Employee e) {
		return this.id - e.id;
	
	}
	
}
