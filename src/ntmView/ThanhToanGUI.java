package ntmView;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ThanhToanGUI extends Application{
	@Override
	public void start(Stage stage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("ThanhToan.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("ntm.css").toExternalForm());
			stage.setScene(scene);
			stage.setTitle("Thanh toán");
			stage.show();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
		
	public static void main(String[] args) {
		launch(args);
	}
}
