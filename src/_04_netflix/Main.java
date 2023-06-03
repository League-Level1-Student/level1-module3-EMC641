package _04_netflix;

public class Main {
public static void main(String[] args) {
	Movie harryPotter = new Movie("Harry Potter", 4);
	Movie twilight = new Movie("Twilight",2);
	Movie boring = new Movie("A Very Boring Movie", 1);
	Movie annie = new Movie("Annie", 5);
	Movie superMarioBros = new Movie("Super Mario Bros Movie", 3);
	
	harryPotter.getTicketPrice();
	
	NetflixQueue netflix = new NetflixQueue();

	netflix.addMovie(harryPotter);
	netflix.addMovie(twilight);
	netflix.addMovie(boring);
	netflix.addMovie(annie);
	netflix.addMovie(superMarioBros);
	
	netflix.printMovies();
	netflix.sortMoviesByRating();
	
	System.out.println("                         ");
	
	
	System.out.println("The best movie is "+ netflix.getBestMovie());
	System.out.println("The second best movie is " + netflix.get2BestMovie());
	System.out.println("The third best movie is " + netflix.get3BestMovie());
	System.out.println("The fourth best movie is " +netflix.get4BestMovie());
	System.out.println("The fifth best movie is "+ netflix.get5BestMovie());
}
}
