public class FigurFactory {
	public Figur getFigur(String figur) {
		if(figur.equals("rechteck")) {
			return new Rechteck();
		}
		else if(figur.equals("kreis")) {
			return new Kreis();
		}
		else if(figur.equals("linie")) {
			return new Linie();
		}
		else if(figur.equals("rundesrechteck")) {
			return new RundesRechteck();
		}
		else {
			return null;
		}
	}
}
