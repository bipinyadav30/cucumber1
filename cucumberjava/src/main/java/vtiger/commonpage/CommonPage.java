package vtiger.commonpage;

import vtiger.commonpageselements.CommonPagesElements;
import webutil.WebUtils;

public class CommonPage extends CommonPagesElements{
 WebUtils we;
	public CommonPage(WebUtils we) {
		super(we);
		this.we=we;
		// TODO Auto-generated constructor stub
	}
	
	public void sendValueInusername(String value) {
		we.mySendkeys(getusernameTB(), value);
	}
	
	public void sendValueInpassword(String value) {
		we.mySendkeys(getpasswordTB(), value);
	}
	
	public void clickOnLogin() {
		we.myClick(getloginBT());
	}

}
