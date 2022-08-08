package ntmController;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ThanhToanController {
	@FXML
	private TextField textFullname, textOwnAddress , textAddress , textExpressShip , textXu ;
	@FXML
	private TextField textPrice , textDate , textNowShip , textTotal , textTotalCost , textNumberPhone ;
	@FXML
	private TextArea textNode ;
	
	private Stage stage ;
	private Scene scene ;
	private Parent root ;
	
	
	@FXML
	public void onClickDeliveryAddress(ActionEvent event) {
		showDiaChiNhanHangGUI(event);
	}
	
	@FXML
	public void onClickShip(ActionEvent event) {
		showPhuongThucVanChuyenGUI(event);
	}
	
	@FXML
	public void onClickShopeeVourcher(ActionEvent event) {
		showShopeeVourcherGUI(event);
	}
	
	@FXML
	public void onClickOrder(ActionEvent event) {
		System.out.println("Xong");
	}
	
	@FXML
	public void onClickPay(ActionEvent event) {
		showPhuongThucThanhToanGUI(event);
	}
	
	public void showDiaChiNhanHangGUI(ActionEvent event) {
		try {
			root = FXMLLoader.load(getClass().getResource("DiaChiNhanHang.fxml"));
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("ntm.css").toExternalForm());
			stage.setScene(scene);
			stage.setTitle("Địa Chỉ Nhận Hàng");
			stage.show();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void showPhuongThucThanhToanGUI(ActionEvent event) {
		try {
			root = FXMLLoader.load(getClass().getResource("PhuongThucThanhToan.fxml"));
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("ntm.css").toExternalForm());
			stage.setScene(scene);
			stage.setTitle("Phương Thức Thanh Toán");
			stage.show();
		}catch(Exception e) {
			e.printStackTrace();
		}	
	}
	
	public void showPhuongThucVanChuyenGUI(ActionEvent event) {
		try {
			root = FXMLLoader.load(getClass().getResource("PhuongThucVanChuyen.fxml"));
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("ntm.css").toExternalForm());
			stage.setScene(scene);
			stage.setTitle("Phương Thức Vận Chuyển");
			stage.show();
		}catch(Exception e) {
			e.printStackTrace();
		}	
	}
	
	public void showShopeeVourcherGUI(ActionEvent event) {
		try {
			root = FXMLLoader.load(getClass().getResource("ShopeeVourcher.fxml"));
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("ntm.css").toExternalForm());
			stage.setScene(scene);
			stage.setTitle("Shopee Vourcher");
			stage.show();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
		
}
