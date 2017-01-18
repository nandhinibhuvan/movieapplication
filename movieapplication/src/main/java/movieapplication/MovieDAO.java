package movieapplication;

import org.springframework.jdbc.core.JdbcTemplate;

public class MovieDAO{
	JdbcTemplate jdbctemplate=ConnectionUtil.getJdbcTemplate();
public void add(Movie movie)
{
  String sql="insert into movie(id,name)values(?,?)";
  Object[] params={movie.getId(),movie.getName()};
  int rows=jdbctemplate.update(sql,params);
  System.out.println("no of row inserted "+rows);

}
public void remove(int  id)
{
	String sql="delete from movie where id=?";
	int rows=jdbctemplate.update(sql,id);
	System.out.println("no of row deleted "+rows);
}
public void update(Movie movie)
{
	String sql="update movie set name=? where id=?";
	  Object[] params={movie.getName(),movie.getId()};
	  int rows=jdbctemplate.update(sql,params);
	  System.out.println("no of row updated "+rows);


}}
