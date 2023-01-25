package model;

import entity.AccountDetail;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
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
public class CustomerDTO {

	// giving instance variable size and value(notnull) 
	// copy of instance variable created 
	@NotNull
	@Size(min = 1)
	private int customerId;

	@NotNull
	@Size(min = 1)
	private String customerName;

	@NotNull
	@Size(min = 1)
	private String customerAddress;

	@NotNull
	@Size(min = 1)
	private String customerPanNo;

	@NotNull
	@Size(min = 1)
	private long customerAdharNo;

	@NotNull
	@Size(min = 1)
	private long customerPhone;

	@NotNull
	@Size(min = 1)
	@Email
	private String customerEmail;

	private AccountDetail accountDetail;
}
