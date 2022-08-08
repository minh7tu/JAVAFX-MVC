package ntmController;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DiaChiNhanHangController{
	private Stage stage ;
	private Scene scene;
	private Parent root ;
	
	@FXML
	public void onClickExit(ActionEvent event) {
		showThanhToanGUI(event);
	}
	
	@FXML
	public void onClickUpdate(ActionEvent event) {
		showDiaChiMoiGUI(event);
	}
	
	@FXML
	public void onClickAddAddress(ActionEvent event) {
		showDiaChiMoiGUI(event);
	}
	
	public void showDiaChiMoiGUI(ActionEvent event) {
		try {
			root = FXMLLoader.load(getClass().getResource("DiaChiMoi.fxml"));
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			scene.getStylesheets().add(getClass().getResource("ntm.css").toExternalForm());
			stage.setTitle("Địa chỉ mới");
			stage.show();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void showThanhToanGUI(ActionEvent event) {
		try {
			root = FXMLLoader.load(getClass().getResource("ThanhToan.fxml"));
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			scene.getStylesheets().add(getClass().getResource("ntm.css").toExternalForm());
			stage.setTitle("Thanh Toán");
			stage.show();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
