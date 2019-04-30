import java.awt.Graphics;

public class Linie extends Figur{
	private int endPositionX;
	private int endPositionY;
	
	public Linie(int startPositionX, int startPositionY, int endPositionX, int endPositionY) {
		super(startPositionX, startPositionY);
		this.setEndPositionX(endPositionX);
		this.setEndPositionY(endPositionY);
	}
	
	public Linie() {}

	@Override
	public void zeichneFigur(Graphics g) {
		g.drawLine(startPositionX, startPositionY, endPositionX, endPositionY);
	}
	
	@Override
	public String createSaveString() {
		return ";linie:" + startPositionX + ":" + startPositionY + ":" + endPositionX + ":" + endPositionY;
	}
	
	@Override
	public void move(int deltaX, int deltaY){
		super.move(deltaX, deltaY);
		endPositionX += deltaX;
		endPositionY += deltaY;
	}
	
	@Override
	public void strecken(float faktor) {
		endPositionX *= faktor;
		endPositionY *= faktor;
	}
	
	@Override
	public void spiegeln(String modus){
		if(modus.equals("h")) {
			if(endPositionX > startPositionX) {
				startPositionX += (endPositionX - startPositionX);
			}
			else {
				endPositionX += (startPositionX - endPositionX);
			}
		}
		else if(modus.equals("v")){
			if(endPositionY > startPositionY) {
				startPositionY += (endPositionY - startPositionY);
			}
			else {
				endPositionY += (startPositionY - endPositionY);
			}
		}
	}
	
	@Override
	public Linie create(String[] figur) {
		return new Linie(Integer.parseInt(figur[1]), Integer.parseInt(figur[2]), Integer.parseInt(figur[3]), Integer.parseInt(figur[4])); 
	}
	
	@Override
	public boolean isLoadingObjectEqual() {
		return false;
	}

	public int getEndPositionY() {
		return endPositionY;
	}

	public void setEndPositionY(int endPositionY) {
		this.endPositionY = endPositionY;
	}

	public int getEndPositionX() {
		return endPositionX;
	}

	public void setEndPositionX(int endPositionX) {
		this.endPositionX = endPositionX;
	}
}
