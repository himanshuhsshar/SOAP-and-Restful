package com.yatra.dto;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class PassengerDto {
	private String fullname;
	private String gender;
	private int age;

}
