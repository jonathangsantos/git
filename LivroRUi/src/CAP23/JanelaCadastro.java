package CAP23;
import java.awt.*;

import javax.swing.*;
import java.net.URL;

public class JanelaCadastro extends JanelaAmarela {
	protected JPanel pnOestre;
	private JPanel pnCentro;
	private JPanel pnSul;
	private JButton btGravar;
	private JButton btSair;
	private JLabel lbCodigo;
	
	public JanelaCadastro(String titulo) {
		super(titulo,new Dimension(400, 300));
		
		pnOestre = new JPanel();
		pnOestre.setLayout(null);
		pnOestre.setBounds(5, 5,100 , 190);
		pnOestre.setBackground(Color.GREEN);
		
		pnCentro = new JPanel();            
		pnCentro.setLayout(null);           
		pnCentro.setBounds(110, 5,270 , 190); 
		pnCentro.setBackground(Color.GREEN);
		                             
		pnSul = new JPanel();             
		pnSul.setLayout(null);            
		pnSul.setBounds(5, 200,375 , 57);
		pnSul.setBackground(Color.GREEN); 
		                             
		btGravar = new JButton();
		btGravar.setText("Gravar");
		btGravar.setBounds(125,210 , 100, 40);
		btGravar.setBackground(new Color(0, 0, 170));
		btGravar.setForeground(Color.YELLOW);
		btGravar.setFont(new Font("Arial",Font.BOLD,12));
		btGravar.setToolTipText("Gravar os dados");
		URL url_gravar = getClass().getResource("Gravar.png");
		btGravar.setIcon(new ImageIcon(url_gravar));
		btGravar.setHorizontalAlignment(SwingConstants.CENTER);
		btGravar.setVerticalAlignment(SwingConstants.CENTER);
		btGravar.setHorizontalTextPosition(SwingConstants.RIGHT);
		btGravar.setVerticalTextPosition(SwingConstants.CENTER);
		btGravar.setEnabled(false);
		btGravar.setMnemonic('G');
		
		btSair= new JButton();
		btSair.setText("Sair");
		btSair.setBounds(240,210 , 100, 40);
		btSair.setBackground(new Color(0, 0, 170));
		btSair.setForeground(Color.YELLOW);
		btSair.setFont(new Font("Arial",Font.BOLD,12));
		btSair.setToolTipText("Encerrar aplicativo");
		URL url_Sair = getClass().getResource("Sair.png");
		btSair.setIcon(new ImageIcon(url_Sair));
		btSair.setHorizontalAlignment(SwingConstants.CENTER);
		btSair.setVerticalAlignment(SwingConstants.CENTER);
		btSair.setHorizontalTextPosition(SwingConstants.RIGHT);
		btSair.setVerticalTextPosition(SwingConstants.CENTER);
		btSair.setEnabled(true);
		btSair.setMnemonic('S');
		
		lbCodigo = new JLabel();
		lbCodigo.setLayout(null);
		lbCodigo.setText("Codigo:");
		lbCodigo.setFont(new Font("Arial", Font.BOLD, 12));
		lbCodigo.setForeground(Color.BLACK);
		lbCodigo.setBounds(10, 10, 50, 50);
		
		pnSul.add(btGravar);
		pnSul.add(btSair);
		
		getContentPane().add(btGravar);
		getContentPane().add(btSair);
	
		getContentPane().add(pnCentro);
	    getContentPane().add(pnSul);
	}
	public void setpnOeste(JLabel cod) {
		getContentPane().add(cod);
	}
	public static void main(String[] args) {
		new JanelaCadastro("Janela de Cadastro").setVisible(true);
	}
}
