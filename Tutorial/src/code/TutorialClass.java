package code;

import java.util.Random;

import javax.swing.JOptionPane;

public class TutorialClass {

//	public static void main(String[] args) {
public TutorialClass() {
	int hp = 100;
		int monster_hp = 100;
		int buffer = 0;
		Random rand = new Random();
		do{
			buffer = rand.nextInt(10)+10;
			hp = hp - buffer;
			JOptionPane.showMessageDialog(null, "�� ������� "+buffer+" �����");
			buffer = rand.nextInt(10)+10;
			monster_hp = monster_hp - buffer;
			JOptionPane.showMessageDialog(null, "��������� ������� "+buffer+" �����");
		}while(hp>0&&monster_hp>0);
		if(hp==0){
			JOptionPane.showMessageDialog(null, "�� ��������");
		}else{
			JOptionPane.showMessageDialog(null, "�� �������");
		}
	}
}
