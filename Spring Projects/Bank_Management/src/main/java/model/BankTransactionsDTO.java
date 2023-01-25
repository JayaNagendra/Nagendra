package model;

import java.time.LocalDate;

import entity.AccountDetail;
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
public class BankTransactionsDTO {

	// copy of instance variable created 
	private int transactionId;

	private LocalDate dateOfTransaction;

	private String transactionType;

	private double transactionAmount;

	private String descriptionOfTransaction;

	private AccountDetail accountDetail;
}