import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.lang.String;

public class Fermat{
    public static Set<ArrayList<String>> threadings(int num, String[] colours){
        Set<ArrayList<String>> boi = new HashSet<>();
        for (String firstcolour : colours){
            if (num < 1){
                return new HashSet<>();
            }
            if (num == 1){
                ArrayList<String> necklace = new ArrayList<>();
                necklace.add(firstcolour);
                boi.add(necklace);
            }
            for (ArrayList<String> colours2 : threadings(num-1,colours)){
                ArrayList<String> necklace = new ArrayList<>();
                necklace.add(firstcolour);
                necklace.addAll(colours2);
                boi.add(necklace);
            }
        }

        return boi;
    }
    public static void analyse(Set<ArrayList<String>> bois){
        Boolean truth = false;
        for (ArrayList<String> boi : bois){
            for (ArrayList<String> gal : bois){
                if (isEquiv(boi,gal)){
                    break;
                }
                System.out.println("isEquiv: " + String.valueOf(isEquiv(boi, gal)));
                truth = truth || isEquiv(boi, gal);
                System.out.println("truth " + String.valueOf(truth));
            }
            System.out.println(boi + "is a singleton");
        }
    }
    public static Boolean isEquiv(ArrayList<String> foo, ArrayList<String> bar){

        if (foo.size() != bar.size()){
            return false;
        }
        for (int i = 0; i < foo.size();i++){
            Collections.rotate(foo,1);
            if (bar.equals(foo)){
                return true;
            }
        }
        
        return false;
    }

    public static void main(String[] args){
        ArrayList<String> x = new ArrayList<String>(Arrays.asList("red","red"));
        ArrayList<String> y = new ArrayList<String>(Arrays.asList("red","green"));
        Set<ArrayList<String>> xy = new HashSet<>();
        xy.add(x);
        xy.add(y);
        System.out.println(isEquiv(x,y));
        analyse(xy);

    }
}