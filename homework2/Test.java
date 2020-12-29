
package homework2;

/**  
 * @ClassName: Test
 * @Description: 
 * @author LYL
 * @date 2020-12-29 17:42:51
*/

public class Test {
	public static void main(String[] args) {
		
		MobilePhone mp =new MobilePhone();
		mp.on();
		mp.off();
		mp.getInternet();
		mp.sendCall("雷杨龙");
		mp.getCall("雷杨龙");	
		
		Computer computer = new Computer();
		computer.getInternet();
		computer.off();
		computer.on();
	}
}
