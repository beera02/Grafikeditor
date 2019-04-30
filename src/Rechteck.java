import java.awt.Graphics;

public class Rechteck extends Figur{
	protected int breite;
	protected int hoehe;
	
	public Rechteck(int startPositionX, int startPositionY, int breite, int hoehe) {
		super(startPositionX, startPositionY);
		this.setBreite(breite);
		this.setHoehe(hoehe);
	}
	
	public Rechteck() {}

	@Override
	public void zeichneFigur(Graphics g) {
		g.drawRect(startPositionX, startPositionY, breite, hoehe);
	}
	
	@Override
	public String createSaveString() {
		return ";rechteck:" + startPositionX + ":" + startPositionY + ":" + breite + ":" + hoehe;
	}
	
	@Override
	public void strecken(float faktor) {
		breite *= faktor;
		hoehe *= faktor;
	}
	
	@Override
	public void spiegeln(String modus){
		if(modus.equals("h")) {
			startPositionX += breite;
		}
		else if(modus.equals("v")){
			startPositionY += hoehe;
		}
	}
	
	@Override
	public Rechteck create(String[] figur) {
		return new Rechteck(Integer.parseInt(figur[1]),Integer.parseInt(figur[2]),Integer.parseInt(figur[3]),Integer.parseInt(figur[4])); 
	}
	
	@Override
	public boolean isLoadingObjectEqual() {
		return false;
	}

	public int getBreite() {
		return breite;
	}

	public void setBreite(int breite) {
		this.breite = breite;
	}

	public int getHoehe() {
		return hoehe;
	}

	public void setHoehe(int hoehe) {
		this.hoehe = hoehe;
	}
}
