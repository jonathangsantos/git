
package CAP24;

import static javax.swing.JOptionPane.showMessageDialog;

import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class EventoJanela5 extends JFrame {

	public EventoJanela5() {
		super();
		setSize(300, 200);
		setTitle("Eventos de janela");
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.CYAN);

		addWindowListener(new Ouvinte());
	}

	public static void main(String[] args) {
		new EventoJanela5().setVisible(true);
	}

	class Ouvinte extends WindowAdapter {
		public void windowClosing(WindowEvent event) {
			showMessageDialog(EventoJanela5.this, "Até logo!");
			System.exit(0);
		}

		public void windowOpened(WindowEvent e) {
			showMessageDialog(EventoJanela5.this, "Bem vindo!");
		}
	}
}
