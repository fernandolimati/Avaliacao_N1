package avaliacao;

import java.awt.Color;
import java.util.Date;

import org.joda.time.LocalTime;

import ij.IJ;
import ij.ImagePlus;
import ij.process.ImageProcessor;

public class Principal {

	public static void main(String[] args) {
		ImagePlus imp = IJ.openImage("../Avaliacao_N1/img/b.jpg");
		ImageProcessor ip = imp.getProcessor();
		ip.setColor(Color.YELLOW);
		ip.setLineWidth(4);
		ip.drawRect(10, 10, imp.getWidth() - 20, imp.getHeight() - 20);
		imp.show();
	}
	
	public LocalTime getHorario() {
		LocalTime currentTime = new LocalTime();
		System.out.println("The current local time is: " + currentTime.toString());
		System.out.println(currentTime.toDateTimeToday().toDate().getTime());
		System.out.println(new Date().getTime());
		System.out.println(new Date().getTime() - currentTime.toDateTimeToday().toDate().getTime());
		return currentTime;
	}

}
