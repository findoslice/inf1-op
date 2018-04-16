import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;



public class Beads{
    public static Set<Integer> sums(ArrayList<Integer> nums, int n){
        if (n == 0 || nums.size() == 0){
            Set<Integer> x = new HashSet<Integer>();
            return x;
        }
        Set<Integer> x = new HashSet<Integer>();
        for (int i = 0; i < nums.size()+1-n; i++){
            int y = nums.get(i);
            for (int j = i+1; j < i+n;j++){
                y += nums.get(j);
            }
            x.add(y);
        }
        return x;
    }

    public static Set<Integer> sums2(ArrayList<Integer> beads, int toSum) {
		if (beads.size() == 0 || toSum == 0) {
//			System.out.println("Empty list");
			return new HashSet<Integer>();
		}
		
		HashSet<Integer> nums = new HashSet<Integer>();
		
		ArrayList<Integer> line = new ArrayList<>(beads);
		
		while (line.size() < (beads.size() + toSum)) {
			line.addAll(beads);
		}
		
		for (int start = 0; start < beads.size(); start++) {
			int end = start + toSum;
			
			int sum = 0;
//			System.out.print("(");
			for (int i = start; i < end; i++) {
//				System.out.printf("%d,", line.get(i));
				sum += line.get(i);
			}
//			System.out.printf(")+");
			nums.add(sum);
		}
//		System.out.println();
		
		return nums;
	}

    public static Set<Integer> allSums(ArrayList<Integer> beads){
        Set<Integer> boi = new HashSet<Integer>();
        for (int i = 0; i < beads.size()+1;i++){
            for (int x : sums(beads, i)){
                boi.add(x);
            }
        }
        return boi;
    }

    public static int findMax(Set<Integer> nums){
        if (!nums.contains(1)){
            return 0;
        }
        int n = 1;
        for (int x : nums){
            if (x == 1){
                continue;
            }
            else if (x == n + 1){
                n = x;
            }
            else{
                return n;
            }
        }
        return n;
    }
    public static void main(String[] args){
        //Set<Integer> boi = new HashSet<Integer>(Arrays.asList(6,1,3));
        Set<Integer> boi = new HashSet<Integer>();
        for (int i = 10000000; i >= 0; i--){
            boi.add((int)i%997);
        }
        for (int i : boi){
            System.out.println(i);
        }
    }
} 