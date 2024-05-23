package vtiger.commonpage;

import webutil.WebUtils;

public class test {
public static void main(String[] args) {
	test t=new test();
	t.m1();
}
	public void m1() {
		WebUtils wt=new WebUtils();
		wt.launchBrowser("http://localhost:8888/");
		CommonPage cp=new CommonPage(wt);
		cp.sendValueInusername("admin");
		cp.sendValueInpassword("admin");
		cp.clickOnLogin();
	}
	
}
