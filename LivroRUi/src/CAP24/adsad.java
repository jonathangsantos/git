package CAP24;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.awt.image.WritableRaster;
import java.awt.image.renderable.RenderableImage;
import java.io.File;
import java.net.URL;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class adsad extends JPanel {
	public static void main(String[] args) {
		try {

			File arq = new File("C:\\\\Users\\\\jonathan\\\\Pictures\\\\WhatsApp Image 2018-02-05 at 07.01.43.jpeg");
			BufferedImage image = ImageIO.read(arq);

			int width = image.getWidth();
			int height = image.getHeight();

			WritableRaster raster = image.getRaster();

			double cor2[] = new double[710 * 1210];

			for (int h = 1; h < 1280; h++)
				for (int w = 1; w < 1024; w++) {
					cor2[0] = image.getRGB(w, h);
					cor2[1] = image.getRGB(w, h);
					cor2[2] = image.getRGB(w, h);
					
					raster.setPixel(w, h, cor2);

				}

			ImageIO.write(image, "PNG", new File("C:\\Users\\jonathan\\Pictures\\checkerboard.png"));

		} catch (Exception e) {
			System.err.println("Erro" + e.getMessage());
		}
	}
}