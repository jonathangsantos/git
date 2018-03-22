package CAP23;
import java.awt.*;
import javax.swing.*;

public class JanelaAmarela extends JFrame{
	public JanelaAmarela(String titulo,Dimension tamanho) {
		super();
		setTitle(titulo); //pegar nome no contrutor e coloca no app
		setSize(tamanho); //pega tamanho no construtor e coloca na janela
		centralizar();
		setDefaultCloseOperation(DISPOSE_ON_CLOSE); // faz o app fechar e assim liberar memória
		
		getContentPane().setLayout(null); //anula seu leaute padrão para assim está fazendo as configurações
		getContentPane().setBackground(Color.YELLOW); // troca a cor de leaut para amarelo
	}
	public void centralizar() {
		Dimension dt = Toolkit.getDefaultToolkit().getScreenSize();// obtem altura e largura da resolução da tela do computador
		Dimension dj = getSize();// pega a altura e largura da janela 
		setLocation((dt.width - dj.width)/2,(dt.height - dj.height)/2);// assim faz centralização, pegando os valores de altura e largura menos da janela dividino por dois
	}
	public static void main(String[] args) {
		JanelaAmarela ja = new JanelaAmarela("Exercício 1", new Dimension(300, 300));// faz coonstrutor e passa nome da janela e tamanho da janela
		ja.setVisible(true); // faz aparecer a janela com true
	}
}
