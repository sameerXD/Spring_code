package com.ncu.DI;

public class BaseBall implements Coach{
	IFortune fortune;
	public BaseBall(IFortune ifortune) {
		System.out.println(ifortune.getFortune());
	}
	public String getDaily() {
		  return "this is b.b coach";
	  }
	
	
}
