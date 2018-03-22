package CAP23;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class CadastroFuncionarios extends JanelaCadastro{
	private JLabel lbMatricula;
	private JLabel lbNome;
	private JLabel lbNascimento;
	private JLabel lbSalario;
	private JLabel lbTelefone;
	private JLabel lbEmail;
	
	public CadastroFuncionarios() {
		super("Cadastro de Funcionários");
		
		lbMatricula = new JLabel();
		lbMatricula.setLayout(null);
		lbMatricula.setText("Codigo:");
		lbMatricula.setFont(new Font("Arial", Font.BOLD, 12));
		lbMatricula.setForeground(Color.BLACK);
		lbMatricula.setBounds(10, 20, 50, 50);
		
		
		lbNome = new JLabel();
		lbNome.setText("Nome:");
		lbNome.setFont(new Font("Arial", Font.BOLD, 12));
		lbNome.setForeground(Color.BLACK);
		lbNome.setBounds(10, 40, 50, 50);
		
		lbNascimento = new JLabel();
		lbNascimento.setText("Nascimento:");
		lbNascimento.setFont(new Font("Arial", Font.BOLD, 12));
		lbNascimento.setForeground(Color.BLACK);
		lbNascimento.setBounds(10, 60, 80, 50);
		
		lbSalario = new JLabel();
		lbSalario.setText("Salário:");
		lbSalario.setFont(new Font("Arial", Font.BOLD, 12));
		lbSalario.setForeground(Color.BLACK);
		lbSalario.setBounds(10, 80, 50, 50);
		
		lbTelefone = new JLabel();
		lbTelefone.setText("Telefone:");
		lbTelefone.setFont(new Font("Arial", Font.BOLD, 12));
		lbTelefone.setForeground(Color.BLACK);
		lbTelefone.setBounds(10, 100, 80, 50);
		
		lbEmail = new JLabel();
		lbEmail.setText("Email:");
		lbEmail.setFont(new Font("Arial", Font.BOLD, 12));
		lbEmail.setForeground(Color.BLACK);
		lbEmail.setBounds(10, 120, 50, 50);
		
		getContentPane().add(lbMatricula);
		getContentPane().add(lbNome);
		getContentPane().add(lbSalario);
		getContentPane().add(lbTelefone);
		getContentPane().add(lbEmail);
		getContentPane().add(lbNascimento);
		
		getContentPane().add(pnOestre);
	}
	public static void main(String[] args) {
		new CadastroFuncionarios().setVisible(true);
	}
}
