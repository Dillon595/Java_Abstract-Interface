
package homework1;

/**  
 * @ClassName: Employee
 * @Description: 
 * @author LYL
 * @date 2020-12-29 16:55:51
*/

public abstract class Employee {
	private String name;
	private int basicSalary;
	private String address;
	private int holiday;
	
	public Employee(String name, int basicSalary, String address, int holiday) {
		super();
		this.name = name;
		this.basicSalary=basicSalary;
		this.address = address;
		this.holiday = holiday;
	}
	
	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public int getHoliday() {
		return holiday;
	}

	public void show() {
		System.out.println("name = "+name+", basicSalary = "+getBasicSalary()+", address = "+address+", holiday = "+holiday);
	}
	
	public int calculateLessPay() {
		if(holiday==0) {
			return 0;
		}else if(holiday<=5) {
			return getBasicSalary()/4;
		}else if(holiday>5) {
			return getBasicSalary()/2;
		}else {
			return 0;
		}
	}
	
	public abstract int calculateTotal();

	public int getBasicSalary() {
		return basicSalary;
	}

	
}
