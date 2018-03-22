package CAP24;
import java.awt.*;
import java.awt.Event;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class EventoJanela2  extends JFrame{
	public EventoJanela2() {
		super();
		setSize(300,200);
		setTitle("Eventos Janela");
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.CYAN);
		
		addWindowListener(new WindowListener() {
			public void windowOpened(WindowEvent e) {
				showMessageDialog(EventoJanela2.this, "Bem-Vindo!");
			}
			
			public void windowClosing(WindowEvent e) {
				showMessageDialog(EventoJanela2.this, "Até Logo!");
				System.exit(0);
			}
			
			public void windowIconified(WindowEvent e) {}
			public void windowDeiconified(WindowEvent e) {}
			public void windowDeactivated(WindowEvent e) {}
			public void windowClosed(WindowEvent e) {}
			public void windowActivated(WindowEvent e) {}
		});
	}
	public static void main(String[] args) {
		new EventoJanela2().setVisible(true);
	}
}
