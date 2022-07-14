package Day9_accessModifier;

import Day8_static.ProtectedClass;

public class ProtectedAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProtectedClass p=new ProtectedClass();
		
		p.ProtectCls();
		//p.b; //as b is protect it wont be available here

	}
	
	

}
