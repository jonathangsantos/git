package javafxapplication1;

import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import javax.imageio.ImageIO;
import javafx.scene.image.Image;

public class CorImagem {
	private double cor2[] = new double[710 * 1210];
	private File arq;
	private BufferedImage image;
	private WritableRaster raster;
    
	public CorImagem() {
	}

	public void IniciaArq() throws Exception {
		arq = new File("C:\\\\Users\\\\jonathan\\\\Pictures\\\\WhatsApp Image 2018-02-05 at 07.01.43.jpeg");
		image = ImageIO.read(arq);
		raster = image.getRaster();
	}

	public Image cinza() throws Exception {
		for (int h = 1; h < image.getHeight(); h++) {
			for (int w = 1; w < image.getWidth(); w++) {
				cor2[0] = image.getRGB(w, h);
				cor2[1] = image.getRGB(w, h);
				cor2[2] = image.getRGB(w, h);

				raster.setPixel(w, h, cor2);
			}
		}
		ImageIO.write(image, "PNG",
				new File("C:\\Users\\jonathan\\eclipse-workspace\\rtess\\src\\Imagens\\ImagemCinza.png"));
		Image imagem = new Image("Imagens/ImagemCinza.png");

		return imagem;
	}

	public Image Azul() throws Exception {
		for (int h = 1; h < image.getHeight(); h++) {
			for (int w = 1; w < image.getWidth(); w++) {
				cor2[2] = image.getRGB(w, h);

				raster.setPixel(w, h, cor2);
			}
		}
		ImageIO.write(image, "PNG",
				new File("C:\\Users\\jonathan\\eclipse-workspace\\rtess\\src\\Imagens\\ImagemAzul.png"));
		Image imagem = new Image("Imagens/ImagemAzul.png");

		return imagem;
	}

	public Image Vermelho() throws Exception {
		for (int h = 1; h < image.getHeight(); h++) {
			for (int w = 1; w < image.getWidth(); w++) {
				cor2[0] = image.getRGB(w, h);

				raster.setPixel(w, h, cor2);
			}
		}
		ImageIO.write(image, "PNG",
				new File("C:\\Users\\jonathan\\eclipse-workspace\\rtess\\src\\Imagens\\ImagemVermelho.png"));
		Image imagem = new Image("Imagens/ImagemVermelho.png");

		return imagem;
	}

	public Image Verde() throws Exception {
		for (int h = 1; h < image.getHeight(); h++) {
			for (int w = 1; w < image.getWidth(); w++) {
				cor2[1] = image.getRGB(w, h);

				raster.setPixel(w, h, cor2);
			}
		}
		ImageIO.write(image, "PNG",
				new File("C:\\Users\\jonathan\\eclipse-workspace\\rtess\\src\\Imagens\\ImagemVerde.png"));
		Image imagem = new Image("Imagens/ImagemVerde.png");

		return imagem;
	}
}
