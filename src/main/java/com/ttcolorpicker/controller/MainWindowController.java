package com.ttcolorpicker.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

import com.ttcolorpicker.data.PaletteEntry;
import com.ttcolorpicker.data.PaletteEntryController;

public class MainWindowController {

	Pane[] Chips = new Pane[16];
	PaletteEntryController PEController = new PaletteEntryController();

	// http://stackoverflow.com/questions/30210170/is-fxml-needed-for-every-declaration
	@FXML
	private ComboBox<PaletteEntry> cbSelectPalette;
	private ObservableList<PaletteEntry> comboBoxData = FXCollections.observableArrayList();

	@FXML
	private Button btnPalettesNew;
	@FXML
	private Button btnPalettesEdit;
	@FXML
	private Button btnPalettesDelete;
	@FXML
	private Button btnPalettesRecreate;
	@FXML
	private Pane btnChip0;
	@FXML
	private Pane btnChip1;
	@FXML
	private Pane btnChip2;
	@FXML
	private Pane btnChip3;
	@FXML
	private Pane btnChip4;
	@FXML
	private Pane btnChip5;
	@FXML
	private Pane btnChip6;
	@FXML
	private Pane btnChip7;
	@FXML
	private Pane btnChip8;
	@FXML
	private Pane btnChip9;
	@FXML
	private Pane btnChip10;
	@FXML
	private Pane btnChip11;
	@FXML
	private Pane btnChip12;
	@FXML
	private Pane btnChip13;
	@FXML
	private Pane btnChip14;
	@FXML
	private Pane btnChip15;
	@FXML
	private Pane pnColor;
	@FXML
	private TextField edDecColorValue;
	@FXML
	private TextField edHexColorValue;
	/////////////////////////////////////////////////

	public MainWindowController() {
		PEController.Recreate();
	}

	// ---------------------------------------------------------------------------
	@FXML
	void initialize() {

		Chips[0] = btnChip0;
		Chips[1] = btnChip1;
		Chips[2] = btnChip2;
		Chips[3] = btnChip3;
		Chips[4] = btnChip4;
		Chips[5] = btnChip5;
		Chips[6] = btnChip6;
		Chips[7] = btnChip7;
		Chips[8] = btnChip8;
		Chips[9] = btnChip9;
		Chips[10] = btnChip10;
		Chips[11] = btnChip11;
		Chips[12] = btnChip12;
		Chips[13] = btnChip13;
		Chips[14] = btnChip14;
		Chips[15] = btnChip15;

		for (int i = 0; i < 16; i++) {
			Chips[i].setUserData(i);
		}

		setData();
	}

	// ---------------------------------------------------------------------------
	@FXML
	private void handlecbSelectPaletteAction() {
		FillChips();
	}

	// ---------------------------------------------------------------------------
	@FXML
	private void onbtnChipMouseClicked(MouseEvent event) {
		PaletteEntry selectedPalette = cbSelectPalette.getSelectionModel().getSelectedItem();
		if (event.getSource() instanceof Pane) {
			Pane btn = (Pane) event.getSource();
			int idx = (int) btn.getUserData();

			if (selectedPalette.Colors[idx] != Color.TRANSPARENT) {
				pnColor.setStyle("-fx-background-color: #" + toRGBCode(selectedPalette.Colors[idx]));
				edDecColorValue.setText( Integer.toUnsignedString( to24bitHashCode( selectedPalette.Colors[idx] ) ) );
				edHexColorValue.setText(toRGBCode(selectedPalette.Colors[idx]));
			}
		}
	}

	// ---------------------------------------------------------------------------
	public void setData() {
		for (PaletteEntry pe : PEController.Palettes) {
			comboBoxData.add(pe);
		}
		cbSelectPalette.setItems(comboBoxData);
		if (PEController.Palettes.size() > 0)
			cbSelectPalette.getSelectionModel().select(0);
		FillChips();
	}

	// ---------------------------------------------------------------------------
	// http://stackoverflow.com/questions/17925318/how-to-get-hex-web-string-from-javafx-colorpicker-color
	private static String toRGBCode(Color color) {
		return String.format("%02X%02X%02X", (int) (color.getRed() * 255), (int) (color.getGreen() * 255),
				(int) (color.getBlue() * 255));
	}
	// ---------------------------------------------------------------------------
	private static int to24bitHashCode(Color color) {
        int r = (int) Math.round(color.getRed() * 255.0);
        int g = (int) Math.round(color.getGreen() * 255.0);
        int b = (int) Math.round(color.getBlue() * 255.0);
       
        int i = b;
        i = i << 8;
        i = i | g;
        i = i << 8;
        i = i | r;
        return i;
    }	
	
	// ---------------------------------------------------------------------------
	private void FillChips() {
		PaletteEntry selectedPalette = cbSelectPalette.getSelectionModel().getSelectedItem();
		for (int i = 0; i < 16; i++) {
			if (selectedPalette.Colors[i] != Color.TRANSPARENT) {
				Chips[i].setStyle("-fx-background-color: #" + toRGBCode(selectedPalette.Colors[i]));
			} else {
				Chips[i].setStyle("");
			}
		}
	}
	// ---------------------------------------------------------------------------
}
