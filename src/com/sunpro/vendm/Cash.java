package com.sunpro.vendm;

class Cash{
	/*
	 *�ܽ�� total money
	 */
	private int totalAmt;
	/*
	 *Ӳ�ҽ��������㣩
	 */
	private int coinAmt;
	
	public Cash(){
		totalAmt = 100;
		coinAmt = 20;
	}
	public Cash(int total, int coin){
		this.totalAmt = total;
		this.coinAmt = coin;
	}
	public void add(Cash ca){
		this.totalAmt += ca.totalAmt;
		this.coinAmt += ca.coinAmt;
	}
	public void addTotal(int t){
		this.totalAmt += t;
	}
	public String toString(){
		
		return "�ܽ��=" + totalAmt + "��Ӳ�ҽ��=" + coinAmt;
	}
}