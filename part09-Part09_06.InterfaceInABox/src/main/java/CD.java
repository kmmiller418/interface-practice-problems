public class CD implements Packable {

    private String artist;
    private String name;
    private int pubYear;

    public CD (String artist, String name, int pubYear){
        this.artist = artist;
        this.name = name;
        this.pubYear = pubYear;
    }
   
    public double weight() {
        return 0.1;
    }

    @Override
    public String toString() {
        return artist + ": " + name + " (" + pubYear + ")";
    }
}
