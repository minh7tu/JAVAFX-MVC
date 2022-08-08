package ntmController;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;

public class DiaChiMoiController {
	@FXML
	private TextField textFullname , textNumberPhone , textAddress , textOwnAddress ;
	@FXML
	private CheckBox mark ;
	@FXML
	private Button btnExit , btnComplete ;
	@FXML
	private ToggleButton btnOffice , btnHome ;
	@FXML
	private ToggleGroup group ;
	
	@FXML
	public void onClickExit(ActionEvent event) {
		resetMsg();
	}
	
	@FXML
	public void onClickMark() {
		mark.setSelected(true);
		System.out.println("Đã chọn là địa chỉ mặc định");
	}
	
	@FXML
	public void onClickAddress() {
		if(group.getSelectedToggle().equals(btnOffice)) {
			System.out.println("Văn phòng");
		}
		else
			System.out.println("Nhà riêng");
	}
	
	@FXML
	public void onClickComplete(ActionEvent event) {
		
	}
	
	public void resetMsg() {
		textFullname.setText("");
		textAddress.setText("");
		textNumberPhone.setText("");
		textOwnAddress.setText("");
		mark.setSelected(false);
	}
	
}
