package CAP24;
import static javax.swing.JOptionPane.showMessageDialog;

import java.awt.Color;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class EventoJanela4 extends JFrame {
	public EventoJanela4() {
		super();
		setSize(300,200);
		setTitle("Eventos janela");
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.CYAN);
		
		addWindowListener(new Ouvinte() );
	}
	
	public static void main(String[] args) {
		new EventoJanela4().setVisible(true);
	}
	
	class Ouvinte implements WindowListener{
		public void windowOpened(WindowEvent e) {
			showMessageDialog(EventoJanela4.this, "Bem-Vindo!");
		}
		
		public void windowClosing(WindowEvent e) {
			showMessageDialog(EventoJanela4.this, "Até Logo!");
			System.exit(0);
		}
		
		public void windowIconified(WindowEvent e) {}
		public void windowDeiconified(WindowEvent e) {}
		public void windowDeactivated(WindowEvent e) {}
		public void windowClosed(WindowEvent e) {}
		public void windowActivated(WindowEvent e) {}
	}
}
