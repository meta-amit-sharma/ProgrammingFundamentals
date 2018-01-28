/*
 * This file contains class TowerOfHanoi
 */
package Session4.TowerOfHanoi;

import java.util.List;
/**
 * This class gives the solution for TowerOfHanoi problem
 * @author Amit Sharma
 * @version 1.0
 */
public class TowerOfHanoi {
	/**
	 * This function gives all the moves in sequence
	 * we need to perform in order to solve Tower Of Hanoi problem. 
	 * @param disk - Total number of disks
	 * @param S - The source/initial pole
	 * @param D - The destination/final pole
	 * @param A - The auxiliary pole
	 * @param result - The list of final moves.
	 */
	void towerOfHanoi ( int disk, char S, char D, char A, List<String> result) {
		if( disk == 1) {
			result.add("Move disk " + disk + " from " + S + " to " + D);
		} else {
			
			/*Moving n-1 disks from Source to Auxiliary*/
			towerOfHanoi(disk - 1, S, A, D, result); 
			
			/*Moving nth disks from Source to Destination*/
			result.add("Move disk " + disk + " from " + S + " to " + D);
			
			/*Moving n-1 disks from Auxiliary to Destination*/
			towerOfHanoi(disk - 1, A, D, S, result);
		}
	}

}
