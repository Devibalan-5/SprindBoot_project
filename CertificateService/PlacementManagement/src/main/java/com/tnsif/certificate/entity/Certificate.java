package com.tnsif.certificate.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="tblCertificate")
public class Certificate {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String certificateName;
	private String issuingOrganization;
	private int issueDate;
	private Long studentId;
	
	public Certificate(String certificateName, String issuingOrganization, int issueDate, Long studentId) {
		super();
		this.certificateName = certificateName;
		this.issuingOrganization = issuingOrganization;
		this.issueDate = issueDate;
		this.studentId = studentId;
	}
	public Certificate() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCertificateName() {
		return certificateName;
	}
	public void setCertificateName(String certificateName) {
		this.certificateName = certificateName;
	}
	public String getIssuingOrganization() {
		return issuingOrganization;
	}
	public void setIssuingOrganization(String issuingOrganization) {
		this.issuingOrganization = issuingOrganization;
	}
	public int getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(int issueDate) {
		this.issueDate = issueDate;
	}
	public Long getStudentId() {
		return studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
}

	
}
