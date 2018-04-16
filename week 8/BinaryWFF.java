

public class BinaryWFF{
    private PropVar left, right;
    private Operator op;
    public BinaryWFF(PropVar left, PropVar right){
        this.left = left;
        this.right = right;
    }
    public void setOp(Operator op){
        this.op = op;
    }

    public Operator getOp(){
        return this.op;
    }

    public PropVar getLeft(){
        return this.left;
    }

    public PropVar getRight(){
        return this.right;
    }

    public String toString(){
        return (this.left + this.op.toString() + this.right);
    }

    public enum Operator {

        AND {
                public String toString() {
                        return "&";
                }
        },
   
        OR {
                public String toString() {
                        return "|";
                }
        },
   
        IF {
                public String toString() {
                        return "->";
                }
        }
   
    }

}