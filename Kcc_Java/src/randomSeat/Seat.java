package randomSeat;

import kosa.video.t.Video;

public class Seat {
	
	private int seatNo;
	private Student seat;
	// --------- ������ / get set

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
		System.out.println("�ڸ�" + seatNo);
		
		System.out.println("�ڸ�" + seatNo);
	}
	
	
	
	
	
	
	
	
	
}
