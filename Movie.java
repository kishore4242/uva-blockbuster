public class Movie {

    private String title;
    private String director;
    private int year;
    private int length;
    private String genre;
    

    public Movie(String title, String director, int year, int length, String genre) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.length = length;
        this.genre = genre;
        
    }
    

    public String getTitle() {
        return title;}

    public void setTitle(String title) {
        this.title = title;}



    public String getDirector() {
        return director;}

    public void setDirector(String director) {
        this.director = director;}




    public int getYear() {
        return year;}

    public void setYear(int year) {
        this.year = year;}




    public int getLength() {
        return length;}

    public void setLength(int length) {
        this.length = length;}




    public String getGenre() {
        return genre;}

    public void setGenre(String genre) {
        this.genre = genre;}

}
