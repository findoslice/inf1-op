public class Has271{
    public static boolean has271(int[] nums){
        for (int i = 0; i < nums.length -2; i++){
            if (nums[i+1] == nums[i] +5 && nums[i+2] == nums[i] - 1){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] x = new int[args.length];
        for (int i = 0; i < args.length; i++){
            x[i] = Integer.parseInt(args[i]);
        }
        boolean result = has271(x);
        System.out.println(result);
    }
}