import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Display extends JFrame {
	private Zeichnung zeichnung;

	public Display() {
		Dimension windowSize = new Dimension(800, 600);
		setSize(windowSize);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int windowPositionX = (screenSize.width - windowSize.width) / 2;
		int windowPositionY = (screenSize.height - windowSize.height) / 2;
		Point windowPosition = new Point(windowPositionX, windowPositionY);
		setLocation(windowPosition);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		createAndAddDrawingPanel();
		setVisible(true);
 	}

	private void createAndAddDrawingPanel() {
		add(new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				zeichnung.zeichneFiguren(g);
			}
		});
	}
	
	public void setZeichnung(Zeichnung zeichnung) {
		this.zeichnung = zeichnung;
	}
}
