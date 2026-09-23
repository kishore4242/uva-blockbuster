package movie;

public class MovieCopy {

    private Movie movie;
    private int copyId;
    private Status status;
    private enum Status{AVAILABLE, RENTED, DAMAGED, LOST};
    private int copyNumber;
    private int totalCopies;

    public MovieCopy(Movie movie, int copyId, Status status, int copyNumber, int totalCopies) {
        this.movie = movie;
        this.copyId = copyId;
        this.status = status;
        this.copyNumber = copyNumber;
        this.totalCopies = totalCopies;
    }


    public Movie getMovie() {
        // can't be null
        if (movie == null) {
            throw new IllegalArgumentException("Movie cannot be null");
        }
        return movie;
    }



    public int getCopyId() {       
        // must be a positive integer
        if (copyId <= 0) {
            throw new IllegalArgumentException("Copy ID must be a positive integer");
        }
        return copyId;
    }



    public Status getStatus() {
        // must be a valid status
        if (status == null) {
            throw new IllegalArgumentException("Status cannot be null");
        }
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }


    public int getCopyNumber() {
        // must be a positive integer
        if (copyNumber <= 0) {
            throw new IllegalArgumentException("Copy number must be a positive integer");
        }
        return copyNumber;
    }

    public int getTotalCopies() {
        // must be a positive integer
        if (totalCopies <= 0) {
            throw new IllegalArgumentException("Total copies must be a positive integer");
        }
        return totalCopies;
    }


    // constructor
    public static MovieCopy createMovieCopy(Movie movie, int copyId, Status status, int copyNumber, int totalCopies) {
        return new MovieCopy(movie, copyId, status, copyNumber, totalCopies);
    }
    
}
