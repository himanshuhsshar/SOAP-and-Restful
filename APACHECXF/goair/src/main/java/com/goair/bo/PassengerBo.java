package com.goair.bo;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class PassengerBo {
	private String fullname;
	private int age;
	private String gender;

}
