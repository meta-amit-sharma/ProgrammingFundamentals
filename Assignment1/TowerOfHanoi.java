/*
 * This file contains class TowerOfHanoi
 */
package Session4.TowerOfHanoi;

import java.util.ArrayList;
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
	List<String> towerOfHanoi ( String source, String destination, String temp,  int disk ) {
		List<String> result = new ArrayList<String>();
		if( disk == 1) {
			result.add("Move Disk " + disk + " from " + source + " to " + destination);
		} else {
			/*Moving n-1 disks from Source to Auxiliary*/
			result.addAll(towerOfHanoi(source, temp, destination, disk - 1)); 
			/*Moving nth disks from Source to Destination*/
			result.add("Move Disk " + disk + " from " + source + " to " + destination);
			/*Moving n-1 disks from Auxiliary to Destination*/
			result.addAll( towerOfHanoi(temp, destination, source, disk - 1) );
		}
		return result;
	}
}
