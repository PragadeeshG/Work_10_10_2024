package com.test1;

public class GuaranteedStudentLoanSubCategory {
	private String loanGauranteeSubCatCode;
	private String loanGauranteeName;
	private String loanGauranteeDescription;
	private String loanGauranteeDefinition;
	private String loanGauranteeCodeRefernceName;
	private long errorCode;
	private String errorSeverity;
	private String ncType;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public GuaranteedStudentLoanSubCategory() {

	}

	public GuaranteedStudentLoanSubCategory(String loanGauranteeSubCatCode, String loanGauranteeName,
			String loanGauranteeDescription, String loanGauranteeDefinition, String loanGauranteeCodeRefernceName,
			long errorCode, String errorSeverity, String ncType, String creationDate, String modifiedDate,
			String entityState) {
		super();
		this.loanGauranteeSubCatCode = loanGauranteeSubCatCode;
		this.loanGauranteeName = loanGauranteeName;
		this.loanGauranteeDescription = loanGauranteeDescription;
		this.loanGauranteeDefinition = loanGauranteeDefinition;
		this.loanGauranteeCodeRefernceName = loanGauranteeCodeRefernceName;
		this.errorCode = errorCode;
		this.errorSeverity = errorSeverity;
		this.ncType = ncType;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public String getLoanGauranteeSubCatCode() {
		return loanGauranteeSubCatCode;
	}

	public void setLoanGauranteeSubCatCode(String loanGauranteeSubCatCode) {
		this.loanGauranteeSubCatCode = loanGauranteeSubCatCode;
	}

	public String getLoanGauranteeName() {
		return loanGauranteeName;
	}

	public void setLoanGauranteeName(String loanGauranteeName) {
		this.loanGauranteeName = loanGauranteeName;
	}

	public String getLoanGauranteeDescription() {
		return loanGauranteeDescription;
	}

	public void setLoanGauranteeDescription(String loanGauranteeDescription) {
		this.loanGauranteeDescription = loanGauranteeDescription;
	}

	public String getLoanGauranteeDefinition() {
		return loanGauranteeDefinition;
	}

	public void setLoanGauranteeDefinition(String loanGauranteeDefinition) {
		this.loanGauranteeDefinition = loanGauranteeDefinition;
	}

	public String getLoanGauranteeCodeRefernceName() {
		return loanGauranteeCodeRefernceName;
	}

	public void setLoanGauranteeCodeRefernceName(String loanGauranteeCodeRefernceName) {
		this.loanGauranteeCodeRefernceName = loanGauranteeCodeRefernceName;
	}

	public long getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(long errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorSeverity() {
		return errorSeverity;
	}

	public void setErrorSeverity(String errorSeverity) {
		this.errorSeverity = errorSeverity;
	}

	public String getNcType() {
		return ncType;
	}

	public void setNcType(String ncType) {
		this.ncType = ncType;
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
