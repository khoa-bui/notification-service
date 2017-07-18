/**
 * 
 */
package com.phillip.services.notification.util;

import java.math.BigDecimal;
import java.util.Date;

import com.phillip.services.notification.models.AccountInfo;
import com.phillip.services.notification.models.Announcement;
import com.phillip.services.notification.models.BondInfo;
import com.phillip.services.notification.models.BondOrderInfo;

/**
 * @author Bui Dang Khoa
 *
 */
public class ObjectBuilder {

	public static AccountInfo buildDefaultAccountInfo() {
		AccountInfo result = new AccountInfo();
		result.setAccountName("Phillip");
		result.setAccountNo(189564789);
		result.setAccountType("VIP");
		result.setBalance(new BigDecimal(789456));
		result.setLastLoginDate(new Date());
		result.setLastTradeDate(new Date());
		result.setStatus("Active");
		result.setTotalInvestment(new BigDecimal(0));
		return result;
	}
	
	public static Announcement buildDefaultAnnouncement() {
		Announcement result = new Announcement();
		result.setContent("Bond Prices Changes.");
		result.setFrom("PhillipSecurities@com");
		result.setTitle("Announcement");
		result.setTo("Mobile devices");
		return result;
	}
	
	public static BondInfo buildDefaultBondInfo() {
		BondInfo result = new BondInfo();
		result.setAmtIssued(new BigDecimal(1234));
		result.setAmtOutstanding(new BigDecimal(1234));
		result.setBidPrice(new BigDecimal(333));
		result.setBidYield(new BigDecimal(150));
		result.setBondName("QSTC");
		result.setCallDate(new Date());
		result.setCouponFrequency("Frequency");
		result.setCouponRate(new BigDecimal(33));
		result.setCouponType("Sell");
		result.setCurrency("SGD");
		result.setIndustry("Garment");
		result.setISIN("B0000890");
		result.setIssuer("Phillip Security");
		result.setLastCouponDate(new Date());
		result.setMaturityDate(new Date());
		result.setMinimumInvAmt(new BigDecimal(5));
		result.setNextCouponDate(new Date());
		result.setOfferPrice(new BigDecimal(339));
		result.setOfferYield(new BigDecimal(50));
		result.setRatingFitch("3%");
		result.setRatingMoodys("5%");
		result.setRatingSP("8%");
		result.setSecRank("rank");
		result.setSettlementDate(new Date());
		return result;
	}
	
	public static BondOrderInfo buildBondOrderInfo() {
		BondOrderInfo result = new BondOrderInfo();
		result.setBondName("QTSC");
		result.setExecQty(800);
		result.setOrderPrice(4586D);
		result.setOrderQty(900);
		result.setOrderTime(new Date());
		result.setOrderType("Buy");
		result.setStatus("Active");
		return result;
	}
}
