package com.ncu;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//    Iworker sw = new SmartWorker();
//    Iworker lz = new LazyWorker();
//    Manager mn = new Manager(sw);
//    mn.ManagerWork();
  
		Iworker sw  = Factory.getObject();
		  Manager mn1 = new Manager(sw);
		    mn1.ManagerWork();
	}

}
