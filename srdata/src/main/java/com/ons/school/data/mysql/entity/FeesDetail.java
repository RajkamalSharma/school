package com.ons.school.data.mysql.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * The persistent class for the fees_details database table.
 * 
 */
@Entity
@Table(name="fees_details")
public class FeesDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "Fees_Details_id")
	private int fees_Details_id;

	@Column(name = "Event_Amount")
	private int event_Amount;

	@Column(name = "Event_Description")
	private String event_Description;

	//bi-directional many-to-one association to Fee
    @ManyToOne(fetch = FetchType.EAGER )
	@JoinColumn(name="Fees_id")
    private FeesEntity feesEntity;

    public FeesDetail() {
    }

	public int getFees_Details_id() {
		return this.fees_Details_id;
	}

	public void setFees_Details_id(int fees_Details_id) {
		this.fees_Details_id = fees_Details_id;
	}

	public int getEvent_Amount() {
		return this.event_Amount;
	}

	public void setEvent_Amount(int event_Amount) {
		this.event_Amount = event_Amount;
	}

	public String getEvent_Description() {
		return this.event_Description;
	}

	public void setEvent_Description(String event_Description) {
		this.event_Description = event_Description;
	}

	public FeesEntity getFeesEntity() {
		return this.feesEntity;
	}

	public void setFeesEntity(FeesEntity feesEntity) {
		this.feesEntity = feesEntity;
	}
	
}