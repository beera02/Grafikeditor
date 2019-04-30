import java.awt.Graphics;
import java.awt.Point;

final class EditorControl {
	private Zeichnung zeichnung = new Zeichnung();
	private char figurTyp;
	private Point ersterPunkt;
	
	public void allesNeuZeichnen(Graphics g) {
		zeichnung.zeichneFiguren(g);
	}
	
	public void allesLoeschen() {
		zeichnung.clearFiguren();
	}
	
	public void setFigurTyp(char figurTyp) {
		this.figurTyp = figurTyp;
	}
	
	public void setErsterPunkt(Point ersterPunkt) {
		this.ersterPunkt = ersterPunkt;
	}
	
	public void erzeugeFigurMitZweitemPunkt(Point zweiterPunkt) {
		Figur figur = new Rechteck();
		if(figurTyp == 'r') {
			Rechteck rechteck = new Rechteck();
			if(ersterPunkt.x > zweiterPunkt.x) {
				rechteck.setStartPositionX(zweiterPunkt.x);
				rechteck.setBreite(ersterPunkt.x - zweiterPunkt.x);
			}
			else {
				rechteck.setStartPositionX(ersterPunkt.x);
				rechteck.setBreite(zweiterPunkt.x - ersterPunkt.x);
			}
			if(ersterPunkt.y > zweiterPunkt.y) {
				rechteck.setStartPositionY(zweiterPunkt.y);
				rechteck.setHoehe(ersterPunkt.y - zweiterPunkt.y);
			}
			else {
				rechteck.setStartPositionY(ersterPunkt.y);
				rechteck.setHoehe(zweiterPunkt.y - ersterPunkt.y);
			}
			figur = rechteck;
		}
		else if(figurTyp == 'l') {
			Linie linie = new Linie();
			linie.setStartPositionX(ersterPunkt.x);
			linie.setStartPositionY(ersterPunkt.y);
			linie.setEndPositionX(zweiterPunkt.x);
			linie.setEndPositionY(zweiterPunkt.y);
			figur = linie;
		}
		else if(figurTyp == 'k') {
			Kreis kreis = new Kreis();
			if(ersterPunkt.x > zweiterPunkt.x) {
				kreis.setStartPositionX(zweiterPunkt.x + (ersterPunkt.x - zweiterPunkt.x));
				kreis.setRadius(ersterPunkt.x - zweiterPunkt.x);
			}
			else {
				kreis.setStartPositionX(ersterPunkt.x + (zweiterPunkt.x - ersterPunkt.x));
				kreis.setRadius(zweiterPunkt.x - ersterPunkt.x);
			}
			if(ersterPunkt.y > zweiterPunkt.y) {
				kreis.setStartPositionY(zweiterPunkt.y + (ersterPunkt.y - zweiterPunkt.y));
			}
			else {
				kreis.setStartPositionY(ersterPunkt.y + (zweiterPunkt.y - ersterPunkt.y));
			}
			figur = kreis;
		}
		else if(figurTyp == 'u') {
			
		}
		zeichnung.addFigur(figur);
	}
}
