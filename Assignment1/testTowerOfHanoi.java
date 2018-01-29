package Session4.TowerOfHanoi;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class testTowerOfHanoi {
	TowerOfHanoi toh = new TowerOfHanoi();
	@Test
	public void test() {
		List<String> actual = new ArrayList<String>();
		actual.addAll(toh.towerOfHanoi("A", "B", "C", 1));
		List<String> expected = new ArrayList<String>();
		expected.add("Move Disk 1 from A to B");
		assertEquals(expected, actual);
	}
	@Test
	public void test2() {
		List<String> actual = new ArrayList<String>();
		actual.addAll(toh.towerOfHanoi("A", "B", "C", 2));
		List<String> expected = new ArrayList<String>();
		expected.add("Move Disk 1 from A to C");
		expected.add("Move Disk 2 from A to B");
		expected.add("Move Disk 1 from C to B");
		assertEquals(expected, actual);
	}
	@Test
	public void test3() {
		List<String> actual = new ArrayList<String>();
		actual.addAll(toh.towerOfHanoi("A", "B", "C", 3));
		List<String> expected = new ArrayList<String>();
		expected.add("Move Disk 1 from A to B");
		expected.add("Move Disk 2 from A to C");
		expected.add("Move Disk 1 from B to C");
		expected.add("Move Disk 3 from A to B");
		expected.add("Move Disk 1 from C to A");
		expected.add("Move Disk 2 from C to B");
		expected.add("Move Disk 1 from A to B");
		assertEquals(expected, actual);
	}

}
