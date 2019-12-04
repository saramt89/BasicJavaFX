package application;
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
/**
 * Aplicación JavaFX que abre una imagen y tres botones. Con un boton le aplica un efecto blur(que distorsiona la imagen)
 * y con el otro boton le quitamos el efecto. 
 * Finalmente con otro boton cerramos la aplicación
 * @author Sara
 * @see BlurController
 */

public class Main extends Application {

	private AnchorPane mypane;

	@Override
	public void start(Stage stage) throws IOException {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("Vista2.fxml"));

		mypane = (AnchorPane) loader.load();

		stage.setTitle("Where's the squirrel?");
		stage.setScene(new Scene(mypane));
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}