package com.perennial.eshop.forms;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class SignUpForm {

	private String username;
	private String password;
	private String name;
	private Date dob;
	
}
