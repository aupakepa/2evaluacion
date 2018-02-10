import static org.junit.Assert.*;

import org.junit.Test;

public class Traga2Test {

	@Test
	public void testComer() {
		Traga2 traga = new Traga2("rojo",10);
		traga.comer();
		int bolasTragadas = traga.getBolasTragadas();
		assertEquals(bolasTragadas, 1);
	}

	@Test
	public void testTrotar() {
		fail("Not yet implemented");
	}

	@Test
	public void testDormir() {
		fail("Not yet implemented");
	}

}
