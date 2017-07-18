package com.phillip.services.notification.models;

import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @author Bui Dang Khoa
 *
 */
@XmlRootElement(name = "BondInfo")
public class BondInfo extends BaseObject {
	private String ISIN;
	private String bondName;
	private String issuer;
	private String currency;
	private BigDecimal couponRate;
	private Date maturityDate;
	private Date nextCouponDate;
	private BigDecimal bidPrice;
	private BigDecimal bidYield;
	private BigDecimal offerPrice;
	private BigDecimal offerYield;
	private Date settlementDate;
	private String industry;
	private String secRank;
	private String couponFrequency;
	private Date callDate;
	private String couponType;
	private String ratingFitch;
	private String ratingMoodys;
	private String ratingSP;
	private BigDecimal amtIssued;
	private BigDecimal amtOutstanding;
	private BigDecimal minimumInvAmt;
	private BigDecimal incrementInvAmt;
	private Date lastCouponDate;
	
	
	@XmlElement
	public String getISIN() {
		return ISIN;
	}
	public void setISIN(String iSIN) {
		ISIN = iSIN;
	}
	@XmlElement
	public String getBondName() {
		return bondName;
	}
	public void setBondName(String bondName) {
		this.bondName = bondName;
	}
	@XmlElement
	public String getIssuer() {
		return issuer;
	}
	public void setIssuer(String issuer) {
		this.issuer = issuer;
	}
	@XmlElement
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	@XmlElement
	public BigDecimal getCouponRate() {
		return couponRate;
	}
	public void setCouponRate(BigDecimal couponRate) {
		this.couponRate = couponRate;
	}
	@XmlElement
	public Date getMaturityDate() {
		return maturityDate;
	}
	public void setMaturityDate(Date maturityDate) {
		this.maturityDate = maturityDate;
	}
	@XmlElement
	public Date getNextCouponDate() {
		return nextCouponDate;
	}
	public void setNextCouponDate(Date nextCouponDate) {
		this.nextCouponDate = nextCouponDate;
	}
	@XmlElement
	public BigDecimal getBidPrice() {
		return bidPrice;
	}
	public void setBidPrice(BigDecimal bidPrice) {
		this.bidPrice = bidPrice;
	}
	@XmlElement
	public BigDecimal getBidYield() {
		return bidYield;
	}
	public void setBidYield(BigDecimal bidYield) {
		this.bidYield = bidYield;
	}
	@XmlElement
	public BigDecimal getOfferPrice() {
		return offerPrice;
	}
	public void setOfferPrice(BigDecimal offerPrice) {
		this.offerPrice = offerPrice;
	}
	@XmlElement
	public BigDecimal getOfferYield() {
		return offerYield;
	}
	public void setOfferYield(BigDecimal offerYield) {
		this.offerYield = offerYield;
	}
	@XmlElement
	public Date getSettlementDate() {
		return settlementDate;
	}
	public void setSettlementDate(Date settlementDate) {
		this.settlementDate = settlementDate;
	}
	/**
	 * @return the industry
	 */
	@XmlElement
	public String getIndustry() {
		return industry;
	}
	/**
	 * @param industry the industry to set
	 */
	public void setIndustry(String industry) {
		this.industry = industry;
	}
	/**
	 * @return the secRank
	 */
	@XmlElement
	public String getSecRank() {
		return secRank;
	}
	/**
	 * @param secRank the secRank to set
	 */
	public void setSecRank(String secRank) {
		this.secRank = secRank;
	}
	/**
	 * @return the couponFrequency
	 */
	@XmlElement
	public String getCouponFrequency() {
		return couponFrequency;
	}
	/**
	 * @param couponFrequency the couponFrequency to set
	 */
	public void setCouponFrequency(String couponFrequency) {
		this.couponFrequency = couponFrequency;
	}
	/**
	 * @return the callDate
	 */
	@XmlElement
	public Date getCallDate() {
		return callDate;
	}
	/**
	 * @param callDate the callDate to set
	 */
	public void setCallDate(Date callDate) {
		this.callDate = callDate;
	}
	/**
	 * @return the couponType
	 */
	@XmlElement
	public String getCouponType() {
		return couponType;
	}
	/**
	 * @param couponType the couponType to set
	 */
	public void setCouponType(String couponType) {
		this.couponType = couponType;
	}
	/**
	 * @return the ratingFitch
	 */
	@XmlElement
	public String getRatingFitch() {
		return ratingFitch;
	}
	/**
	 * @param ratingFitch the ratingFitch to set
	 */
	public void setRatingFitch(String ratingFitch) {
		this.ratingFitch = ratingFitch;
	}
	/**
	 * @return the ratingMoodys
	 */
	@XmlElement
	public String getRatingMoodys() {
		return ratingMoodys;
	}
	/**
	 * @param ratingMoodys the ratingMoodys to set
	 */
	public void setRatingMoodys(String ratingMoodys) {
		this.ratingMoodys = ratingMoodys;
	}
	/**
	 * @return the ratingSP
	 */
	@XmlElement
	public String getRatingSP() {
		return ratingSP;
	}
	/**
	 * @param ratingSP the ratingSP to set
	 */
	public void setRatingSP(String ratingSP) {
		this.ratingSP = ratingSP;
	}
	/**
	 * @return the amtIssued
	 */
	@XmlElement
	public BigDecimal getAmtIssued() {
		return amtIssued;
	}
	/**
	 * @param amtIssued the amtIssued to set
	 */
	public void setAmtIssued(BigDecimal amtIssued) {
		this.amtIssued = amtIssued;
	}
	/**
	 * @return the amtOutstanding
	 */
	@XmlElement
	public BigDecimal getAmtOutstanding() {
		return amtOutstanding;
	}
	/**
	 * @param amtOutstanding the amtOutstanding to set
	 */
	public void setAmtOutstanding(BigDecimal amtOutstanding) {
		this.amtOutstanding = amtOutstanding;
	}
	/**
	 * @return the minimumInvAmt
	 */
	@XmlElement
	public BigDecimal getMinimumInvAmt() {
		return minimumInvAmt;
	}
	/**
	 * @param minimumInvAmt the minimumInvAmt to set
	 */
	public void setMinimumInvAmt(BigDecimal minimumInvAmt) {
		this.minimumInvAmt = minimumInvAmt;
	}
	/**
	 * @return the incrementInvAmt
	 */
	@XmlElement
	public BigDecimal getIncrementInvAmt() {
		return incrementInvAmt;
	}
	/**
	 * @param incrementInvAmt the incrementInvAmt to set
	 */
	public void setIncrementInvAmt(BigDecimal incrementInvAmt) {
		this.incrementInvAmt = incrementInvAmt;
	}
	/**
	 * @return the lastCouponDate
	 */
	@XmlElement
	public Date getLastCouponDate() {
		return lastCouponDate;
	}
	/**
	 * @param lastCouponDate the lastCouponDate to set
	 */
	public void setLastCouponDate(Date lastCouponDate) {
		this.lastCouponDate = lastCouponDate;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ISIN == null) ? 0 : ISIN.hashCode());
		result = prime * result
				+ ((amtIssued == null) ? 0 : amtIssued.hashCode());
		result = prime * result
				+ ((amtOutstanding == null) ? 0 : amtOutstanding.hashCode());
		result = prime * result
				+ ((bidPrice == null) ? 0 : bidPrice.hashCode());
		result = prime * result
				+ ((bidYield == null) ? 0 : bidYield.hashCode());
		result = prime * result
				+ ((bondName == null) ? 0 : bondName.hashCode());
		result = prime * result
				+ ((callDate == null) ? 0 : callDate.hashCode());
		result = prime * result
				+ ((couponFrequency == null) ? 0 : couponFrequency.hashCode());
		result = prime * result
				+ ((couponRate == null) ? 0 : couponRate.hashCode());
		result = prime * result
				+ ((couponType == null) ? 0 : couponType.hashCode());
		result = prime * result
				+ ((currency == null) ? 0 : currency.hashCode());
		result = prime * result
				+ ((incrementInvAmt == null) ? 0 : incrementInvAmt.hashCode());
		result = prime * result
				+ ((industry == null) ? 0 : industry.hashCode());
		result = prime * result + ((issuer == null) ? 0 : issuer.hashCode());
		result = prime * result
				+ ((lastCouponDate == null) ? 0 : lastCouponDate.hashCode());
		result = prime * result
				+ ((maturityDate == null) ? 0 : maturityDate.hashCode());
		result = prime * result
				+ ((minimumInvAmt == null) ? 0 : minimumInvAmt.hashCode());
		result = prime * result
				+ ((nextCouponDate == null) ? 0 : nextCouponDate.hashCode());
		result = prime * result
				+ ((offerPrice == null) ? 0 : offerPrice.hashCode());
		result = prime * result
				+ ((offerYield == null) ? 0 : offerYield.hashCode());
		result = prime * result
				+ ((ratingFitch == null) ? 0 : ratingFitch.hashCode());
		result = prime * result
				+ ((ratingMoodys == null) ? 0 : ratingMoodys.hashCode());
		result = prime * result
				+ ((ratingSP == null) ? 0 : ratingSP.hashCode());
		result = prime * result + ((secRank == null) ? 0 : secRank.hashCode());
		result = prime * result
				+ ((settlementDate == null) ? 0 : settlementDate.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof BondInfo))
			return false;
		BondInfo other = (BondInfo) obj;
		if (ISIN == null) {
			if (other.ISIN != null)
				return false;
		} else if (!ISIN.equals(other.ISIN))
			return false;
		if (amtIssued == null) {
			if (other.amtIssued != null)
				return false;
		} else if (!amtIssued.equals(other.amtIssued))
			return false;
		if (amtOutstanding == null) {
			if (other.amtOutstanding != null)
				return false;
		} else if (!amtOutstanding.equals(other.amtOutstanding))
			return false;
		if (bidPrice == null) {
			if (other.bidPrice != null)
				return false;
		} else if (!bidPrice.equals(other.bidPrice))
			return false;
		if (bidYield == null) {
			if (other.bidYield != null)
				return false;
		} else if (!bidYield.equals(other.bidYield))
			return false;
		if (bondName == null) {
			if (other.bondName != null)
				return false;
		} else if (!bondName.equals(other.bondName))
			return false;
		if (callDate == null) {
			if (other.callDate != null)
				return false;
		} else if (!callDate.equals(other.callDate))
			return false;
		if (couponFrequency == null) {
			if (other.couponFrequency != null)
				return false;
		} else if (!couponFrequency.equals(other.couponFrequency))
			return false;
		if (couponRate == null) {
			if (other.couponRate != null)
				return false;
		} else if (!couponRate.equals(other.couponRate))
			return false;
		if (couponType == null) {
			if (other.couponType != null)
				return false;
		} else if (!couponType.equals(other.couponType))
			return false;
		if (currency == null) {
			if (other.currency != null)
				return false;
		} else if (!currency.equals(other.currency))
			return false;
		if (incrementInvAmt == null) {
			if (other.incrementInvAmt != null)
				return false;
		} else if (!incrementInvAmt.equals(other.incrementInvAmt))
			return false;
		if (industry == null) {
			if (other.industry != null)
				return false;
		} else if (!industry.equals(other.industry))
			return false;
		if (issuer == null) {
			if (other.issuer != null)
				return false;
		} else if (!issuer.equals(other.issuer))
			return false;
		if (lastCouponDate == null) {
			if (other.lastCouponDate != null)
				return false;
		} else if (!lastCouponDate.equals(other.lastCouponDate))
			return false;
		if (maturityDate == null) {
			if (other.maturityDate != null)
				return false;
		} else if (!maturityDate.equals(other.maturityDate))
			return false;
		if (minimumInvAmt == null) {
			if (other.minimumInvAmt != null)
				return false;
		} else if (!minimumInvAmt.equals(other.minimumInvAmt))
			return false;
		if (nextCouponDate == null) {
			if (other.nextCouponDate != null)
				return false;
		} else if (!nextCouponDate.equals(other.nextCouponDate))
			return false;
		if (offerPrice == null) {
			if (other.offerPrice != null)
				return false;
		} else if (!offerPrice.equals(other.offerPrice))
			return false;
		if (offerYield == null) {
			if (other.offerYield != null)
				return false;
		} else if (!offerYield.equals(other.offerYield))
			return false;
		if (ratingFitch == null) {
			if (other.ratingFitch != null)
				return false;
		} else if (!ratingFitch.equals(other.ratingFitch))
			return false;
		if (ratingMoodys == null) {
			if (other.ratingMoodys != null)
				return false;
		} else if (!ratingMoodys.equals(other.ratingMoodys))
			return false;
		if (ratingSP == null) {
			if (other.ratingSP != null)
				return false;
		} else if (!ratingSP.equals(other.ratingSP))
			return false;
		if (secRank == null) {
			if (other.secRank != null)
				return false;
		} else if (!secRank.equals(other.secRank))
			return false;
		if (settlementDate == null) {
			if (other.settlementDate != null)
				return false;
		} else if (!settlementDate.equals(other.settlementDate))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "BondInfo [ISIN=" + ISIN + ", bondName=" + bondName
				+ ", issuer=" + issuer + ", currency=" + currency
				+ ", couponRate=" + couponRate + ", maturityDate="
				+ maturityDate + ", nextCouponDate=" + nextCouponDate
				+ ", bidPrice=" + bidPrice + ", bidYield=" + bidYield
				+ ", offerPrice=" + offerPrice + ", offerYield=" + offerYield
				+ ", settlementDate=" + settlementDate + ", industry="
				+ industry + ", secRank=" + secRank + ", couponFrequency="
				+ couponFrequency + ", callDate=" + callDate + ", couponType="
				+ couponType + ", ratingFitch=" + ratingFitch
				+ ", ratingMoodys=" + ratingMoodys + ", ratingSP=" + ratingSP
				+ ", amtIssued=" + amtIssued + ", amtOutstanding="
				+ amtOutstanding + ", minimumInvAmt=" + minimumInvAmt
				+ ", incrementInvAmt=" + incrementInvAmt + ", lastCouponDate="
				+ lastCouponDate + "]";
	}
	
	

}
