package com.sunpro.vendm;

public class VendMachine{
	/*
	 *�Զ��ۻ����п������ŵĻ�������
	 */
	private final int KIND_GOODS;
	/*
	 *ʵ�ʷ���Ļ�������
	 */
	private int countGoods;
	
	private Goods[] goods;
	
	private Cash cash;
	
	public VendMachine(){
		KIND_GOODS = 5;
		countGoods = 0;
		goods = new Goods[KIND_GOODS];
		for(int i = 0; i < KIND_GOODS; i++){
			goods[i] = new Goods();
		}
		cash = new Cash();
	}
	public VendMachine(int kind,int total, int coin){
		KIND_GOODS = kind;
		countGoods = 0;
		goods = new Goods[KIND_GOODS];
		for(int i = 0; i < KIND_GOODS; i++){
			goods[i] = new Goods();
		}
		cash = new Cash(total,coin);
	}
	
	public Boolean addGoods(Goods g){
		if(countGoods < KIND_GOODS - 1){
			return goods[countGoods++].add(g);
		}else{
			return false;
		}
	}
	
	public void addCash(Cash ca){
		this.cash.add(ca);
	}
	
	
	public Boolean sellGoods(Goods g){
		for(int i = 0; i < countGoods; i++){
			if(goods[i].sell(g)){
				this.cash.addTotal(g.getAmount());;
				return true;
			}
		}
		return false;
	}
	public String toString(){
		String s = this.cash.toString();
		for(int i = 0; i < countGoods; i++){
			s += goods[i].toString() + " ";
		}
		return s;
	}
	
}