import java.awt.Graphics;

public abstract class Figur{
	protected int startPositionX;
	protected int startPositionY;
	
	public Figur(int startPositionX, int startPositionY) {
		this.startPositionX = startPositionX;
		this.startPositionY = startPositionY;
	}
	
	public Figur() {}
	
	public void move(int deltaX, int deltaY) {
		startPositionX += deltaX;
		startPositionY += deltaY;
	}
	
	public abstract Figur create(String[] figur);
	
	public abstract void zeichneFigur(Graphics g);
	
	public abstract String createSaveString();
	
	public abstract void strecken(float faktor);
	
	public abstract void spiegeln(String modus);
	
	public abstract boolean isLoadingObjectEqual();

	public int getStartPositionX() {
		return startPositionX;
	}

	public void setStartPositionX(int startPositionX) {
		this.startPositionX = startPositionX;
	}

	public int getStartPositionY() {
		return startPositionY;
	}

	public void setStartPositionY(int startPositionY) {
		this.startPositionY = startPositionY;
	}
}
