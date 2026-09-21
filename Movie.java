public class Movie {

    private String title;
    private String director;
    private int year;
    private int length;
    private String genre;
    private String rating;
    private String language;

    public Movie(String title, String director, int year, int length, String genre, String rating, String language) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.length = length;
        this.genre = genre;
        this.rating = rating;
        this.language = language;
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




    public String getRating() { 
        return rating;}


    public void setRating(String rating) {
        this.rating = rating;}


        
    public String getLanguage() {
        return language;}

    public void setLanguage(String language) {
        this.language = language;}

}
