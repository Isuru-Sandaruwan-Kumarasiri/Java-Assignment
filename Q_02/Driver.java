package Q_02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
        
        Album album_1=new Album(1,"Rock");
        Album album_2=new Album(2,"Electronic Dance Music");
        Album album_3=new Album(3,"Hip Hop Music");
        Album album_4=new Album(4,"Jazz");
        Album album_5=new Album(5,"Death Metal");

        try{
            BufferedReader bufferedReader=new BufferedReader(new FileReader("C:\\Users\\Isuru sandaruwan\\Desktop\\2_semester_1\\Data_structure_Lab\\worksheet\\Q_02\\text.txt"));
            String line;
            while((line = bufferedReader.readLine()) != null){
                String[] array=line.split(",");
                int albumID=Integer.parseInt(array[0]);
                int artistNumber=Integer.parseInt(array[1]);
                int numberOfSongs=Integer.parseInt(array[2]);



                switch (albumID){
                    case 1:
                        Artist artist_1=new Artist(artistNumber,numberOfSongs);
                        album_1.addArtist(artist_1);
                        artist_1.setSalary(600*numberOfSongs);
                        break;
                    case 2:
                        Artist artist_2=new Artist(artistNumber,numberOfSongs);
                        album_2.addArtist(artist_2);
                        artist_2.setSalary(800*numberOfSongs);
                        break;
                    case 3:
                        Artist artist_3=new Artist(artistNumber,numberOfSongs);
                        album_3.addArtist(artist_3);
                        artist_3.setSalary(400*numberOfSongs);
                        break;
                    case 4:
                        Artist artist_4=new Artist(artistNumber,numberOfSongs);
                        album_4.addArtist(artist_4);
                        artist_4.setSalary(500*numberOfSongs);
                        break;
                    case 5:
                        Artist artist_5=new Artist(artistNumber,numberOfSongs);
                        album_5.addArtist(artist_5);
                        artist_5.setSalary(700*numberOfSongs);
                        break;
                }



            }

        }catch (Exception e){
            System.out.print(e);
        }
    }
}
