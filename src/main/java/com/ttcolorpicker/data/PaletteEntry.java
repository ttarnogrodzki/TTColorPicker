package com.ttcolorpicker.data;

import javafx.scene.paint.Color;

public class PaletteEntry {

	public String 	Name;
	public Color[] 	Colors = new Color[16];
	
	public void ClearColors() {
		for (int i = 0; i < Colors.length; i++)
			Colors[i] = Color.TRANSPARENT;		
	}
	
}
