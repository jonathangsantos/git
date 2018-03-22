package CAP23;
import java.awt.*;
import java.net.URL;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Janela  extends JFrame {
	
	public Janela(String titulo, Dimension tamanho) 
	{
		super();
		setTitle(titulo);
		setSize(tamanho);
		centralizar();
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.white);
		URL url = getClass().getResource("Livros.png");
		Image im = Toolkit.getDefaultToolkit().getImage(url);
		setIconImage(im);
		
	}
	public void centralizar() 
	{
		Dimension dt = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension dj = getSize();
		setLocation((dt.width - dj.width)/2,(dt.height - dj.height)/2);
	}
	public static void main(String[] args) {
		Janela jan = new Janela("SisEscola", new Dimension(300, 200));
		jan.setVisible(true);
	}
}
