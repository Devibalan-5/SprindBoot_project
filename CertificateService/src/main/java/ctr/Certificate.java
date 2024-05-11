package ctr;

//Certificate.java
public class Certificate {
private Long id;
private String certificateName;
private String issuingOrganization;

private Long studentId;
//getters and setters

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

public Long getStudentId() {
	return studentId;
}

public void setStudentId(Long studentId) {
	this.studentId = studentId;
}

public Certificate() {
	super();
}

public Certificate(String certificateName, String issuingOrganization, Long studentId) {
	super();
	this.certificateName = certificateName;
	this.issuingOrganization = issuingOrganization;
	this.studentId = studentId;
}
}