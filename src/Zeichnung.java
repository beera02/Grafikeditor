import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class Zeichnung {
	List<Figur> figuren = new ArrayList<Figur>();
		
	public void zeichneFiguren(Graphics g) {
		for (Figur f:figuren){
			f.zeichneFigur(g);
	    }
  	}
	  
	public void addFigur(Figur figur) {
		figuren.add(figur);
	}
	
	public void addFiguren(List<Figur> figur) {
		figuren.addAll(figur);
	}

	public void clearFiguren() {
		figuren.clear();
	}
}
