package ntmController;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class PhuongThucVanChuyenController {
	@FXML
	private Button btnExit , btnAgree ;
	@FXML
	private RadioButton rBNowShip , rBGrabExpress ;
	@FXML
	private Label lNowShip , lPriceNS , lGrabExpress , lPriceGE ;
	@FXML
	private ToggleGroup group ;
	
	@FXML
	public void onClickExit(ActionEvent event) {
		
	}
	
	@FXML
	public void onClickAgree(ActionEvent event) {
		
	}
	
	@FXML
	public void onClickTransport() {
		if(group.getSelectedToggle().equals(rBNowShip)) {
			rBNowShip.setSelected(true);
		}
		else
			rBGrabExpress.setSelected(true);
	}
	
}
