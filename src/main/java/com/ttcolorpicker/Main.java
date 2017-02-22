package com.ttcolorpicker;

import com.ttcolorpicker.controller.MainWindowController;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(this.getClass().getResource("/fxml/MainWindow.fxml"));
		StackPane stackPane = loader.load();
		MainWindowController controller = new MainWindowController();// loader.getController();
		// MainWindowController controller = loader.getController();
		loader.setController(controller);
		Scene scene = new Scene(stackPane);
		// image from:
		// http://www.softicons.com/application-icons/colorpicker-icon-by-angel-corral-arias/color-picker-icon
		primaryStage.getIcons().add(new Image("/gfx/colorpicker.png"));
		primaryStage.setScene(scene);
		primaryStage.setTitle("TTColorPicker");
		primaryStage.resizableProperty().setValue(Boolean.FALSE);
		primaryStage.show();
	}

}
