package com.phillip.services.notification.models;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * This is Dto class which return from the /investment/account webservice call
 * 
 * @author Bui Dang Khoa
 * 
 */
@XmlRootElement(name = "AccountInfoResult")
public class AccountInfo extends BaseObject {
	private Integer accountNo;
	private String accountName;
	private Date lastTradeDate;
	private String accountType;
	private BigDecimal balance;
	private BigDecimal totalInvestment;
	private Date lastLoginDate;
	private String status;
	private List<BigDecimal> investmentList;

	@XmlElement
	public Integer getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(Integer accountNo) {
		this.accountNo = accountNo;
	}

	@XmlElement
	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	@XmlElement
	public Date getLastTradeDate() {
		return lastTradeDate;
	}

	public void setLastTradeDate(Date lastTradeDate) {
		this.lastTradeDate = lastTradeDate;
	}

	@XmlElement
	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	@XmlElement
	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	@XmlElement
	public BigDecimal getTotalInvestment() {
		return totalInvestment;
	}

	public void setTotalInvestment(BigDecimal totalInvestment) {
		this.totalInvestment = totalInvestment;
	}

	@XmlElement
	public Date getLastLoginDate() {
		return lastLoginDate;
	}

	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}

	@XmlElement
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@XmlElement
	public List<BigDecimal> getInvestmentList() {
		return investmentList;
	}

	public void setInvestmentList(List<BigDecimal> investmentList) {
		this.investmentList = investmentList;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((accountName == null) ? 0 : accountName.hashCode());
		result = prime * result
				+ ((accountNo == null) ? 0 : accountNo.hashCode());
		result = prime * result
				+ ((accountType == null) ? 0 : accountType.hashCode());
		result = prime * result + ((balance == null) ? 0 : balance.hashCode());
		result = prime * result
				+ ((investmentList == null) ? 0 : investmentList.hashCode());
		result = prime * result
				+ ((lastLoginDate == null) ? 0 : lastLoginDate.hashCode());
		result = prime * result
				+ ((lastTradeDate == null) ? 0 : lastTradeDate.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result
				+ ((totalInvestment == null) ? 0 : totalInvestment.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		AccountInfo other = (AccountInfo) obj;
		if (accountName == null) {
			if (other.accountName != null)
				return false;
		} else if (!accountName.equals(other.accountName))
			return false;
		if (accountNo == null) {
			if (other.accountNo != null)
				return false;
		} else if (!accountNo.equals(other.accountNo))
			return false;
		if (accountType == null) {
			if (other.accountType != null)
				return false;
		} else if (!accountType.equals(other.accountType))
			return false;
		if (balance == null) {
			if (other.balance != null)
				return false;
		} else if (!balance.equals(other.balance))
			return false;
		if (investmentList == null) {
			if (other.investmentList != null)
				return false;
		} else if (!investmentList.equals(other.investmentList))
			return false;
		if (lastLoginDate == null) {
			if (other.lastLoginDate != null)
				return false;
		} else if (!lastLoginDate.equals(other.lastLoginDate))
			return false;
		if (lastTradeDate == null) {
			if (other.lastTradeDate != null)
				return false;
		} else if (!lastTradeDate.equals(other.lastTradeDate))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (totalInvestment == null) {
			if (other.totalInvestment != null)
				return false;
		} else if (!totalInvestment.equals(other.totalInvestment))
			return false;
		return true;
	}

	
}
