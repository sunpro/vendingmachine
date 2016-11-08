package com.sunpro.main;

import com.sunpro.vendm.Goods;
import com.sunpro.vendm.VendMachine;

public class Test{
	public static void main(String[] args){
		VendMachine vm = new VendMachine(5,100,20);
		Goods cola = new Goods("cola",3,10);
		Goods juice = new Goods("juice",3,10);
		Goods water = new Goods("water",1,10);
		vm.addGoods(cola);
		vm.addGoods(juice);
		vm.addGoods(water);
		System.out.print(vm.toString());
		Goods colas = new Goods("cola",3,1);
		vm.sellGoods(colas);
		System.out.print(vm.toString());
	}
}