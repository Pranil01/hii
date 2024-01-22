package com.blog.paylods;






import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class UserDto 

{

	
	private int id;
	
	@Email(message="Email Address is not valid !!.")
	private String email;
	@NotEmpty
	@Size(min=4,message="User name at least 4 characters.!!")
	private String name;
	@NotEmpty
	@Size(min=4,max=10,message="User Password should between 4  to 10 characters.!!")
	@Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$")

	private String password;
	@NotEmpty
	private String about;
	
	
}
