package com.ttcolorpicker.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;

import com.ttcolorpicker.data.PaletteEntryController;

public class MainWindowController {

	PaletteEntryController PEController = new PaletteEntryController();
	
	//  http://stackoverflow.com/questions/30210170/is-fxml-needed-for-every-declaration
	@FXML
	private ComboBox cbSelectPalette;
	@FXML
	private Button btnPalettesNew;
	@FXML
	private Button btnPalettesEdit;
	@FXML
	private Button btnPalettesDelete;
	@FXML
	private Button btnPalettesRecreate;	
	
	public MainWindowController(){
		System.out.println("controller");
		PEController.Recreate();	
		
	}
	
}
