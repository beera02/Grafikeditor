import java.awt.Graphics;

public class RundesRechteck extends Rechteck{
	private int roundWidth;
	private int roundHeight;

	public RundesRechteck(int startPositionX, int startPositionY, int breite, int hoehe, int roundWidth, int roundHeight) {
		super(startPositionX, startPositionY, breite, hoehe);
		this.roundWidth = roundWidth;
		this.roundHeight = roundHeight;
	}
	
	public RundesRechteck() {}

	@Override
	public void zeichneFigur(Graphics g) {
		g.drawRoundRect(startPositionX, startPositionY, breite, hoehe, roundWidth, roundHeight);
	}
	
	@Override
	public String createSaveString() {
		return ";rundesrechteck:" + startPositionX + ":" + startPositionY + ":" + breite + ":" + hoehe + ":" + roundWidth + ":" + roundHeight;
	}
	
	@Override
	public void strecken(float faktor) {
		breite *= faktor;
		hoehe *= faktor;
	}
	
	@Override
	public RundesRechteck create(String[] figur) {
		return new RundesRechteck(Integer.parseInt(figur[1]), Integer.parseInt(figur[2]), Integer.parseInt(figur[3]), Integer.parseInt(figur[4]), Integer.parseInt(figur[5]), Integer.parseInt(figur[6]));
	}

	@Override
	public boolean isLoadingObjectEqual() {
		return false;
	}
	
	public int getRoundWidth() {
		return roundWidth;
	}

	public void setRoundWidth(int roundWidth) {
		this.roundWidth = roundWidth;
	}

	public int getRoundHeight() {
		return roundHeight;
	}

	public void setRoundHeight(int roundHeight) {
		this.roundHeight = roundHeight;
	}
}
