package code;

import java.util.Random;

import javax.swing.JOptionPane;

public class Operators {

	public static void main(String[] args) {
		int hp = 10;
		int damage;
		String name;
		name = JOptionPane.showInputDialog("��� ���� �����?");
		Random rand = new Random();
		damage = rand.nextInt(100);
		hp = hp - damage;
	if(hp>0){
	JOptionPane.showConfirmDialog(null, "�� �����, " + name);
		}
	else{
	JOptionPane.showConfirmDialog(null, "�� �����, " + name);	
		} 
	}
}
