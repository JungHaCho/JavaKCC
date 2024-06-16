package myCar.util;

public enum ExecutionStatus {

	WRITE("결과작성"), COMPLETE("완료");
	
	   private String execution;

	   private ExecutionStatus(String execution) {
	      this.execution = execution;
	   }

	   public String getExecutionStatus() {
	      return execution;
	   }

}
