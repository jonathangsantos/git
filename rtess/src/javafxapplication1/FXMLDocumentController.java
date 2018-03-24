package javafxapplication1;

import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

public class FXMLDocumentController implements Initializable {

	@FXML
	private ImageView img;

	@FXML
	private Button bt2;

	@FXML
	private Button bt1;

	@FXML
	private Button bt3;

	@FXML
	private Button bt4;

	@FXML
	private void handleButtonAction(ActionEvent event) {
		try {
			CorImagem cor = new CorImagem();		
			cor.IniciaArq();

			if (event.getSource() == bt1)
				img.setImage(cor.Vermelho());

			if (event.getSource() == bt2)
				img.setImage(cor.Azul());

			if (event.getSource() == bt3)
				img.setImage(cor.cinza());

			if (event.getSource() == bt4)
				img.setImage(cor.Verde());

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro!");
		}
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {

	}
}
