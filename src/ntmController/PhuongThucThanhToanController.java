package ntmController;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class PhuongThucThanhToanController {
	@FXML
	public void onClickExit(ActionEvent event) {
		DiaChiNhanHangController dc = new DiaChiNhanHangController();
		dc.showThanhToanGUI(event);
	}
	
	@FXML
	public void onClickAgree(ActionEvent event) {
		
	}

}
