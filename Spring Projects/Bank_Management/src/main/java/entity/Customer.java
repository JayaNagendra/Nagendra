package entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
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
@Table(name = "customer") // creates table in database
public class Customer {

	// instance variable for customer entity
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customerId;

	// creating columns for table customer
	@Column(name = "customer_name", nullable = false)
	private String customerName;

	@Column(name = "customer_address", nullable = false)
	private String customerAddress;

	@Column(name = "customer_panno", nullable = false)
	private String customerPanNo;

	@Column(name = "customer_adharno", nullable = false)
	private long customerAdharNo;

	@Column(name = "customer_phone", nullable = false)
	private long customerPhone;

	@Column(name = "customer_email", nullable = false)
	private String customerEmail;

	// this stores AccountDetail entity using one to one mapping
	// relationship
	@OneToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, fetch = FetchType.EAGER)
	@JsonIgnore
	private AccountDetail accountDetail;

	@Builder
	public Customer() {
		super();
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.customerPanNo = customerPanNo;
		this.customerAdharNo = customerAdharNo;
		this.customerPhone = customerPhone;
		this.customerEmail = customerEmail;
		this.accountDetail = accountDetail;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getCustomerPanNo() {
		return customerPanNo;
	}

	public void setCustomerPanNo(String customerPanNo) {
		this.customerPanNo = customerPanNo;
	}

	public long getCustomerAdharNo() {
		return customerAdharNo;
	}

	public void setCustomerAdharNo(long customerAdharNo) {
		this.customerAdharNo = customerAdharNo;
	}

	public long getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(long customerPhone) {
		this.customerPhone = customerPhone;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public AccountDetail getAccountDetail() {
		return accountDetail;
	}

	public void setAccountDetail(AccountDetail accountDetail) {
		this.accountDetail = accountDetail;
	}

	

}