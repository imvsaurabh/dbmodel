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
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	private String id;
	private String firstname;
	private String lastname;
	private String mobile;
	private String dob;
}
