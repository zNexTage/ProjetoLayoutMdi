package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws IOException{
		// Preparação para iniciar o fxmlPrincipal
		Pane pRoot;
		Scene scCena;
			pRoot = FXMLLoader.load(this.getClass().getResource("FrmPrincipal.fxml"));

			scCena = new Scene(pRoot);
			
			//primaryStage.setMaximized(true); Inicializa maximizado
			//primaryStage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);
			//primaryStage.setFullScreen(true); Inicia em fullscreen
			//primaryStage.setResizable(false); Tira o botao de maximizar
			//primaryStage.initStyle(StageStyle.UNDECORATED); Remove os botões de minimizar, fechar...
			primaryStage.setScene(scCena);
			primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
