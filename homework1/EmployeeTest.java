
package homework1;


public class EmployeeTest {

	/**  
	 * @Description: 
	 * @author LYL
	 * @date 2020-12-29 17:27:06
	 */

	public static void main(String[] args) {
		Employee director = new Director("雷杨龙",10000,"湖南长沙",2,1000);
		Employee manager = new Manager("雷琳",9000,"湖南邵阳",3,"营销部");
		
		director.show();
		manager.show();
	}

}
