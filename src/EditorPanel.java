import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;

@SuppressWarnings("serial")
final class EditorPanel extends JPanel{
	private EditorControl editorControl;

	
	EditorPanel(EditorControl control) {
		editorControl = control;
		MouseEventAdapter adapter = new MouseEventAdapter(editorControl, this);
		addMouseListener(adapter);
	}
	
	// Die paintComponent()-Methode wird automatisch aufgerufen, wenn irgendwer die repaint()-
	// Methode beim EditorFrame oder beim EditorPanel aufruft.
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
	  	editorControl.allesNeuZeichnen(g);
	}
}

class MouseEventAdapter extends MouseAdapter {
	EditorPanel editorPanel;
	EditorControl editorControl;

	public MouseEventAdapter(EditorControl editorControl, EditorPanel editorPanel) {
		this.editorControl = editorControl;
		this.editorPanel = editorPanel;
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println(e.getPoint());
		editorControl.setErsterPunkt(e.getPoint());
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println(e.getPoint());
		editorControl.erzeugeFigurMitZweitemPunkt(e.getPoint());
		editorPanel.repaint();
	}
}