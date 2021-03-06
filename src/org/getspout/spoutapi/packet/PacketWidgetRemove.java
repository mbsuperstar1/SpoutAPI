package org.getspout.spoutapi.packet;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.UUID;

import org.getspout.spoutapi.gui.Widget;
import org.getspout.spoutapi.gui.WidgetType;

public class PacketWidgetRemove implements SpoutPacket {
	protected Widget widget;
	protected UUID screen;
	public PacketWidgetRemove() {

	}
	
	public PacketWidgetRemove(Widget widget, UUID screen) {
		this.widget = widget;
		this.screen = screen;
	}

	@Override
	public int getNumBytes() {
		return (widget != null ? widget.getNumBytes() : 0) + 20;
	}

	@Override
	public void readData(DataInputStream input) throws IOException {
		int id = input.readInt();
		long msb = input.readLong();
		long lsb = input.readLong();
		screen = new UUID(msb, lsb);
		WidgetType widgetType = WidgetType.getWidgetFromId(id);
		if (widgetType != null) {
			try {
				widget = widgetType.getWidgetClass().newInstance();
				widget.readData(input);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public void writeData(DataOutputStream output) throws IOException {
		output.writeInt(widget.getType().getId());
		output.writeLong(screen.getMostSignificantBits());
		output.writeLong(screen.getLeastSignificantBits());
		widget.writeData(output);
	}

	@Override
	public void run(int PlayerId) {
		
	}

	@Override
	public void failure(int id) {
		
	}

	@Override
	public PacketType getPacketType() {
		return PacketType.PacketWidgetRemove;
	}
	
	@Override
	public int getVersion() {
		return 0;
	}

}
