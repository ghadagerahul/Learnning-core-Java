package com.spring.app.designpatterns.prototype.shallowcloning;

public class MainClass {

	public static void main(String[] args) {

		ProductClass prodClass = new ProductClass();
		prodClass.setIpAddress("10.10.10.3.6");
		prodClass.loadImpDate();
		prodClass.getIteamsList().add("bucket");
		prodClass.getIteamsList().add("TFS");
		prodClass.getIteamsList().add("JIRA");
		System.out.println("prodClass: " + prodClass);

		try {
			ProductClass prodCls2 = (ProductClass) prodClass.clone();
			// if we remove one data then it is impacting on property of next all objects
			prodCls2.getIteamsList().remove(0);
			prodCls2.getIteamsList().remove(0);
			System.out.println("prodCls2: " + prodCls2);

			ProductClass prodCls3 = (ProductClass) prodClass.clone();
			System.out.println("prodCls3: " + prodCls3);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
