package com.rms.repo.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Table
@Entity
public class RateEntity {

	@Id
	@NotNull
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long rateId;
		
	private String rateDescription;
	
	@NotNull
	private Date rateEffectiveDate;
	
	@NotNull
	private Date rateExpirationDate;
	
	@NotNull
	private Integer amount;

	public Long getRateId() {
		return rateId;
	}

	public void setRateId(Long rateId) {
		this.rateId = rateId;
	}
	

	/**
	 * @return the rateDescription
	 */
	public String getRateDescription() {
		return rateDescription;
	}

	/**
	 * @param rateDescription the rateDescription to set
	 */
	public void setRateDescription(String rateDescription) {
		this.rateDescription = rateDescription;
	}

	/**
	 * @return the rateEffectiveDate
	 */
	public Date getRateEffectiveDate() {
		return rateEffectiveDate;
	}

	/**
	 * @param rateEffectiveDate the rateEffectiveDate to set
	 */
	public void setRateEffectiveDate(Date rateEffectiveDate) {
		this.rateEffectiveDate = rateEffectiveDate;
	}

	/**
	 * @return the rateExpirationDate
	 */
	public Date getRateExpirationDate() {
		return rateExpirationDate;
	}

	/**
	 * @param rateExpirationDate the rateExpirationDate to set
	 */
	public void setRateExpirationDate(Date rateExpirationDate) {
		this.rateExpirationDate = rateExpirationDate;
	}

	/**
	 * @return the amount
	 */
	public Integer getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "RateEntity [rateId=" + rateId + ", rateDescription=" + rateDescription + ", rateEffectiveDate="
				+ rateEffectiveDate + ", rateExpirationDate=" + rateExpirationDate + ", amount=" + amount + "]";
	}
	
	
	
}
