package Bai1;

public class HinhChuNhat {
	public int x;
	public int y;
	
	public HinhChuNhat(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int tinhS() {
		return this.x*this.y;
	}
}
