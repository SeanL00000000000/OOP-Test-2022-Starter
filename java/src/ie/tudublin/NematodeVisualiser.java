package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class NematodeVisualiser extends PApplet
{

	public void keyPressed()
	{		
		if (keyCode == LEFT)
		{
		}		
	}


	public void settings()
	{
		size(800, 800);
	}

	public void setup() 
	{
		colorMode(HSB);
		background(0);
		smooth();				
	}
	

	public void loadNematodes(Object Table)
	{
		Table=loadTable("nematodes.csv", "header");
		for (TableRow r:((processing.data.Table) Table).rows())
		{
			Nematode N= new Nematode(r);
			Nematode.add(N);

		}
	}


	public void draw()
	{	
	}
}
