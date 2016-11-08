package com.sunpro.vendm;
public class Goods{
	private String name;
	private int price;
	private int num;
	private int amount;
	public Goods(){
		this.name = null;
		this.price = 0;
		this.num = 0;
		this.setAmount(0);
	}
	public Goods(String name,int price,int Num){
		this.name = name;
		this.price = price;
		this.num = Num;
		this.setAmount(this.price * this.num);
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void setPrice(int price){
		this.price = price;
	}
	public int getPrice(){
		return this.price;
	}
	public void setNum(int Num){
		this.num = Num;
	}
	public int getNum(){
		return this.num;
	}
	
	public Boolean add(Goods g){
		if(this.name == null){
			this.name = g.getName();
			this.num = g.getNum();
			this.price = g.getPrice();
			return true;
		}else if(g.getName().equals(this.name)){
			num += g.getNum();
			return true;
		}else{
			return false;
		}
	}
	public Boolean sell(Goods g){
		if(this.equals(g)){
			this.num -= g.getNum();
			return true;
		}else
			return false;
	}
	public Boolean equals(Goods g){
		if(this.name.equals(g.getName()) && this.price == g.getPrice()){
			return true;
		}else
			return false;
	}
	public Boolean isEmpty(){
		return this.name == null;
	}
	public String toString(){
		String s = this.name + "=" + this.price + "Ôªx" + this.num + "¸ö";
		return s;
	}
	public int getAmount() {
		return this.price * this.num;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}

}
