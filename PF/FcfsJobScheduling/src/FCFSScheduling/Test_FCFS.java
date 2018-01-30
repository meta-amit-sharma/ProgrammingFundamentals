package FCFSScheduling;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_FCFS {
	FCFSJobScheduling fcfs=new FCFSJobScheduling();
	
	
	@Test
	public void test() {
		int arrival_time[]={1,5,9,25};
		int job_size[]={12,7,2,5};
		int expected[][]={{1,1,0,1,12},
				          {2,5,8,13,19},
				          {3,9,11,20,21},
				          {4,25,0,25,29}};
		
		int actual[][]=fcfs.FCFS(arrival_time, job_size);
		assertArrayEquals(expected,actual);
	}
	
	@Test
	public void test2() {
		
		int[] arrivalTime = new int[] {1,5,10,15};
		int[] jobSize = new int[] {8,5,6,7};
		int[][] output = new int[][] {{1,1,0,1,8}, {2,5,4,9,13},
									{3,10,4,14,19}, {4,15,5,20,26}};
		assertArrayEquals(output, fcfs.FCFS(arrivalTime, jobSize));
		}
	}


