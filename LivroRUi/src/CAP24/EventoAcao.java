package CAP24;

import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class EventoAcao extends JFrame implements ActionListener {
	private JLabel lbStatus;
	private JButton btGravar;
	private JButton btSair;
	private int nrGravar;
	private int nrSair;

	public EventoAcao() {
		setTitle("Eventos de ação");
		setSize(250, 110);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		btGravar = new JButton("Gravar");
		btGravar.setBounds(10, 10, 100, 30);
		btGravar.addActionListener(this);
		
		btSair = new JButton("Sair");
		btSair.setBounds(120, 10, 100, 30);
		btSair.addActionListener(this);
		
		lbStatus = new JLabel("Pressione os botões.");
		lbStatus.setBounds(6, 50, 220, 20);
		
		getContentPane().setLayout(null);
		getContentPane().add(btGravar);
		getContentPane().add(btSair);
		getContentPane().add(lbStatus);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btGravar)
			lbStatus.setText("Gravar: " + ++nrGravar + " Vez(es)");
		else if (e.getSource() == btSair)
			lbStatus.setText("Sair: " + ++nrSair + " Vez(es)");
	}

	public static void main(String[] args) {
		new EventoAcao().setVisible(true);
	}

}
