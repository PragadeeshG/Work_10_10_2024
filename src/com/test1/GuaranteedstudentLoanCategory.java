package com.test1;

public class GuaranteedstudentLoanCategory {
	private String loanCode;
	private String loanName;
	private String loanDescription;
	private String loanDefinition;
	private long authorizedId;
	private String owner;
	private String psIds;
	private long serviceNameId;
	private String creationDate;
	private String modifiedDate;

	public GuaranteedstudentLoanCategory() {

	}

	public GuaranteedstudentLoanCategory(String loanCode, String loanName, String loanDescription,
			String loanDefinition, long authorizedId, String owner, String psIds, long serviceNameId,
			String creationDate, String modifiedDate) {
		super();
		this.loanCode = loanCode;
		this.loanName = loanName;
		this.loanDescription = loanDescription;
		this.loanDefinition = loanDefinition;
		this.authorizedId = authorizedId;
		this.owner = owner;
		this.psIds = psIds;
		this.serviceNameId = serviceNameId;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
	}

	public String getLoanCode() {
		return loanCode;
	}

	public void setLoanCode(String loanCode) {
		this.loanCode = loanCode;
	}

	public String getLoanName() {
		return loanName;
	}

	public void setLoanName(String loanName) {
		this.loanName = loanName;
	}

	public String getLoanDescription() {
		return loanDescription;
	}

	public void setLoanDescription(String loanDescription) {
		this.loanDescription = loanDescription;
	}

	public String getLoanDefinition() {
		return loanDefinition;
	}

	public void setLoanDefinition(String loanDefinition) {
		this.loanDefinition = loanDefinition;
	}

	public long getAuthorizedId() {
		return authorizedId;
	}

	public void setAuthorizedId(long authorizedId) {
		this.authorizedId = authorizedId;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getPsIds() {
		return psIds;
	}

	public void setPsIds(String psIds) {
		this.psIds = psIds;
	}

	public long getServiceNameId() {
		return serviceNameId;
	}

	public void setServiceNameId(long serviceNameId) {
		this.serviceNameId = serviceNameId;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

}
