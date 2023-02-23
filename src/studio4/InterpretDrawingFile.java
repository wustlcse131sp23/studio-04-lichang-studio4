package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		String shape = in.next();
		int rgbOne = in.nextInt();
		int rgbTwo = in.nextInt();
		int rgbThree = in.nextInt();
		StdDraw.setPenColor(rgbOne, rgbTwo, rgbThree);
		boolean isFilled = in.nextBoolean();
		double paramterOne = in.nextDouble();
		double paramterTwo = in.nextDouble();
		double paramterThree = in.nextDouble();
		double paramterFour = in.nextDouble();
		if(isFilled) {
			StdDraw.filledRectangle(paramterOne, paramterTwo, paramterThree, paramterFour);
		}
		else {
			StdDraw.rectangle(paramterOne, paramterTwo, paramterThree, paramterFour);
		}
		
		


	}
}
