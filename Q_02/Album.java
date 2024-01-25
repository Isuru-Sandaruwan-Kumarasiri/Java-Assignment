package Q_02;

public class Album {
    private int albumID;
    private String genre;
    Artist [] artists=new Artist[10];
    private int index=-1;

    public Album(int albumID, String genre) {
        this.albumID = albumID;
        this.genre = genre;
    }

    public int getAlbumID() {
        return albumID;
    }

    public void setAlbumID(int albumID) {
        this.albumID = albumID;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void addArtist(Artist artist){
        index++;
        artists[index]=artist;

    }
    public void details(){
        ///System.out.print("index-"+index);
        for(int i=0;i<=index;i++){
            System.out.println(artists[i]);
        }
    }
}
