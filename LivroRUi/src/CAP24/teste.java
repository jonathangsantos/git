package CAP24;
import javax.swing.JOptionPane;

public class teste {
	public static void main(String[] args) {

		//System.out.println("oiiee");
		 int j = 0;
		for (int i = 0; i < 3; ++i) {
			j++;
			String a = "" + i + " \n" ;
			JOptionPane.showMessageDialog(null, a + j);
		}
	}
}
