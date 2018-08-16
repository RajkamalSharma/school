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
	private int feesDetailsId;

	@Column(name = "Event_Amount")
	private int eventAmount;

	@Column(name = "Event_Description")
	private String eventDescription;

	//bi-directional many-to-one association to Fee
    @ManyToOne(fetch = FetchType.EAGER )
	@JoinColumn(name="Fees_id")
    private FeesEntity feesEntity;

    public FeesDetail() {
    }

	public int getFeesDetailsId() {
		return feesDetailsId;
	}

	public void setFeesDetailsId(int feesDetailsId) {
		this.feesDetailsId = feesDetailsId;
	}

	public int getEventAmount() {
		return eventAmount;
	}

	public void setEventAmount(int eventAmount) {
		this.eventAmount = eventAmount;
	}

	public String getEventDescription() {
		return eventDescription;
	}

	public void setEventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
	}

	public FeesEntity getFeesEntity() {
		return feesEntity;
	}

	public void setFeesEntity(FeesEntity feesEntity) {
		this.feesEntity = feesEntity;
	}
}