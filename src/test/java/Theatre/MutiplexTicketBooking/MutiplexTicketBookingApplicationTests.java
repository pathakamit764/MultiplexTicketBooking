package Theatre.MutiplexTicketBooking;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cinema.dao.MoviesRepository;
import com.cinema.dao.ShowsRepository;
import com.cinema.dao.UsersRepository;
import com.cinema.entity.Movies;

@SpringBootTest
class TicketBookingApplicationTests {
	@Autowired
	MoviesRepository movierepo;
	@Autowired
	UsersRepository userrepo;
	@Autowired
	ShowsRepository showsrepositary;
	@Test
	void testMovies() {
		Movies movie = new Movies();
		movie.setMovieId(6);
		movie.setMovieName("rrr");
		movierepo.save(movie);
		assertNotNull(movierepo.findById(6).get());
	}

	@Test
	void testLogin() {
		assertNotNull(userrepo.findByEmailIdAndPassward("shabbir29@gmail.com", "123456789"));
	}
	@Test
	void testGetShow(){
		assertNotNull(showsrepositary.findById(1));
	}

}