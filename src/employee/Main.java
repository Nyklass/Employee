package employee;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Main extends Application {
private static Stage primaryStage;
private static BorderPane mainLayout;
	@Override
	public void start(Stage primaryStage) throws IOException {
		 this.primaryStage = primaryStage;
		 this.primaryStage.setTitle("Employee App");
		 showMainView();
		 showMainItems();
	}
	private void showMainView() throws IOException{
	FXMLLoader loader = new FXMLLoader();
	loader.setLocation(Main.class.getResource("view/MainView.fxml"));
	mainLayout = loader.load();
	Scene scene = new Scene(mainLayout);
	primaryStage.setScene(scene);
	primaryStage.show();
	}
	public static void showMainItems() throws IOException{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("view/MainItems.fxml"));
		BorderPane mainItems = loader.load();
		mainLayout.setCenter(mainItems);
		
	}
	public static void showElectricalScene() throws IOException{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("electrical/electricalDep.fxml"));
		BorderPane electricalDep = loader.load();
		mainLayout.setCenter(electricalDep);
		
		
	}
	public static void showMechanicalScene() throws IOException{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("mechanical/mechanicalDep.fxml"));
		BorderPane mechanicalDep = loader.load();
		mainLayout.setCenter(mechanicalDep);
		
		
	}
	public static void showAddStage() throws IOException{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("view/AddNewEmployee.fxml"));
		BorderPane addEmployee = loader.load();
		
		Stage addDialogStage = new Stage();
		addDialogStage.setTitle("Add new Employee");
		addDialogStage.initModality(Modality.WINDOW_MODAL);
		addDialogStage.initOwner(primaryStage);
		Scene scene = new Scene(addEmployee);
		addDialogStage.setScene(scene);
		addDialogStage.showAndWait();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
