package com.bms.account.entity;


import java.sql.Timestamp;
import java.util.Date;

import org.springframework.data.annotation.Id;

public class Loan {
	@Id
	private Integer loanid;
	private Integer accountno;
	private Date date;
	private Integer principal;
	private Integer rateofinterest;
	private Integer duarion;
	private String loantype;
	private Timestamp loandate;
	public Integer getLoanid() {
		return loanid;
	}
	public void setLoanid(Integer loanid) {
		this.loanid = loanid;
	}
	public Integer getAccountno() {
		return accountno;
	}
	public void setAccountno(Integer accountno) {
		this.accountno = accountno;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Integer getPrincipal() {
		return principal;
	}
	public void setPrincipal(Integer principal) {
		this.principal = principal;
	}
	public Integer getRateofinterest() {
		return rateofinterest;
	}
	public void setRateofinterest(Integer rateofinterest) {
		this.rateofinterest = rateofinterest;
	}
	public Integer getDuarion() {
		return duarion;
	}
	public void setDuarion(Integer duarion) {
		this.duarion = duarion;
	}
	public String getLoantype() {
		return loantype;
	}
	public void setLoantype(String loantype) {
		this.loantype = loantype;
	}
	public Timestamp getLoandate() {
		return loandate;
	}
	public void setLoandate(Timestamp loandate) {
		this.loandate = loandate;
	}
	public Loan(Integer loanid, Integer accountno, Date date, Integer principal, Integer rateofinterest,
			Integer duarion, String loantype, Timestamp loandate) {
		super();
		this.loanid = loanid;
		this.accountno = accountno;
		this.date = date;
		this.principal = principal;
		this.rateofinterest = rateofinterest;
		this.duarion = duarion;
		this.loantype = loantype;
		this.loandate = loandate;
	}

	
}
