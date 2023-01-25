package entity;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
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
@Table(name = "bank_transactions") // creates table in database
public class BankTransactions {

	// instance variable for BankTransactions entity
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int transactionId;

	// creating columns for table bank_transactions
	@Column(name = "date_of_transaction")
	private LocalDate dateOfTransaction;

	@Column(name = "transaction_type")
	private String transactionType;

	@Column(name = "transaction_amount")
	private double transactionAmount;

	@Column(name = "description_of_transaction")
	private String descriptionOfTransaction;

	// this stores AccountDetail entity using many to one mapping
	// relationship

	@ManyToOne(cascade = CascadeType.ALL)
	@JsonIgnore
	private AccountDetail accountDetail;

	@Builder
	public BankTransactions() {
		super();
		this.dateOfTransaction = dateOfTransaction;
		this.transactionType = transactionType;
		this.transactionAmount = transactionAmount;
		this.descriptionOfTransaction = descriptionOfTransaction;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public LocalDate getDateOfTransaction() {
		return dateOfTransaction;
	}

	public void setDateOfTransaction(LocalDate dateOfTransaction) {
		this.dateOfTransaction = dateOfTransaction;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public double getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public String getDescriptionOfTransaction() {
		return descriptionOfTransaction;
	}

	public void setDescriptionOfTransaction(String descriptionOfTransaction) {
		this.descriptionOfTransaction = descriptionOfTransaction;
	}

	public AccountDetail getAccountDetail() {
		return accountDetail;
	}

	public void setAccountDetail(AccountDetail accountDetail) {
		this.accountDetail = accountDetail;
	}

	

	

}