import java.util.ArrayList;

public class VideoStore{
    private ArrayList<Video> videos = new ArrayList<Video>();

    public VideoStore(){
        this.videos = videos;
    }

    public boolean addVideo(String title){
        Video temp = new Video(title);
        if (!this.videos.contains(temp)){
            this.videos.add(temp);
            return true;
        }
        System.out.println("we already got that boi");
        return false;
    }

    public boolean checkOutVideo(String title){
        Video temp = new Video(title);
        if (this.videos.contains(temp) && !temp.isCheckedOut()){
            (this.videos.at(temp)).checkOut();
            return true;
        }
        System.out.println("uuuuuhhhh");
        return false;
    }

    public Video getVideo(String title){
        Video temp = new Video(title);
        if (this.videos.contains(temp)){
            return this.videos.at(temp).toString();
        }
        System.out.prinln("REEEEE");
        return null;
    }
    public boolean returnVideo(Video video){
        return this.videos.at(video).returnToStore();
    }
    public void addRating(Video video, int rating){
        this.videos.set(this.videos);
    }
    public double getAverageRatingForVideo(Video video){
        return this.videos.at(video).getAverageRating();
    }
    public Video[] getCheckedOut(){
        ArrayList<Video> list = new ArrayList<Video>();
        for (Video video : this.videos){
            if (video.isCheckedOut()){
                list.add(video);
            }
        }
        Video[] list2 = new Video[list.size()];
        for (int i = 0; i < list2.length; i++){
            list2[i] = list.get(i);
        }
        return list2;
    }
    public Video getMostPopular(){
        double max = 0.0;
        Video currentVid = Video("boop");
        for (Video video: this.videos){
            if (video.getAverageRating() > max){
                max = video.getAverageRating();
                currentVid = video;
            }
        }
        return currentVid;
    }
}