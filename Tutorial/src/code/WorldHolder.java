package code;

import javax.swing.JOptionPane;

public class WorldHolder{
public static void main(String[] args){
	String name = JOptionPane.showInputDialog("������� ���!");
	String age = JOptionPane.showInputDialog("������� �������!");	
JOptionPane.showMessageDialog(null, "���: " +  name
								  + "\n�������: " + age
								  + "\n���������: ������� ����");
}	
}
