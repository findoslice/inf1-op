public class MeanVariance{
    public static void main(String[] args){
        double ave = average(args);
        double var = variance(args);
        System.out.println(ave + "\n" + var);
    }
    private static double average(String[] nums){
        double sum = 0;
        for (String x : nums){
            sum += Double.parseDouble(x);
        }
        return sum/(nums.length*1.0);
    }
    private static double variance(String[] nums){
        double average = average(nums);
        double var = 0;
        for (String x : nums){
            var += (Double.parseDouble(x) - average)*(Double.parseDouble(x) - average);
        }
        return var/(nums.length*1.0);
    }
}