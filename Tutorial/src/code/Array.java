package code;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Array {

	public static void main(String[] args) {
		int choose = 0;
		choose = Integer.parseInt(JOptionPane.showInputDialog(null, "������ ��������: "
										  + "\n1)������ ����"
										  + "\n2)���������"
										  + "\n3)���������"
										  + "\n4)�����"));
		switch(choose){
			case 1: JOptionPane.showMessageDialog(null, "���� ����������!");
			new TutorialClass();
				break;
			case 2: JOptionPane.showMessageDialog(null, "���������...");
				break;
			case 3:	 JOptionPane.showMessageDialog(null, "���������...");
				break;
			case 4: System.exit(0);
				break;
				default:  JOptionPane.showMessageDialog(null, "������!");
			}
		JOptionPane.showMessageDialog(null, "�����-�� ��������� ����� #1");
		JOptionPane.showMessageDialog(null, "�����-�� ��������� ����� #2");
		JOptionPane.showMessageDialog(null, "�����-�� ��������� ����� #3");
	}
	}
