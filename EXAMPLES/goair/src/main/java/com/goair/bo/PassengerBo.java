package com.goair.bo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@AllArgsConstructor
@Getter
@Setter
public class PassengerBo {
	private String fullname;
	private int age;
	private String gender;

}
