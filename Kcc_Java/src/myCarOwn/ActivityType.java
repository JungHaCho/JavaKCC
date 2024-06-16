package myCarOwn;

public enum ActivityType {

	   CALL("전화"), VISIT("방문"), CELEBRATION("축전");
	   private String act;

	   private ActivityType(String act) {
	      this.act = act;
	   }

	   public String getActivityType() {
	      return act;
	   }

}
