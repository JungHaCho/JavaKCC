package myCar.domain;

import java.time.LocalDateTime;

public class Sales {
    private int salesUID;
    private int salesId;
    private String accountName;
    private String accountNum;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    
    public Sales() {}

    public Sales(int salesUID, int salesId, String accountName, String accountNum, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.salesUID = salesUID;
        this.salesId = salesId;
        this.accountName = accountName;
        this.accountNum = accountNum;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public int getSalesUID() {
		return salesUID;
	}

	public void setSalesUID(int salesUID) {
		this.salesUID = salesUID;
	}

	public int getSalesId() {
		return salesId;
	}

	public void setSalesId(int salesId) {
		this.salesId = salesId;
	}


	public String getAccountName() {
		return accountName;
	}


	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}


	public String getAccountNum() {
		return accountNum;
	}


	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}


	public LocalDateTime getCreatedAt() {
		return createdAt;
	}


	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}


	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}


	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}


	@Override
    public String toString() {
        return "Sales{" +
                "salesUID=" + salesUID +
                ", salesId=" + salesId +
                ", accountName='" + accountName + '\'' +
                ", accountNum='" + accountNum + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
