package CAP24;
import static javax.swing.JOptionPane.showMessageDialog;

import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;;

public class EventoJanela3 extends JFrame{
	public EventoJanela3() {
		super();
		setSize(300,200);
		setTitle("Eventos de janela");
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.CYAN);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				showMessageDialog(EventoJanela3.this, "Até Logo!");
				System.exit(0);
			}
			public void windowOpened(WindowEvent e) {
				showMessageDialog(EventoJanela3.this, "Bem-Vindo!");
			}
		});
	}
	public static void main(String[] args) {
		new EventoJanela3().setVisible(true);
	}
}
