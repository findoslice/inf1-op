public class Favourites{
    private MusicTrack mt[] = new MusicTrack[5];
    private int count = 0;

    public Favourites(){
        this.mt = mt;
        this.count = 0;
    }

    public void addTrack(String artist, String title){
        if (count < 5){
            this.mt[count] = new MusicTrack(artist, title);
            count++;
        } else{
            System.out.println("Warning: failed to add song " + title + " by artist " + artist + " due to insufficient space");
        }
    }

    public void showFavourites(){
        for (MusicTrack track : mt){
            System.out.println(track.toString());
        }
    }

    public static void main(String args[]){
        Favourites favourites = new Favourites();
        favourites.addTrack("Fun", "Some Nights");
        favourites.addTrack("Oliver Tank", "Help You Breathe");
        favourites.addTrack("Horse Feathers", "Fit Against the Country");
        favourites.addTrack("Emile Sande", "Country House");
        favourites.addTrack("Fun", "Walking the Dog");
        favourites.addTrack("Porcelain Raft", "Put Me To Sleep");
        favourites.showFavourites();
    }
}