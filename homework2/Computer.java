
package homework2;

public class Computer implements Elec, Net {

	@Override
	public void getInternet() {
		System.out.println("电脑上网~");

	}

	@Override
	public void on() {
		System.out.println("电脑开机~");
	}

	@Override
	public void off() {
		System.out.println("电脑关机~");
	}

}
