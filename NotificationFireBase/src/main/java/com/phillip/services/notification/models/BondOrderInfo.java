package com.phillip.services.notification.models;

import java.io.IOException;
import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

/**
 * 
 * @author Bui Dang Khoa
 * 
 */
@XmlRootElement(name = "BondOrderInfo")
public class BondOrderInfo extends BaseObject {
	private String bondName;
	private String status;
	private String orderType;
	private Double orderPrice;
	private Integer orderQty;
	private Integer execQty;
	private Date orderTime;

	@XmlElement
	public String getBondName() {
		return bondName;
	}

	public void setBondName(String bondName) {
		this.bondName = bondName;
	}

	@XmlElement
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@XmlElement
	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	@XmlElement
	public Double getOrderPrice() {
		return orderPrice;
	}

	public void setOrderPrice(Double orderPrice) {
		this.orderPrice = orderPrice;
	}

	@XmlElement
	public Integer getOrderQty() {
		return orderQty;
	}

	public void setOrderQty(Integer orderQty) {
		this.orderQty = orderQty;
	}

	@XmlElement
	public Integer getExecQty() {
		return execQty;
	}

	public void setExecQty(Integer execQty) {
		this.execQty = execQty;
	}

	@XmlElement
	public Date getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((bondName == null) ? 0 : bondName.hashCode());
		result = prime * result + ((execQty == null) ? 0 : execQty.hashCode());
		result = prime * result
				+ ((orderPrice == null) ? 0 : orderPrice.hashCode());
		result = prime * result
				+ ((orderQty == null) ? 0 : orderQty.hashCode());
		result = prime * result
				+ ((orderTime == null) ? 0 : orderTime.hashCode());
		result = prime * result
				+ ((orderType == null) ? 0 : orderType.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BondOrderInfo other = (BondOrderInfo) obj;
		if (bondName == null) {
			if (other.bondName != null)
				return false;
		} else if (!bondName.equals(other.bondName))
			return false;
		if (execQty == null) {
			if (other.execQty != null)
				return false;
		} else if (!execQty.equals(other.execQty))
			return false;
		if (orderPrice == null) {
			if (other.orderPrice != null)
				return false;
		} else if (!orderPrice.equals(other.orderPrice))
			return false;
		if (orderQty == null) {
			if (other.orderQty != null)
				return false;
		} else if (!orderQty.equals(other.orderQty))
			return false;
		if (orderTime == null) {
			if (other.orderTime != null)
				return false;
		} else if (!orderTime.equals(other.orderTime))
			return false;
		if (orderType == null) {
			if (other.orderType != null)
				return false;
		} else if (!orderType.equals(other.orderType))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		return true;
	}
	
}
