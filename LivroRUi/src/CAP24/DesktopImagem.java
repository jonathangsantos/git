package CAP24;
import java.awt.*;
import javax.swing.*;

public class DesktopImagem extends JDesktopPane{
	private ImageIcon image;
	
	public DesktopImagem(String desktop) {
		image = new ImageIcon(getClass().getResource(desktop));
	}
	
	public void painComponent(Graphics g) {
		super.paintComponents(g);
		image.paintIcon(this, g, 0, 0);
	}
	
	public Dimension getPreferredSize() {
		return new Dimension(image.getIconWidth(), image.getIconHeight());
	}
}
