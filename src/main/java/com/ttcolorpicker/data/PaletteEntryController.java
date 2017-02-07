package com.ttcolorpicker.data;

import java.util.ArrayList;
import java.util.List;
import javafx.scene.paint.Color;
import com.ttcolorpicker.data.PaletteEntry;

public class PaletteEntryController {

	public List<PaletteEntry> Palettes = new ArrayList< PaletteEntry >();
	
	public void Recreate() {

		Palettes.clear();
		//TODO fill it in loops
		//TODO oughta find more elegant way 'coz it suxx 
		PaletteEntry item = new PaletteEntry();
		item.Name = "Basic Colors";
		item.ClearColors();
		item.Colors[0] = Color.web("1D3237");
		item.Colors[1] = Color.web("FFFF00");
		item.Colors[2] = Color.web("00FF00");
		item.Colors[3] = Color.web("00FFFF");
		item.Colors[4] = Color.web("0000FF");
		item.Colors[5] = Color.web("FF00FF");
		item.Colors[6] = Color.web("FFFFFF");
		item.Colors[7] = Color.web("000000");			
		Palettes.add(item);
		
		item = new PaletteEntry();
		item.Name = "Greyscale";
		item.Colors[0] =  Color.web("000000");
		item.Colors[1] =  Color.web("333333");
		item.Colors[2] =  Color.web("505050");
		item.Colors[3] =  Color.web("666666");
		item.Colors[4] =  Color.web("7B7B7B");
		item.Colors[5] =  Color.web("898989");
		item.Colors[6] =  Color.web("999999");
		item.Colors[7] =  Color.web("ABABAB");	
		item.Colors[8] =  Color.web("B4B4B4");
		item.Colors[9] =  Color.web("BCBCBC");
		item.Colors[10] = Color.web("CCCCCC");
		item.Colors[11] = Color.web("DCDCDC");
		item.Colors[12] = Color.web("E3E3E3");
		item.Colors[13] = Color.web("EBEBEB");
		item.Colors[14] = Color.web("F4F4F4");
		item.Colors[15] = Color.web("FFFFFF");		
		Palettes.add(item);
		
		item = new PaletteEntry();
		item.Name = "Red WebSafe Shades";
		item.Colors[0] =  Color.web("FFFFFF");
		item.Colors[1] =  Color.web("FFCCCC");
		item.Colors[2] =  Color.web("FF9999");
		item.Colors[3] =  Color.web("FF6666");
		item.Colors[4] =  Color.web("FF3333");
		item.Colors[5] =  Color.web("FF0000");
		item.Colors[6] =  Color.web("CC9999");
		item.Colors[7] =  Color.web("CC6666");	
		item.Colors[8] =  Color.web("CC3333");
		item.Colors[9] =  Color.web("CC0000");
		item.Colors[10] = Color.web("996666");
		item.Colors[11] = Color.web("993333");
		item.Colors[12] = Color.web("990000");
		item.Colors[13] = Color.web("663333");
		item.Colors[14] = Color.web("660000");
		item.Colors[15] = Color.web("330000");				
		Palettes.add(item);
		
		item = new PaletteEntry();
		item.Name = "Yellow WebSafe Shades";
		item.Colors[0] =  Color.web("FFFFFF");
		item.Colors[1] =  Color.web("FFFFCC");
		item.Colors[2] =  Color.web("FFFF99");
		item.Colors[3] =  Color.web("FFFF66");
		item.Colors[4] =  Color.web("FFFF33");
		item.Colors[5] =  Color.web("FFFF00");
		item.Colors[6] =  Color.web("CCCC99");
		item.Colors[7] =  Color.web("CCCC66");	
		item.Colors[8] =  Color.web("CCCC33");
		item.Colors[9] =  Color.web("CCCC00");
		item.Colors[10] = Color.web("999966");
		item.Colors[11] = Color.web("999933");
		item.Colors[12] = Color.web("999900");
		item.Colors[13] = Color.web("666633");
		item.Colors[14] = Color.web("666600");
		item.Colors[15] = Color.web("333300");			
		Palettes.add(item);
		
		item = new PaletteEntry();
		item.Name = "Green WebSafe Shades";
		item.Colors[0] =  Color.web("FFFFFF");
		item.Colors[1] =  Color.web("CCFFCC");
		item.Colors[2] =  Color.web("99FF99");
		item.Colors[3] =  Color.web("66FF66");
		item.Colors[4] =  Color.web("33FF33");
		item.Colors[5] =  Color.web("00FF00");
		item.Colors[6] =  Color.web("99CC99");
		item.Colors[7] =  Color.web("66CC66");	
		item.Colors[8] =  Color.web("33CC33");
		item.Colors[9] =  Color.web("00CC00");
		item.Colors[10] = Color.web("669966");
		item.Colors[11] = Color.web("339933");
		item.Colors[12] = Color.web("009900");
		item.Colors[13] = Color.web("336633");
		item.Colors[14] = Color.web("006600");
		item.Colors[15] = Color.web("003300");				
		Palettes.add(item);
		
		item = new PaletteEntry();
		item.Name = "Cyan WebSafe Shades";
		item.Colors[0] =  Color.web("FFFFFF");
		item.Colors[1] =  Color.web("CCFFFF");
		item.Colors[2] =  Color.web("99FFFF");
		item.Colors[3] =  Color.web("66FFFF");
		item.Colors[4] =  Color.web("33FFFF");
		item.Colors[5] =  Color.web("00FFFF");
		item.Colors[6] =  Color.web("99CCCC");
		item.Colors[7] =  Color.web("66CCCC");	
		item.Colors[8] =  Color.web("33CCCC");
		item.Colors[9] =  Color.web("00CCCC");
		item.Colors[10] = Color.web("669999");
		item.Colors[11] = Color.web("339999");
		item.Colors[12] = Color.web("009999");
		item.Colors[13] = Color.web("336666");
		item.Colors[14] = Color.web("006666");
		item.Colors[15] = Color.web("003333");			
		Palettes.add(item);
		
		item = new PaletteEntry();
		item.Name = "Blue WebSafe Shades";
		item.Colors[0] =  Color.web("FFFFFF");
		item.Colors[1] =  Color.web("CCCCFF");
		item.Colors[2] =  Color.web("9999FF");
		item.Colors[3] =  Color.web("6666FF");
		item.Colors[4] =  Color.web("3333FF");
		item.Colors[5] =  Color.web("0000FF");
		item.Colors[6] =  Color.web("9999CC");
		item.Colors[7] =  Color.web("6666CC");	
		item.Colors[8] =  Color.web("3333CC");
		item.Colors[9] =  Color.web("0000CC");
		item.Colors[10] = Color.web("666699");
		item.Colors[11] = Color.web("333399");
		item.Colors[12] = Color.web("000099");
		item.Colors[13] = Color.web("333366");
		item.Colors[14] = Color.web("000066");
		item.Colors[15] = Color.web("000033");			
		Palettes.add(item);
		
		item = new PaletteEntry();
		item.Name = "Magenta WebSafe Shades";
		item.Colors[0] =  Color.web("FFFFFF");
		item.Colors[1] =  Color.web("FFCCFF");
		item.Colors[2] =  Color.web("FF99FF");
		item.Colors[3] =  Color.web("FF66FF");
		item.Colors[4] =  Color.web("FF33FF");
		item.Colors[5] =  Color.web("FF00FF");
		item.Colors[6] =  Color.web("CC99CC");
		item.Colors[7] =  Color.web("CC66CC");	
		item.Colors[8] =  Color.web("CC33CC");
		item.Colors[9] =  Color.web("CC00CC");
		item.Colors[10] = Color.web("996699");
		item.Colors[11] = Color.web("993399");
		item.Colors[12] = Color.web("990099");
		item.Colors[13] = Color.web("663366");
		item.Colors[14] = Color.web("660066");
		item.Colors[15] = Color.web("330033");			
		Palettes.add(item);		
		
	}
}
