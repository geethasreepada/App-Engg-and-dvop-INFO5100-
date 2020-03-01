import java.util.ArrayList;
import java.util.TreeSet;

public class Mreview implements Comparable<Mreview> {

    private String title;
    ArrayList<Integer> ratings = new ArrayList<>();

    public Mreview() {
        this.title = "";
        this.ratings = new ArrayList<>();
    }

    public Mreview(String ttl) {
        this.title = ttl;
        ArrayList<Integer> ratings = new ArrayList<>();
    }

    public Mreview(String ttl, int firstRating) {
        this.title = ttl;
        this.ratings = new ArrayList<>(1);
        ratings.add(firstRating);
    }

    public void addRating(int r) {
        ratings.add(r);

    }

    public int numRatings() {
        return ratings.size();
    }

    public String getTitle() {
        return this.title;
    }

    public double aveRating() {
        double sum = 0;
        for (int i = 0; i < numRatings(); i++) {
            sum += ratings.get(i);
        }
        double ave = sum / numRatings();
        return ave;

    }

    @Override
    public int compareTo(Mreview obj) {
        return (this.title).compareTo(obj.title);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;

        }
        Mreview anotherobject = (Mreview) obj;
        if (anotherobject.title == this.title) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "For a movie " + getTitle() + "that has a rating" + aveRating() + "out of " + numRatings() + "ratings";


    }

    public static void main(String[] args) {
        Mreview movie = new Mreview("killBill");
        movie.addRating(3);
        movie.addRating(4);
        movie.addRating(5);
        System.out.println(movie.toString());

        TreeSet movieset=new TreeSet();
        Mreview m=new Mreview("Indra",4);
        Mreview m1=new Mreview("telugu",5);
movieset.add(m);
movieset.add(m1);
        System.out.println(movieset);

        MovieRatingCompare r1= new MovieRatingCompare();
        TreeSet<Mreview> movieSetByRating= new TreeSet<>(r1);
        movieSetByRating.add(movie);
        movieSetByRating.add(m1);

        System.out.println(movieSetByRating);



    }

    }



