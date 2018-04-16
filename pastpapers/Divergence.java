import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Divergence{
    public static void main(String[] args){
        int[] x = {2,1,1,9};
        double[] yee = normalise(x);
        for (double y : yee){
            System.out.println(y);
        }
    }
    public static int[] charCount(String s){
        char[] letters = s.toCharArray();
        Arrays.sort(letters);
        List<Integer> list = new ArrayList<Integer>();
        char c = letters[0];
        list.add(1);
        for (char boi : Arrays.copyOfRange(letters,1,letters.length)){
            if (boi == c){
                list.set(list.size()-1, list.get(list.size()-1) + 1);
            }
            else {
                list.add(1);
                c = boi;
            }
        }
        int bois[] = new int[list.size()];
        for (int i = 0; i < list.size();i++){
            bois[i] = list.get(i);
        }
        return bois;
    }
    public static double[] normalise(int[] c){
        int sum = 0;
        double[] boi = new double[c.length];
        for (int x : c){
            sum += x;
        }
        for (int i = 0; i < boi.length; i++){
            boi[i] = ((double) c[i])/((double)sum);
        }
        return boi;
    }
}