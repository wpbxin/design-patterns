package com.designpatterns.creationalpatterns.prototype;
/**
 * 
 * @author WPB
 *
 */
public class Title implements Cloneable{
	private String pre;
	private String title;
	//Constructor with no arguments
	public Title(){
		
	}
	//Constructor with all arguments
	public Title(String pre, String title) {
		super();
		this.pre = pre;
		this.title = title;
	}
	public String getPre() {
		return pre;
	}
	public void setPre(String pre) {
		this.pre = pre;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public Title clone() throws CloneNotSupportedException {
		Title title = (Title)super.clone();
		title.setPre(new String(this.getPre()));
		title.setTitle(new String(this.getTitle()));
		return title;
	}
}
