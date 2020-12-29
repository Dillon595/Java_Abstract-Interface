
package homework1;

/**
 * @ClassName: Manager
 * @Description:
 * @author LYL
 * @date 2020-12-29 17:21:09
 */

public class Manager extends Employee {
	private String department;

	public Manager(String name, int basicSalary, String address, int holiday, String department) {
		super(name, basicSalary, address, holiday);
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	@Override
	public int calculateTotal() {
		int sy = getBasicSalary() + 1500 + (getBasicSalary() / 100) * 20;
		return sy;
	}

	public void show() {
		System.out.println("name = " + getName() + ", basicSalary = " + getBasicSalary() + ","
				+ " address = " + getAddress()+ ", holiday = " + getHoliday() + ", department = "+
				department+", TotalSalary = "+ calculateTotal() + ", RealSalary = "+ (calculateTotal()-calculateLessPay()));
	}

}
