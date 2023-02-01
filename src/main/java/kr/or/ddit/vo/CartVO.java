package kr.or.ddit.vo;

public class CartVO {
	private int  cart_no;
	private int  cart_total;
	private int  cart_status;
	private String  cart_date;
	private String  mem_id;
	private int  pay_no;
	public int getCart_no() {
		return cart_no;
	}
	public void setCart_no(int cart_no) {
		this.cart_no = cart_no;
	}
	public int getCart_total() {
		return cart_total;
	}
	public void setCart_total(int cart_total) {
		this.cart_total = cart_total;
	}
	public int getCart_status() {
		return cart_status;
	}
	public void setCart_status(int cart_status) {
		this.cart_status = cart_status;
	}
	public String getCart_date() {
		return cart_date;
	}
	public void setCart_date(String cart_date) {
		this.cart_date = cart_date;
	}
	public String getMem_id() {
		return mem_id;
	}
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
	public int getPay_no() {
		return pay_no;
	}
	public void setPay_no(int pay_no) {
		this.pay_no = pay_no;
	}
	
	
}
