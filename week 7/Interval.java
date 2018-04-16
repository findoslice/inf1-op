public class Interval{
    public double left, right;
    public Interval(double left, double right){
        this.left = left;
        this.right = right;
    }
    public boolean isEmpty(){
        if (this.left > this.right){
            return true;
        }
        return false;
    }
    public boolean doesContain(double x){
        if (!this.isEmpty()){
            if (this.left < x && this.right > x){
                return true;
            }
            return false;
        }
        return false;
    }
    public boolean intersects(Interval b){
        if (!this.isEmpty() && !b.isEmpty()){
            if ((b.left < this.left && b.right < this.right) || (b.left > this.left && b.right > this.left)){
                return true;
            }
            return false;
        }
        return false;
    }
    public String toString(){
        if (!this.isEmpty())
        return (String) ("Interval: [" + Double.toString(this.left) + " , " + Double.toString(this.right) + "]");
        else return "Interval: (EMPTY)";
    }
}