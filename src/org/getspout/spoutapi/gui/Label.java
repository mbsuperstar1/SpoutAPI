package org.getspout.spoutapi.gui;

public interface Label extends Widget{
	/**
	 * Gets the text of the label
	 * @return text
	 */
	public String getText();
	
	/**
	 * Sets the text of the label
	 * @param text to set
	 * @return label
	 */
	public Label setText(String text);
	
	/**
	 * Gets the color for the text
	 * @return color
	 */
	public Color getTextColor();
	
	/** 
	 * Sets the color for the text
	 * @param color to set
	 * @return label
	 */
	public Label setTextColor(Color color);

	/** 
	 * Get the horizontal, x, alignment of text within it's area
	 * @return alignment enum, ( FIRST | SECOND | THIRD )
	 */
	@Deprecated
	public Align getAlignX();
	
	/** 
	 * Sets the horizontal, x, alignment of text within it's area providing it's on auto
	 * @return label
	 */
	@Deprecated
	public Widget setAlignX(Align pos);
	
	/** 
	 * Get the vertical, y, alignment of text within it's area
	 * @return alignment enum, ( FIRST | SECOND | THIRD )
	 */
	@Deprecated
	public Align getAlignY();
	
	/** 
	 * Sets the vertical, y, alignment of text within it's area providing it's on auto
	 * @return label
	 */
	@Deprecated
	public Widget setAlignY(Align pos);
	
	/** 
	 * Determines if text expands to fill width and height
	 * @param auto
	 * @return label
	 */
	public Label setAuto(boolean auto);
	
	/** 
	 * Gets if the text will expand to fill width and height
	 * @param auto
	 * @return label
	 */
	public boolean getAuto();
	
	public WidgetAnchor getAlign();
	
	public Widget setAlign(WidgetAnchor pos);
}
