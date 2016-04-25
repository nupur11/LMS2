package com.LMS.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@Table(name = "EVENT")
public class Event {

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer ID;

	@Column(name = "EVENT_ID")
	private String EVENT_ID;

	@Column(name = "NAME")
	private String NAME;

	@Column(name = "COMPANY_NAME")
	private String COMPANY_NAME;

	@Column(name = "CONTACT_PERSON")
	private String CONTACT_PERSON;

	@Column(name = "CONTACT_TO")
	private String CONTACT_TO;

	@Column(name = "EMAIL")
	private String EMAIL;

	@Column(name = "VENUE")
	private String VENUE;

	@Column(name = "FROM_DATE")
	private LocalDate FROM_DATE;

	@Column(name = "TO_DATE")
	private LocalDate TO_DATE;

	@Column(name = "TIME")
	private DateTime TIME;

	@Column(name = "TIMESTAMP")
	private DateTime TIMESTAMP;

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getEVENT_ID() {
		return EVENT_ID;
	}

	public void setEVENT_ID(String eVENT_ID) {
		EVENT_ID = eVENT_ID;
	}

	public String getNAME() {
		return NAME;
	}

	public void setNAME(String nAME) {
		NAME = nAME;
	}

	public String getCOMPANY_NAME() {
		return COMPANY_NAME;
	}

	public void setCOMPANY_NAME(String cOMPANY_NAME) {
		COMPANY_NAME = cOMPANY_NAME;
	}

	public String getCONTACT_PERSON() {
		return CONTACT_PERSON;
	}

	public void setCONTACT_PERSON(String cONTACT_PERSON) {
		CONTACT_PERSON = cONTACT_PERSON;
	}

	public String getCONTACT_TO() {
		return CONTACT_TO;
	}

	public void setCONTACT_TO(String cONTACT_TO) {
		CONTACT_TO = cONTACT_TO;
	}

	public String getEMAIL() {
		return EMAIL;
	}

	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}

	public String getVENUE() {
		return VENUE;
	}

	public void setVENUE(String vENUE) {
		VENUE = vENUE;
	}

	public LocalDate getFROM_DATE() {
		return FROM_DATE;
	}

	public void setFROM_DATE(LocalDate fROM_DATE) {
		FROM_DATE = fROM_DATE;
	}

	public LocalDate getTO_DATE() {
		return TO_DATE;
	}

	public void setTO_DATE(LocalDate tO_DATE) {
		TO_DATE = tO_DATE;
	}

	public DateTime getTIME() {
		return TIME;
	}

	public void setTIME(DateTime tIME) {
		TIME = tIME;
	}

	public DateTime getTIMESTAMP() {
		return TIMESTAMP;
	}

	public void setTIMESTAMP(DateTime tIMESTAMP) {
		TIMESTAMP = tIMESTAMP;
	}
	
	
	

}
