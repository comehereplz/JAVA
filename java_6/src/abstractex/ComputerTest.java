package abstractex;

public class ComputerTest {

	public static void main(String[] args) {
		Computer c2 = new DeskTop();
		Computer c4 = new MyNoteBook();
		
		c2.turnOn();
		c2.display();
		c2.typing();
		c2.turnOff();
		
		c4.turnOn();
		c4.display();
		c4.typing();
		c4.turnOff();
	}

}
