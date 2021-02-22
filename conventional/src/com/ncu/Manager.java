package com.ncu;

public class Manager {
//   SmartWorker sw;
//   LazyWorker lz;
	Iworker worker;
   
   public Manager(Iworker worker) {
//	   this.sw= sw;
//	   this.lz = lz;
	   this.worker = worker;
   }
   public void ManagerWork() {
	   
	   worker.work();
   }
}
