/**  
 * @Title: MobilePhone.java
 * @Description: 
 * @author LYL
 * @date 2020-12-29 17:37:50
 */  

package homework2;

/**  
 * @ClassName: MobilePhone
 * @Description: 
 * @author LYL
 * @date 2020-12-29 17:37:50
*/

public class MobilePhone extends Phone implements Net, Elec {


	@Override
	public void on() {
		System.out.println("手机开机！");

	}

	@Override
	public void off() {
		System.out.println("手机关机！");
	}

	@Override
	public void getInternet() {
		System.out.println("手机上网！");

	}

	@Override
	public void sendCall(String name) {
		System.out.println("手机打电话给"+name);
	}

	@Override
	public void getCall(String name) {
		System.out.println("手机接到"+name+"的电话");
	}

}
