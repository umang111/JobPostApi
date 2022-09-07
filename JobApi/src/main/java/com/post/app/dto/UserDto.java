package com.post.app.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

	private int userId;
	private String userName;
	private String userEmail;
	private String userPassword;
	private String workExperience;
	private List<String> skills;
	
}
