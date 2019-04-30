import java.awt.Graphics;

public class Kreis extends Figur{
	private int radius;
	
	public Kreis(int startPositionX, int startPositionY, int radius) {
		super(startPositionX, startPositionY);
		this.radius = radius;
	}
	
	public Kreis() {}
	
	@Override
	public void zeichneFigur(Graphics g) {
		g.drawOval(startPositionX, startPositionY, 2 * radius, 2 * radius);
	}
	
	@Override
	public String createSaveString() {
		return ";kreis:" + startPositionX + ":" + startPositionY + ":" + radius;
	}
	
	@Override
	public void strecken(float faktor) {
		radius *= faktor;
	}
	
	@Override
	public void spiegeln(String modus){
		if(modus.equals("h")) {
			startPositionX += 2 * radius;
		}
		else if(modus.equals("v")){
			startPositionY += 2 * radius;
		}
	}
	
	@Override
	public Kreis create(String[] figur) {
		return new Kreis(Integer.parseInt(figur[1]), Integer.parseInt(figur[2]), Integer.parseInt(figur[3])); 
	}
	
	@Override
	public boolean isLoadingObjectEqual() {
		return false;
	}

	public int getRadius() {
		return radius;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
}
