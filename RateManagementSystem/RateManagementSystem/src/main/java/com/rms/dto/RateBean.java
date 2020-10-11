package com.rms.dto;

import java.util.Date;

public class RateBean {

	private Long RateId;
	private String RateDescription;
	private Date RateEffectiveDate;
	private Date RateExpirationDate;
	private Integer Amount;
	private Long surchargeRate;
	private String surchargeDescription;
	
	public Long getRateId() {
		return RateId;
	}
	public void setRateId(Long rateId) {
		RateId = rateId;
	}
	public String getRateDescription() {
		return RateDescription;
	}
	public void setRateDescription(String rateDescription) {
		RateDescription = rateDescription;
	}
	public Date getRateEffectiveDate() {
		return RateEffectiveDate;
	}
	public void setRateEffectiveDate(Date rateEffectiveDate) {
		RateEffectiveDate = rateEffectiveDate;
	}
	public Date getRateExpirationDate() {
		return RateExpirationDate;
	}
	public void setRateExpirationDate(Date rateExpirationDate) {
		RateExpirationDate = rateExpirationDate;
	}
	public Integer getAmount() {
		return Amount;
	}
	public void setAmount(Integer amount) {
		Amount = amount;
	}
	public Long getSurchargeRate() {
		return surchargeRate;
	}
	public void setSurchargeRate(Long surchargeRate) {
		this.surchargeRate = surchargeRate;
	}
	public String getSurchargeDescription() {
		return surchargeDescription;
	}
	public void setSurchargeDescription(String surchargeDescription) {
		this.surchargeDescription = surchargeDescription;
	}
		
	
}
