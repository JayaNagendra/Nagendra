package model;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name ="Customer")
public class Customer {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator = "seq_id")
	@SequenceGenerator(sequenceName="seq_id", allocationSize=1,name="seq_id")
	private Integer customerId;
	
	@NotBlank(message = "you must enter Full Name")
	@Column(length = 40)
	private String fullName;
	
	private String gender;
	
	
	@NotNull(message = "Please provide Email")
	@NotBlank(message = "It was Mandatry to provide Email")
	@Email(message = "please provide proper mail id....")
	@Column(length = 25)
	private String email;
	
	private String adress;
	
	private long phone;
	
	@OneToMany(fetch =FetchType.EAGER , cascade =CascadeType.ALL,mappedBy = "cust")
	@JsonIgnoreProperties("cust")
	@OnDelete(action=OnDeleteAction.CASCADE)
	
	private List<Cart> itemList=new ArrayList<>();

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public List<Cart> getItemList() {
		return itemList;
	}

	public void setItemList(List<Cart> itemList) {
		this.itemList = itemList;
	}

	public Customer(Integer customerId, @NotBlank(message = "you must enter Full Name") String fullName, String gender,
			@NotNull(message = "Please provide Email") @NotBlank(message = "It was Mandatry to provide Email") @Email(message = "please provide proper mail id....") String email,
			String adress, long phone, List<Cart> itemList) {
		super();
		this.customerId = customerId;
		this.fullName = fullName;
		this.gender = gender;
		this.email = email;
		this.adress = adress;
		this.phone = phone;
		this.itemList = itemList;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	

}
