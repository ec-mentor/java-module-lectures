package academy.everyonecodes.java.week7.livecoding.extra.exercise3;

import java.util.List;
import java.util.Objects;

public class Movie {
    private int id;
    private String title;
    private double revenue;
    private double runtimeInMinutes;
    private List<Genre> genres;
    private double budget;

    public Movie(int id, String title, double revenue, double runtimeInMinutes, List<Genre> genres, double budget) {
        this.id = id;
        this.title = title;
        this.revenue = revenue;
        this.runtimeInMinutes = runtimeInMinutes;
        this.genres = genres;
        this.budget = budget;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public double getRevenue() {
        return revenue;
    }

    public double getRuntimeInMinutes() {
        return runtimeInMinutes;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public double getBudget() {
        return budget;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return id == movie.id && Double.compare(movie.revenue, revenue) == 0 && Double.compare(movie.runtimeInMinutes, runtimeInMinutes) == 0 && Double.compare(movie.budget, budget) == 0 && Objects.equals(title, movie.title) && Objects.equals(genres, movie.genres);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, revenue, runtimeInMinutes, genres, budget);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", revenue=" + revenue +
                ", runtimeInMinutes=" + runtimeInMinutes +
                ", genres=" + genres +
                ", budget=" + budget +
                '}';
    }
}
