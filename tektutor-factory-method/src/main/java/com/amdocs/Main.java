package com.amdocs;

public class Main {

	public static void main(String[] args) {
		iMobile mobile = MobileFactory.getMobile("OnePlus6");
		mobile.call();
	}
}
