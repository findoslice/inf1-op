public class NoTriples{
    public static boolean noTriples(int[] nums){
        for (int i = 0; i < nums.length - 2; i++){
            if ((nums[i] == nums[i+1]) && (nums[i] == nums[i+2])){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int[] x = new int[args.length];
        for (int i = 0; i < args.length; i++){
            x[i] = Integer.parseInt(args[i]);
        }
        boolean result = noTriples(x);
        System.out.println(result);
    }
}