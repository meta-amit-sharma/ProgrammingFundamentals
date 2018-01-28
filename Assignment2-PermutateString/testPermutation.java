package Session4.PermutationString;

import java.util.ArrayList;
import java.util.List;

public class testPermutation {
	public static void main(String[] args)
    {
        String str = "ABC";
        int n = str.length();
        List <String> result = new ArrayList<String>();
        Permutation pr = new Permutation();
        pr.permute(str, 0, n-1, result);
        for( int i=0; i < result.size(); i++) {
        	System.out.println(result.get(i));
        }
    }
}
