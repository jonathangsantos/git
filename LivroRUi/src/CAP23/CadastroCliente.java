package CAP23;
import java.awt.*;
import javax.swing.*;

public class CadastroCliente extends JanelaCadastro{
	private JLabel lbCodigo;
	private JLabel lbNome;
	private JLabel lbEndereco;
	private JLabel lbTelefone;
	private JLabel lbCPF;
	
	public CadastroCliente() {
		super("Cadastro de Clientes");
		
		lbCodigo = new JLabel();
		lbCodigo.setLayout(null);
		lbCodigo.setText("Codigo:");
		lbCodigo.setFont(new Font("Arial", Font.BOLD, 12));
		lbCodigo.setForeground(Color.BLACK);
		lbCodigo.setBounds(10, 20, 50, 50);
		
		
		lbNome = new JLabel();
		lbNome.setText("Nome:");
		lbNome.setFont(new Font("Arial", Font.BOLD, 12));
		lbNome.setForeground(Color.BLACK);
		lbNome.setBounds(10, 40, 50, 50);
		
		lbEndereco = new JLabel();
		lbEndereco.setText("Endereço:");
		lbEndereco.setFont(new Font("Arial", Font.BOLD, 12));
		lbEndereco.setForeground(Color.BLACK);
		lbEndereco.setBounds(10, 60, 80, 50);
		
		lbTelefone = new JLabel();
		lbTelefone.setText("Telefone:");
		lbTelefone.setFont(new Font("Arial", Font.BOLD, 12));
		lbTelefone.setForeground(Color.BLACK);
		lbTelefone.setBounds(10, 80, 80, 50);
		
		lbCPF = new JLabel();
		lbCPF.setText("CPF:");
		lbCPF.setFont(new Font("Arial", Font.BOLD, 12));
		lbCPF.setForeground(Color.BLACK);
		lbCPF.setBounds(10, 100, 50, 50);
		
		getContentPane().add(lbCodigo);
		getContentPane().add(lbNome);
		getContentPane().add(lbEndereco);
		getContentPane().add(lbTelefone);
		getContentPane().add(lbCPF);
		
		getContentPane().add(pnOestre);
	}
	public static void main(String[] args) {
		new CadastroCliente().setVisible(true);
	}
}
