package Q_02;

public class Artist {

   private int artistNumber;
   private int numberOfSong;
   private int salary;


   public Artist(int artistNumber, int numberOfSong) {
      this.artistNumber = artistNumber;
      this.numberOfSong = numberOfSong;
      this.salary=0;
   }

   public int getSalary() {
      return salary;
   }

   public void setSalary(int salary) {
      this.salary = salary;
   }

   public int getArtistNumber() {
      return artistNumber;
   }

   public void setArtistNumber(int artistNumber) {
      this.artistNumber = artistNumber;
   }

   public int getNumberOfSong() {
      return numberOfSong;
   }

   public void setNumberOfSong(int numberOfSong) {
      this.numberOfSong = numberOfSong;
   }

   @Override
   public String toString() {
      return "Artist{" +
              "artistNumber=" + artistNumber +
              ", numberOfSong=" + numberOfSong +
              ", salary=" + salary +
              '}';
   }
}
