package com.hms.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "patients")
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long pid;
	@Column(name ="Name")
	private String pname;
	@Column(name ="Age")
	private String page;
	@Column(name ="Blood_group")
	private String pblood;
	@Column(name ="Prescription")
	private String prescription;
	@Column(name ="Dose")
	private String pdose;
	@Column(name ="Fees")
	private String pfees;
	@Column(name ="Urgency")
	private String purgency;
	
	public Patient(long pid, String pname, String page, String pblood, String prescription, String pdose, String pfees,
			String purgency) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.page = page;
		this.pblood = pblood;
		this.prescription = prescription;
		this.pdose = pdose;
		this.pfees = pfees;
		this.purgency = purgency;
	}

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public long getPid() {
		return pid;
	}

	
	public void setPid(long pid) {
		this.pid = pid;
	}

	
	public String getPname() {
		return pname;
	}

	
	public void setPname(String pname) {
		this.pname = pname;
	}

	
	public String getPage() {
		return page;
	}

	
	public void setPage(String page) {
		this.page = page;
	}

	
	public String getPblood() {
		return pblood;
	}

	
	public void setPblood(String pblood) {
		this.pblood = pblood;
	}

	
	public String getPrescription() {
		return prescription;
	}

	
	public void setPrescription(String prescription) {
		this.prescription = prescription;
	}

	
	public String getPdose() {
		return pdose;
	}

	
	public void setPdose(String pdose) {
		this.pdose = pdose;
	}

	
	public String getPfees() {
		return pfees;
	}

	
	public void setPfees(String pfees) {
		this.pfees = pfees;
	}

	
	public String getPurgency() {
		return purgency;
	}

	
	public void setPurgency(String purgency) {
		this.purgency = purgency;
	}
	@Override
	public String toString() {
		return "Patient [pid=" + pid + ", pname=" + pname + ", page=" + page + ", pblood=" + pblood + ", prescription="
				+ prescription + ", pdose=" + pdose + ", pfees=" + pfees + ", purgency=" + purgency + "]";
	}

	
	
}
