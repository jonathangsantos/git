package CAP24;

import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.File;
import java.net.URL;
import java.util.LinkedList;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.swing.*;

import javafx.scene.image.Image;

public class EventoFoco extends JFrame implements FocusListener {
	private JLabel lbFG;
	private JLabel lbFL;
	private JButton bt1;
	private JButton bt2;
	private JButton bt3;

	public EventoFoco() {
		setTitle("Eventos de Foco");
		setSize(340, 130);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		bt1 = new JButton("Botão 1");
		bt1.setBounds(10, 10, 100, 30);
		bt1.addFocusListener(this);

		bt2 = new JButton("Botão 2");
		bt2.setBounds(110, 10, 100, 30);
		bt2.addFocusListener(this);

		bt3 = new JButton("Botão 3");
		bt3.setBounds(210, 10, 100, 30);
		bt3.addFocusListener(this);

		lbFG = new JLabel();
		lbFG.setBounds(5, 50, 280, 20);

		lbFL = new JLabel();
		lbFL.setBounds(5, 170, 400, 200);

		getContentPane().setLayout(null);
		getContentPane().add(bt1);
		getContentPane().add(bt2);
		getContentPane().add(bt3);
		getContentPane().add(lbFG);
		getContentPane().add(lbFL);

	}

	public void focusGained(FocusEvent e) {
		if (e.getSource() == bt1)
			lbFG.setText("Botão 1 recebeu o foco");
		if (e.getSource() == bt2)
			lbFG.setText("Botão 2 recebeu o foco");
		if (e.getSource() == bt3)
			lbFG.setText("Botão 3 recebeu o foco");
	}

	public void focusLost(FocusEvent e) {
		if (e.getSource() == bt1)
			lbFL.setText("Botão 1 perdeu o foco");
		if (e.getSource() == bt2)
			lbFL.setText("Botão 2 perdeu o foco");
		if (e.getSource() == bt3)
			lbFL.setText("Botão 3 perdeu o foco");
	}

	public static void main(String[] args) {
		new EventoFoco().setVisible(true);
	}
}
