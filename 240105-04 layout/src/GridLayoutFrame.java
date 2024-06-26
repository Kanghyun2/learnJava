import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutFrame extends JFrame {
	public GridLayoutFrame() {
		// 영역을 행, 열로 나누어 동일한 크기로 사용
		// 행이나 열의 수중 하나를 0으로 생략가능
		GridLayout layout = new GridLayout(0, 4);

		setLayout(layout);

		for (int i = 0; i < 9; i++) {

			add(new JButton("버튼"));
		}
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new GridLayoutFrame();
	}
}
