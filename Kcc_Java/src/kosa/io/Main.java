package kosa.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Main {

	Member m;
	
	//媛앹껜 吏곷젹�솕 - 援щ텇 ���긽 interface瑜� �뜥�빞�븳�떎,
	//�겢�옒�뒪�쓽 硫ㅻ쾭蹂��닔 瑜� �벐怨� �떢�쑝硫� �겢�옒�뒪�뿉 implements Serializable
	public void insert() {
		m = new Member("�솉湲몃룞",20, new Video("1","�꽌�슱�쓽遊�","�젙�슦�꽦"));
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("object.ser"));
			oos.writeObject(m);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				oos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
	
	//媛앹껜 �뿭吏곷젹�솕
	public void show() {
		
		ObjectInputStream ois =null;
		try {
			ois = new ObjectInputStream(new FileInputStream("object.ser"));
			m =(Member) ois.readObject();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				ois.close();
			} catch (Exception e3) {
				// TODO Auto-generated catch block
			
			}
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Main main = new Main();
		main.insert();
		main.m = null;
		main.show();
		System.out.println(main.m);
	}

}
