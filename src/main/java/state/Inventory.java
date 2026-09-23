package state;

import customer.Customer;
import movie.Movie;
import movie.MovieCopy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/***
Singleton Class Holding the app's in-memory states
***/


public final class Inventory {

    private static final Inventory INSTANCE = new Inventory();

    private final List<Customer> customers = new ArrayList<>();
    private final List<Movie> movies = new ArrayList<>();
    private final List<MovieCopy> movieCopies = new ArrayList<>();

    private Inventory() { }

    public static Inventory getInstance() {
        return INSTANCE;
    }

    // Setters
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public void addMovieCopy(MovieCopy copy){
        movieCopies.add(copy);
    }

    // Getters
    public List<Customer> getCustomers() {
        return Collections.unmodifiableList(customers);
    }

    public List<Movie> getMovies() {
        return Collections.unmodifiableList(movies);
    }

    public List<MovieCopy> getMovieCopies(){
        return Collections.unmodifiableList(movieCopies);
    }

    // Filter
    public Optional<Customer> findCustomerById(int id) {
        return customers.stream().filter(c -> c.getId() == id).findFirst();
    }

    public Optional<Movie> findMovieByTitle(String title) {
        return movies.stream().filter(m -> m.getTitle().equals(title)).findFirst();
    }

    public Optional<MovieCopy> findMovieCopyById(int id){
        return movieCopies.stream().filter(mc -> mc.getCopyId() == id).findFirst();
    }

    // once rental and store exists we can add
}