package Util;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import entity.AccountDetail;
import model.AccountDetailDTO;

@Component
public class AccountDetailConverter {

	// convert AccountDetailDTO to Entity(AccountDetail)
	public AccountDetail convertToEntity(AccountDetailDTO accountDetailDTO) {

		AccountDetail accountDetail = new AccountDetail();
		if (accountDetailDTO != null) {
			BeanUtils.copyProperties(accountDetailDTO, accountDetail);
		}

		return accountDetail;
	}

	// convert AccountDetail to (AccountDetailDTO)
	public AccountDetailDTO convertToAccountDetailDTO(AccountDetail accountDetail) {

		AccountDetailDTO accountDetailDTO = new AccountDetailDTO();
		if (accountDetail != null) {
			BeanUtils.copyProperties(accountDetail, accountDetailDTO);
		}

		return accountDetailDTO;
	}
}