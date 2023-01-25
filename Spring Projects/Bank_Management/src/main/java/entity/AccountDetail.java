package entity;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
@Table(name = "account") // creates table in database
public class AccountDetail {

	// instance variable for AccountDetail entity
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int accountId;

	// creating columns for table account

	@Column(name = "account_number")
	private long accountNumber;

	@Column(name = "open_date")
	private LocalDate openDate;

	@Column(name = "account_type", nullable = false)
	private String accountType;

	@Column(name = "account_balance", nullable = false)
	private double accountBalance;

	// this connect with BankTransactions entity using one to many mapping
	// relationship

	@OneToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH,
			CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@JsonIgnore
	private List<BankTransactions> bankTransactions;

	@Builder
	public AccountDetail() {
		super();
		this.accountNumber = accountNumber;
		this.openDate = openDate;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
		
		
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public LocalDate getOpenDate() {
		return openDate;
	}

	public void setOpenDate(LocalDate openDate) {
		this.openDate = openDate;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public List<BankTransactions> getBankTransactions() {
		return bankTransactions;
	}

	public void setBankTransactions(List<BankTransactions> bankTransactions) {
		this.bankTransactions = bankTransactions;
	}

}