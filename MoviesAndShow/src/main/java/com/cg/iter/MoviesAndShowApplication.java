package com.cg.iter;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cg.iter.dao.IShowDao;
import com.cg.iter.dao.IUniversalDao;
import com.movie.entities.Show;



@SpringBootApplication
public class MoviesAndShowApplication implements CommandLineRunner {
	
	

	public static void main(String[] args) {
		SpringApplication.run(MoviesAndShowApplication.class, args);
	}

	@Autowired
	IShowDao dao;
	
	
	@Autowired
	IUniversalDao<Show> dao4;
	
	
	
	public void run(String... args) throws Exception {


		System.out.println("Started successfully");
	}

}





// TODO Auto-generated method stub'
/*
Movie movie=dao.findById(4);
Movie movie2=dao.findById(6);
Movie movie3=dao.findById(7);



Customer c=dao.getCustomer(3);
System.out.println(c.getUsername());
Set<Movie> movies=t.getListOfMovies();

for (Iterator iterator = t.getListOfMovies().iterator(); iterator.hasNext();) {
	Movie type = (Movie) iterator.next();
	System.out.println(type.getMovieName());;
};

movies.add(movie);
movies.add(movie2);
movies.add(movie3);



t.setListOfMovies(movies);

dao2.update(t);




dao2.update(t);
t=dao2.update(t);

System.out.println(t.getTheatreName());

System.out.println(movie.getDirector());
movie.setDirector("Priyadarshini");
movie.setGenre("Comedy");
movie.setHero("Akshay Kumar");
movie.setHeroine("Kareena Kapoor");
movie.setMovieName("Good newz");




dao.addMovie(movie);















Show s=new Show();
s.setMovie(dao3.findById(4));
s.setSeats(null);
s.setShowEndTime(Timestamp.valueOf(LocalDateTime.now()));
s.setShowStartTime(Timestamp.valueOf(LocalDateTime.now()));
s.setShowName("Morning show");
s.setTheatreId(t);
dao.save(s);
try
{
List<Show> shows=dao.findActiveShows();
for (Iterator iterator = shows.iterator(); iterator.hasNext();) {
	Show show = (Show) iterator.next();
	System.out.println(show.getShowStartTime().format(DateTimeFormatter.ofPattern("dd-MM-YYYY, EEEE HH:mm:ss")));
}
}
catch(NullPointerException e)
{
	System.out.println("null pointer exception ");
}
System.out.println("hey karan");
}




Seat Insertion
Show s=dao4.findById(8);
List<Seat> seats=new ArrayList<Seat>();
for (int i = 0; i < s1.getHallHeight(); i++) {
	for (int j = 0; j < s1.getHallWidth(); j++) {
		Seat seat=new Seat();
		seat.setSeatPrice(100.0);
		seat.setShow(s);
		seat.setSeatStatus(SeatState.AVAILABLE);
		dao6.save(seat);
		seats.add(seat);
		}
}
s.setSeats(seats);
dao4.update(s);
*/

