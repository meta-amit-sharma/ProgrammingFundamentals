package Session4.TowerOfHanoi;

import java.util.ArrayList;
import java.util.List;

public class testTowerOfHanoi {

	public static void main(String args[]){
		TowerOfHanoi toh = new TowerOfHanoi();
		int disk=3;
		List<String> result = new ArrayList<String>();
		toh.towerOfHanoi(disk, 'S', 'D', 'A', result);
		for(int i=0;i<result.size();i++){
			System.out.println(result.get(i));
		}
	}
	
}
