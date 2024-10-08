package vn.iostart.models;

import java.io.Serializable;

public class UserModel implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7877533527375536633L;
	private int id;
	private String username;
	private String password;
	private String images;
	private String fullname;
	
	
	public UserModel(int id, String username, String password, String images, String fullname) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.images = images;
		this.fullname = fullname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getImages() {
		return images;
	}
	public void setImages(String images) {
		this.images = images;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
}
