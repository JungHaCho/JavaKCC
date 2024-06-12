package kosa.thread;

class SumThread2 extends Thread {
	private int start;
	private int end;
	private int total;
	
	public void run() {
		for(int i = start;i<=end; i++) {
			total +=i;
		}
	}

	public SumThread2(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
}
