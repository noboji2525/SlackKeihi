package com.kousuke.cat;

public class MainControler {

	public static void main(String[] args) {
		System.out.println("hello mame");
		Temp temp = new Temp();
		temp.setName("のぼじいブログ");
		System.out.println(temp.getName());
		System.out.println("以下はif文テスト");
		temp.setControl(true);
		if(temp.isControl()) {
			System.out.println(temp.getName() + "はTrueでした");
		}
	}

}
