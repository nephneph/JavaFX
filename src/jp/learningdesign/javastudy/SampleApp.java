package jp.learningdesign.javastudy;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class SampleApp extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		Label label = new Label("Hello JavaFX!");
		TextField field = new TextField();
		Button button = new Button("送信");
		
		BorderPane pane = new BorderPane();
		pane.setTop(label);
		pane.setCenter(field);
		pane.setBottom(button);
		Scene scene = new Scene(pane, 400 ,300);
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		launch(args);
	}

}
