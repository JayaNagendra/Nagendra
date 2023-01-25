package repository;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;

import entity.AccountDetail;

public interface AccountDetailRepository extends JpaRepository<AccountDetail, Integer> {

	// SQl query to get last accountID.
	@Query("Select max(accountId) from AccountDetail")
	String getLastAddedAccountId();

	void deleteById(AccountDetail accountDetail);

	// for admin use pending
	// @Query("Select from AccountDetail where accountBalance>=:s")
	// List<AccountDetail>
}