package CAP24;

import java.awt.Color;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class EventoJanela1 extends JFrame implements WindowListener {

	public EventoJanela1() {
		super();
		setSize(300, 200);
		setTitle("Eventos de Janela");
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.CYAN);
		
		addWindowListener(this);
	}

	public void windowOpened(java.awt.event.WindowEvent e) {
		JOptionPane.showMessageDialog(this, "Bem-Vindo!");
	}

	public void windowClosing(java.awt.event.WindowEvent e) {
		JOptionPane.showMessageDialog(this, "Até logo!");
		System.exit(0);
	}

	public void windowIconified(java.awt.event.WindowEvent e) {
	}

	public void windowDeiconified(java.awt.event.WindowEvent e) {
	}

	public void windowClosed(java.awt.event.WindowEvent e) {
	}

	public void windowActivated(java.awt.event.WindowEvent e) {
	}

	public void windowDeactivated(java.awt.event.WindowEvent e) {
	}

	public static void main(String[] args) {
		new EventoJanela1().setVisible(true);
	}

}
