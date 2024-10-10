package com.test1;

public class GuaranteedstudentLoanApproval {
	private long authorizerId;
	private String loanCode;
	private String loanGauranteeCodeName;
	private String loanSanctionApprovalMail;
	private String sanctionVerifier;
	private String loanprocessCompletionTeam;
	private String emailGroup;
	private long refDataId;
	private Integer sequence;
	private String modularData;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public GuaranteedstudentLoanApproval() {

	}

	public GuaranteedstudentLoanApproval(long authorizerId, String loanCode, String loanGauranteeCodeName,
			String loanSanctionApprovalMail, String sanctionVerifier, String loanprocessCompletionTeam,
			String emailGroup, long refDataId, Integer sequence, String modularData, String creationDate,
			String modifiedDate, String entityState) {
		super();
		this.authorizerId = authorizerId;
		this.loanCode = loanCode;
		this.loanGauranteeCodeName = loanGauranteeCodeName;
		this.loanSanctionApprovalMail = loanSanctionApprovalMail;
		this.sanctionVerifier = sanctionVerifier;
		this.loanprocessCompletionTeam = loanprocessCompletionTeam;
		this.emailGroup = emailGroup;
		this.refDataId = refDataId;
		this.sequence = sequence;
		this.modularData = modularData;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public long getAuthorizerId() {
		return authorizerId;
	}

	public void setAuthorizerId(long authorizerId) {
		this.authorizerId = authorizerId;
	}

	public String getLoanCode() {
		return loanCode;
	}

	public void setLoanCode(String loanCode) {
		this.loanCode = loanCode;
	}

	public String getLoanGauranteeCodeName() {
		return loanGauranteeCodeName;
	}

	public void setLoanGauranteeCodeName(String loanGauranteeCodeName) {
		this.loanGauranteeCodeName = loanGauranteeCodeName;
	}

	public String getLoanSanctionApprovalMail() {
		return loanSanctionApprovalMail;
	}

	public void setLoanSanctionApprovalMail(String loanSanctionApprovalMail) {
		this.loanSanctionApprovalMail = loanSanctionApprovalMail;
	}

	public String getSanctionVerifier() {
		return sanctionVerifier;
	}

	public void setSanctionVerifier(String sanctionVerifier) {
		this.sanctionVerifier = sanctionVerifier;
	}

	public String getLoanprocessCompletionTeam() {
		return loanprocessCompletionTeam;
	}

	public void setLoanprocessCompletionTeam(String loanprocessCompletionTeam) {
		this.loanprocessCompletionTeam = loanprocessCompletionTeam;
	}

	public String getEmailGroup() {
		return emailGroup;
	}

	public void setEmailGroup(String emailGroup) {
		this.emailGroup = emailGroup;
	}

	public long getRefDataId() {
		return refDataId;
	}

	public void setRefDataId(long refDataId) {
		this.refDataId = refDataId;
	}

	public Integer getSequence() {
		return sequence;
	}

	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}

	public String getModularData() {
		return modularData;
	}

	public void setModularData(String modularData) {
		this.modularData = modularData;
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

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
