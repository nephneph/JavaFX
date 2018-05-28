package jp.learningdesign.javastudy;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SampleApp2 extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("windowapp.fxml"));
		
		Scene scene = new Scene(root, 400 ,300);
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		launch(args);
	}

}
