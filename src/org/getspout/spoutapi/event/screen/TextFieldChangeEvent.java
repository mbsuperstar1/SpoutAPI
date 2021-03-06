package org.getspout.spoutapi.event.screen;

import org.getspout.spoutapi.gui.Screen;
import org.getspout.spoutapi.gui.ScreenType;
import org.getspout.spoutapi.gui.TextField;
import org.getspout.spoutapi.player.SpoutPlayer;

public class TextFieldChangeEvent extends ScreenEvent{
	private static final long serialVersionUID = -287243193163686657L;
	protected TextField field;
	protected String oldVal;
	protected String newVal;
	public TextFieldChangeEvent(SpoutPlayer player, Screen screen, TextField field, String newVal) {
		super("TextFieldChangeEvent", player, screen, ScreenType.CUSTOM_SCREEN);
		this.field = field;
		this.oldVal = field.getText();
		this.newVal = newVal;
	}
	
	public TextField getTextField() {
		return field;
	}
	
	public String getOldText() {
		return oldVal;
	}
	
	public String getNewText() {
		return newVal;
	}
	
	public void setNewText(String newVal) {
		if (newVal == null) newVal = "";
		this.newVal = newVal;
	}

}
