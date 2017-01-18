package movieapplication;

public class TestDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Movie movie=new Movie();
  movie.setId(3);
  movie.setName("advanced java");
  MovieDAO movieDAO=new MovieDAO();
//  movieDAO.add(movie);
  movieDAO.update(movie);
	}

}