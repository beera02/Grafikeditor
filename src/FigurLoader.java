import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FigurLoader {
	public void loadFigures(Zeichnung zeichnung) {
		String file = "C:/Data/figures.txt";
		List<Figur> figuren = new ArrayList<Figur>();
		FigurFactory factory = new FigurFactory();
		try (Scanner scanner = new Scanner (new File(file), "UTF-8")) {
			while(scanner.hasNextLine()){
				String line = scanner.nextLine();
				String splittedone = line.split(";")[1];
				String[] splittedtwo = splittedone.split(":");
				Figur figur = factory.getFigur(splittedtwo[0]);
				figuren.add(figur.create(splittedtwo));
			}
			scanner.close();
			zeichnung.addFiguren(figuren);
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
