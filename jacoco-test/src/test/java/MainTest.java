import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {

	@Test
	public void testIsPalindrome() {
		Main palindromeTester = new Main();
		assertTrue(Main.isPalindrome(""));
	}
	
	@Test
	public void testMain() {
		Main mainTester = new Main();
		Main.main(null);
	}

}
