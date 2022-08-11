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

	public int savePassenger(final PassengerBo passengerBo) {
		KeyHolder keyHolder = null;
		int passengerNo = 0;
		keyHolder = new GeneratedKeyHolder();
		jdbcTemplate.update((con) -> {
			PreparedStatement preparedStatement = con.prepareStatement(SQL_INSERT_PASSENGER,
					new String[] { "passenger_no" });
			preparedStatement.setString(1, passengerBo.getFullname());
			preparedStatement.setInt(2, passengerBo.getAge());
			preparedStatement.setString(3, passengerBo.getGender());
			return preparedStatement;
		}, keyHolder);
		passengerNo = keyHolder.getKey().intValue();
		return passengerNo;
	}

}
