package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "admin")
public class Admin {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(unique = true, name = "user_name")
	private String userName;

	@Column(name = "password")
	private String password;

	public Object getUserName() {
		// TODO Auto-generated method stub
		return null;
	}



	public void setPassword(String newPassword) {
		// TODO Auto-generated method stub
		
	}

	public Object getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

}