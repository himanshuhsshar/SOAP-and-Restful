package com.goair.dao;

import java.sql.PreparedStatement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.goair.bo.PassengerBo;

@Repository
public class PassengerDao {
	private final String SQL_INSERT_PASSENGER = "insert into passenger(fullname, age, gender) values(?,?,?)";
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public int savePassenger(final PassengerBo bo) {
		KeyHolder kh = null;
		int passengerNo = 0;

		kh = new GeneratedKeyHolder();
		jdbcTemplate.update((con) -> {
			PreparedStatement pstmt = con.prepareStatement(SQL_INSERT_PASSENGER, new String[] { "passenger_no" });
			pstmt.setString(1, bo.getFullname());
			pstmt.setInt(2, bo.getAge());
			pstmt.setString(3, bo.getGender());
			return pstmt;
		}, kh);
		passengerNo = kh.getKey().intValue();
		return passengerNo;
	}

}
