package Session4.PermutationString;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class testPermutation {

	Permutation pr = new Permutation();
	@Test
	public void test() {
		List<String> actual = new ArrayList<String>();
		actual.addAll(pr.generatePermutation("ABC"));
		List<String> expected = new ArrayList<String>();
		expected.addAll(Arrays.asList("ABC", "ACB", "BAC", "BCA", "CBA", "CAB"));
		assertEquals(expected, actual);
	}
	
	@Test
	public void test2() {
		List<String> actual = new ArrayList<String>();
		actual.addAll(pr.generatePermutation("ABCD"));
		List<String> expected = new ArrayList<String>();
		expected.addAll(Arrays.asList("ABCD", "ABDC", "ACBD", "ACDB", "ADCB", "ADBC", "BACD", "BADC", 
									  "BCAD", "BCDA", "BDCA", "BDAC", "CBAD", "CBDA", "CABD", "CADB",
									  "CDAB", "CDBA", "DBCA", "DBAC", "DCBA", "DCAB", "DACB", "DABC"));
		assertEquals(expected, actual);
	}

}
