package randomSeat;

import kosa.video.t.Video;

public class Seat {
	
	private int seatNo;
	private Student seat;
	// --------- 생성자 / get set

	public void Seat(){
		
	}
	
	public Seat(int seatNo) {
		super();
		this.seatNo = seatNo;
		
	}

	public int getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}

	public Student getSeat() {
		return seat;
	}

	public void setSeat(Student seat) {
		this.seat = seat;
	}


	
	public void PrintSeat(){
		System.out.println("자리" + seatNo);
		
		System.out.println("자리" + seatNo);
	}
	
	
	
	
	
	
	
	
	
}
