package com.sunpro.vendm;

class Cash{
	/*
	 *总金额 total money
	 */
	private int totalAmt;
	/*
	 *硬币金额（用于找零）
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
		
		return "总金额=" + totalAmt + "，硬币金额=" + coinAmt;
	}
}