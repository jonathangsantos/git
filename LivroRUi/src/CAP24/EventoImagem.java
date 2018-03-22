package CAP24;

import java.awt.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.text.html.ImageView;

import javafx.scene.transform.Scale;

import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.net.URL;

public class EventoImagem extends JFrame {

	private JButton btcinza;
	private JButton btVermelho;
	private JButton btAzul;
	private JButton btVerde;
	private JLabel lbImagem;
	private DesktopImagem desktop;
	
	public EventoImagem() {
		super();
		setTitle("Imagem");
		setBounds(10, 5, 1024, 2280);

		File arq = new File("C:\\\\Users\\\\jonathan\\\\Pictures\\\\WhatsApp Image 2018-02-05 at 07.01.43.jpeg");

		btVermelho = new JButton("vermelho");
		btVermelho.setToolTipText("Muda a cor para cinza da imagem!");
		btVermelho.setBounds(440, 400, 100, 30);
		btVermelho.setFont(new Font("Arial", Font.BOLD, 12));
		btVermelho.addActionListener(new ActionListener() {

			double cor2[] = new double[710 * 1210];

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					/// Le
					BufferedImage image = ImageIO.read(arq);
					WritableRaster raster = image.getRaster();

					// verifica as cores
					if (e.getSource() == btVermelho) {
						for (int h = 1; h < image.getHeight(); h++) {
							for (int w = 1; w < image.getWidth(); w++) {
								cor2[0] = image.getRGB(w, h);

								raster.setPixel(w, h, cor2);
							}
						}
						btVermelho.setEnabled(false);
					}

					// escreve
					ImageIO.write(image, "PNG", new File("C:\\Users\\jonathan\\Pictures\\ImagemVermelho.png"));

				} catch (Exception a) {
					System.err.println("Erro" + a.getMessage());
				}
			}

		});

		btAzul = new JButton("Azul");
		btAzul.setToolTipText("Muda a cor para azul da imagem!");
		btAzul.setBounds(330, 400, 100, 30);
		btAzul.setFont(new Font("Arial", Font.BOLD, 12));
		btAzul.addActionListener(new ActionListener() {

			double cor2[] = new double[710 * 1210];

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					/// Le
					BufferedImage image = ImageIO.read(arq);
					WritableRaster raster = image.getRaster();

					// verifica as cores
					if (e.getSource() == btAzul) {
						for (int h = 1; h < image.getHeight(); h++) {
							for (int w = 1; w < image.getWidth(); w++) {
								cor2[2] = image.getRGB(w, h);

								raster.setPixel(w, h, cor2);
							}
						}
						btAzul.setEnabled(false);
					}

					// escreve
					ImageIO.write(image, "PNG", new File("C:\\Users\\jonathan\\Pictures\\ImagemAzul.png"));

				} catch (Exception a) {
					System.err.println("Erro" + a.getMessage());
				}
			}

		});

		btVerde = new JButton("Verde");
		btVerde.setToolTipText("Muda a cor para cinza da imagem!");
		btVerde.setBounds(70, 400, 100, 30);
		btVerde.setFont(new Font("Arial", Font.BOLD, 12));
		btVerde.addActionListener(new ActionListener() {

			double cor2[] = new double[710 * 1210];

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					/// Le
					BufferedImage image = ImageIO.read(arq);
					WritableRaster raster = image.getRaster();

					// verifica as cores
					if (e.getSource() == btVerde) {
						for (int h = 1; h < image.getHeight(); h++) {
							for (int w = 1; w < image.getWidth(); w++) {
								cor2[1] = image.getRGB(w, h);

								raster.setPixel(w, h, cor2);
							}
						}
						btVerde.setEnabled(false);
					}

					// escreve
					ImageIO.write(image, "PNG", new File("C:\\Users\\jonathan\\Pictures\\ImagemVerde.png"));

				} catch (Exception a) {
					System.err.println("Erro" + a.getMessage());
				}
			}

		});

		btcinza = new JButton("cinza");
		btcinza.setToolTipText("Muda a cor para cinza da imagem!");
		btcinza.setBounds(200, 400, 100, 30);
		btcinza.setFont(new Font("Arial", Font.BOLD, 12));
		btcinza.addActionListener(new ActionListener() {

			double cor2[] = new double[710 * 1210];

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					/// Le
					BufferedImage image = ImageIO.read(arq);
					WritableRaster raster = image.getRaster(); 
					
					// verifica as cores
					if (e.getSource() == btcinza) {
						for (int h = 1; h < image.getHeight(); h++) {
							for (int w = 1; w < image.getWidth(); w++) {
								cor2[0] = image.getRGB(w, h);
								cor2[1] = image.getRGB(w, h);
								cor2[2] = image.getRGB(w, h);

								raster.setPixel(w, h, cor2);
							}
						}
						btcinza.setEnabled(false);
					}

					// escreve
					ImageIO.write(image, "PNG", new File("C:\\Users\\jonathan\\Pictures\\ImagemCinza.png"));

				} catch (Exception a) {
					System.err.println("Erro" + a.getMessage());
				}
			}

		});
		
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.DARK_GRAY);
		getContentPane().add(btcinza);
		getContentPane().add(btAzul);
		getContentPane().add(btVermelho);
		getContentPane().add(btVerde);
	}

	public static void main(String[] args) {
		new EventoImagem().setVisible(true);
	}
}
