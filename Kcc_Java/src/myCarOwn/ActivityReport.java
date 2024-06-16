package myCarOwn;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ActivityReport {
	
	private int activityReportUID=1;
	private String content;
	private String memo;
	private String createAt;
	private String updateAt;
	
	
	public ActivityReport() {
		
	}
	
	public ActivityReport( String content, String memo, LocalDateTime createAt,
			LocalDateTime updateAt) {
		super();
		
		this.activityReportUID = activityReportUID++;
		this.content = content;
		this.memo = memo;
		this.createAt = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		this.updateAt = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
	}
	public int getActivityReportUID() {
		return activityReportUID;
	}
	public void setActivityReportUID(int activityReportUID) {
		this.activityReportUID = activityReportUID;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getCreateAt() {
		return createAt;
	}
	public void setCreateAt(String createAt) {
		this.createAt = createAt;
	}
	public String getUpdateAt() {
		return updateAt;
	}
	public void setUpdateAt(String updateAt) {
		this.updateAt = updateAt;
	}
	
	
}
