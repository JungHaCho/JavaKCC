package kosa.video.t;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Video v1 = new Video("1","�Ĺ�","�ֹν�");
//		Video v2 = new Video("2","�Ĺ�","�ֹν�");
//		
		Video videos[] = {
				new Video("1","�Ĺ�","�ֹν�"),
				new Video("2","�Ĺ�","�ֹν�")			
		};
		
		GeneralMember gm[] = {
				new GeneralMember("a1","ȫ�浿","������"),
				new SpecialMember("b","ȫ","rrr",100)
		};

	
		for(int i=0;i<gm.length;i++) {
			
			gm[i].rental(videos[i]);
			gm[i].show();
			if(gm[i] instanceof SpecialMember) {
				((SpecialMember)gm[i]).specialPrint();
			}
		}
		
//
//		SpecialMember sm = new SpecialMember(");
//		sm.rental(v2);
//		sm.show();
//		
//		System.out.println("============");
//		GeneralMember gm = new GeneralMember("a1","ȫ�浿","������");
//		sm.rental(v2);
//		sm.show();
		
		// GeneralMember�� SpecialMemeber�� �Բ� �迭�� �ְ�
		// rental(), show() ȣ�� ���
		//cmrgl SpeciaMember�� specialPrint()ȣ��
	}

}
