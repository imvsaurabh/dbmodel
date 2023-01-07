package com.github.imvsaurabh.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Address {
	private String id;
	private String rollnum;
	private String state;
	private String city;
	private String country;
	private String street;
	private String zipcode;
}
