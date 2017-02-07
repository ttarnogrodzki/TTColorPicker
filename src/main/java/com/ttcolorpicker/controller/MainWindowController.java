package com.ttcolorpicker.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.paint.Color;

import com.ttcolorpicker.data.PaletteEntry;
import com.ttcolorpicker.data.PaletteEntryController;

public class MainWindowController {

	Button[] Chips = new Button[16];
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
	private Button btnChip0;
	@FXML
	private Button btnChip1;
	@FXML
	private Button btnChip2;
	@FXML
	private Button btnChip3;
	@FXML
	private Button btnChip4;
	@FXML
	private Button btnChip5;
	@FXML
	private Button btnChip6;
	@FXML
	private Button btnChip7;
	@FXML
	private Button btnChip8;
	@FXML
	private Button btnChip9;
	@FXML
	private Button btnChip10;
	@FXML
	private Button btnChip11;
	@FXML
	private Button btnChip12;
	@FXML
	private Button btnChip13;
	@FXML
	private Button btnChip14;
	@FXML
	private Button btnChip15;
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

		setData();
	}

	// ---------------------------------------------------------------------------
	@FXML
	private void handlecbSelectPaletteAction() {
		FillChips();
	}

	// ---------------------------------------------------------------------------
	public void setData() {

		/*
		 * cbSelectPalette.getItems().clear(); for (PaletteEntry pe :
		 * PEController.Palettes) { cbSelectPalette.getItems().add( pe ); }
		 */

		for (PaletteEntry pe : PEController.Palettes) {
			comboBoxData.add(pe);
		}
		cbSelectPalette.setItems(comboBoxData);
		if (PEController.Palettes.size() > 0)
			cbSelectPalette.getSelectionModel().select(0);
		FillChips();
	}

	// ---------------------------------------------------------------------------
	private void FillChips() {
		PaletteEntry selectedPalette = cbSelectPalette.getSelectionModel().getSelectedItem();
		for (int i = 0; i < 16; i++) {
			if ( selectedPalette.Colors[i] != Color.TRANSPARENT)
				{ 
				Chips[i].setStyle("-fx-background-color: #" + Integer.toHexString( selectedPalette.Colors[i].hashCode() ));				
				}
				else
					{					
					Chips[i].setStyle("");					
					}
					
		}
	}
	// ---------------------------------------------------------------------------
}
