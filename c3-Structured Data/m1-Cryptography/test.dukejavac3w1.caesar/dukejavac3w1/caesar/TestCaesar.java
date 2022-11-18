package dukejavac3w1.caesar;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCaesar {
	static Caesar caesar;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		 caesar=new Caesar(2);
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	final void testEncryptCaesar() {
		boolean test=false;
		caesar.encryptCaesar("cd");
		String cript=caesar.getSb().toString();
		test=cript.equals("ab");
		System.out.println(cript);
		assertTrue(test);
		
	}

//	@Test
//	final void testSetShiftAlfabet() {
//		fail("Not yet implemented"); // TODO
//	}

}
