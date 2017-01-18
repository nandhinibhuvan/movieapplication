package movieapplication;

import org.springframework.jdbc.core.JdbcTemplate;

public class TestUtil {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JdbcTemplate jdbctemplate=ConnectionUtil.getJdbcTemplate();
		System.out.println(jdbctemplate);
		

	}

}
