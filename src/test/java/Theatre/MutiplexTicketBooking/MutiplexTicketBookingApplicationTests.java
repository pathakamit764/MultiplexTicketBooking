package Theatre.MutiplexTicketBooking;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.MTB.entites.Movies;
import com.MTB.repository.MoviesRepository;
import com.MTB.repository.ShowsRepository;
import com.MTB.repository.UsersRepository;



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