import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FigurSaver {
	public void saveFigur(Figur figur) {
		String saveString = prepareString(figur);
		try {
			Files.deleteIfExists(Paths.get("C:\\Data\\figures.txt"));
			File figuresFile = new File("C:/Data/figures.txt");
			File figuresDirectory = new File("C:/Data/");
			figuresDirectory.mkdirs();
			figuresFile.createNewFile();
			PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(figuresFile, true)));
			writer.println(saveString);
			writer.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String prepareString(Figur figur) {
		return figur.createSaveString();
	}
}
