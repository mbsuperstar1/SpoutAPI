package org.getspout.spoutapi.gui;

import java.util.UUID;

public class BubbleBar extends GenericWidget implements Widget{
	public BubbleBar() {
		setDirty(false);
	}
	
	@Override
	public WidgetType getType() {
		return WidgetType.BubbleBar;
	}
	
	public UUID getId() {
		return new UUID(0, 1);
	}
	
	public void render() {
		//TODO send update packet?
	}
}
