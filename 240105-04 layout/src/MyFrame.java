import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Point;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	public MyFrame() {
		JButton btnCenter = new JButton("중앙");
		JButton btnLeft = new JButton("왼쪽");
		
		setLayout(new FlowLayout()); // 이녀석 때문에 밑에 다 개무시당하는중
		
		btnCenter.setPreferredSize(new Dimension(100, 100)); // 크기설정 
//		btnCenter.setSize(new Dimension(100, 100));
//		btnCenter.setLocation(new Point(250, 250));
//		
//		btnLeft.setBounds(0, 150, 100, 300);
		
		add(btnCenter);
		add(btnLeft);

		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MyFrame();
	}
}
