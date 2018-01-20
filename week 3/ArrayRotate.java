public class ArrayRotate{
    public static void main(String[] args){
        int nums[] = new int[args.length];
        for (int i = 0; i < args.length; i++){
            nums[i] = Integer.parseInt(args[i]);
        }
        int temp = nums[0];
        for (int i = 1; i < nums.length; i++){
            nums[i-1] = nums[i];
        }
        nums[nums.length-1] = temp;
        for (int x : nums){
            System.out.print(x + " ");
        }
        System.out.print("\n");
    }
}