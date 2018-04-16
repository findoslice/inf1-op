import java.util.ArrayList;

public class Video{
    private String title;
    private boolean flag;
    private int ratingsCount;
    private ArrayList<Integer> ratings = new ArrayList<Integer>();
    public Video(String title){
        this.title = title;
        this.flag = false;
        this.ratings = ratings;
        this.ratingsCount = 0;
        this.ratings = ratings;
    }
    public static void main(String[] args){
        System.out.println("stalin did nothing wrong");
    }
    public String getTitle(){
        return this.title;
    }
    public boolean addRating(int rating){
        if (rating >= 1 && rating <= 5){
            this.ratings.add(rating);
            ratingsCount++;
            return true;
        }
        return false;
    }
    public double getAverageRating(){
        int count = 0;
        for (int rating : this.ratings){
            count += rating;
        }
        return (double) count/this.ratingsCount;
    }
    public boolean checkOut(){
        if (!this.flag){
            this.flag = true;
            return true;
        }
        System.out.println("This video is already checked out you nonce");
        return false;
    }
    public boolean returnToStore(){
        if (this.flag){
            this.flag = false;
            return true;
        }
        System.out.println("We already got this boi you nonce");
        return false;
    }
    public boolean isCheckedOut(){
        return this.flag;
    }
    public String toString(){
        return ("Video[ title = " + this.title + "checked out = " + Boolean.toString(this.flag) + "]");
    }
}