/**
 * @author awnet
 *
 */

public class Manager extends Employee{
	/**
	 * Might have overrode the class with this.  Will ask instructor.
	 */
	Employee employee1 = new Employee();
	//define private variable.  Could be final
	private String strDep;
	//create new method with same name as class.  unprivatise the variable for use.
	public Manager() {
		strDep = "";
	}
	/**
	 * 
	 * @param department
	 */
	public Manager(String department) {
		strDep = department;
	}
	/**
	 * 
	 * @param department
	 */
	public void setDepartment(String department)
	{
		strDep = department;
	}
	/**
	 * 
	 * @return
	 */
	public String getDepartment() {
		return strDep;
	}
	/**
	 * 
	 */
	public String toString(){
	 
		return super.toString();
	}	

}
