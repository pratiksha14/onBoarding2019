package com.amdocs;

public class MobileFactory {
	
	public static iMobile getMobile(String mobileName) {
			iMobile mobile = null;
			
			if(mobileName.equals("iPhone"))
					mobile = new iPhone();
			else if(mobileName.equals("iPhone5"))
				mobile = new iPhone5();
			else if(mobileName.equals("OnePlus5"))
				mobile = new OnePlus5();
			else
				mobile = new NullMobile();
			
			return mobile;
	}	
}
