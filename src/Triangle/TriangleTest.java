package Triangle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TriangleTest {
	private Triangle tri;
	
	@BeforeEach
	void setUp() throws Exception {
		tri = new Triangle(3,3,4);
	}

	@Test
	public void testIsEquilatera() {
		assertFalse(tri.isEquilatera());
	}
	@Test
	public void testIsIsosceles() {
		assertFalse(tri.isEquilatera());
	}
	@Test
	public void testIsScalene() {
		assertFalse(tri.isEquilatera());
	}
}
