package ntmController;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class ShopeeVourcherController {
	@FXML
	private Button btnExit , btnApply , btnDelete , btnQuestion ;
	@FXML
	private TextField textCodeVourcher ;
	@FXML
	private TextArea textMsg ;
	
	@FXML
	public void onClickExit(ActionEvent event) {
		
	}
	
	@FXML
	public void onClickApply(ActionEvent event) {
		
	}
	
	@FXML
	public void onClickDelete() {
		resetTextCodeVoucher();
	}

	@FXML
	public void onClickQuestion() {
		question();
	}
	
	public void resetTextCodeVoucher() {
		textCodeVourcher.setText(" ");
	}
	
	public void question() {
		System.out.println("Khong co thong bao :");
	}
	
}
