/**  
 * @Title: Director.java
 * @Description: 
 * @author LYL
 * @date 2020-12-29 17:09:20
 */

package homework1;

/**
 * @ClassName: Director
 * @Description:
 * @author LYL
 * @date 2020-12-29 17:09:20
 */

public class Director extends Employee {
	private int transportAllowance;

	public Director(String name, int basicSalary, String address, int holiday, int transportAllowance) {
		super(name, basicSalary, address, holiday);
		this.transportAllowance = transportAllowance;
	}

	@Override
	public int calculateTotal() {
		int sy = getBasicSalary() + 5000 + transportAllowance;
		return sy;
	}

	public void show() {
		System.out.println("name = " + getName() + ", basicSalary = " + getBasicSalary() + ","
				+ " address = " + getAddress()+ ", holiday = " + getHoliday() + ", TotalSalary = "
				+ calculateTotal() + ", RealSalary = "+ (calculateTotal()-calculateLessPay()));
	}

}
