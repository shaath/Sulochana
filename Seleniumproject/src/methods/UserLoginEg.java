package methods;

import java.io.IOException;

public class UserLoginEg {

	public static void main(String[] args) throws IOException
	{
		OrgLib ol=new OrgLib();
		
		String res=ol.OrgLaunch("http://opensource.demo.orangehrmlive.com");
		System.out.println("Application Launch "+res);
		
		res=ol.OrgLogin("VignanKumar1234", "VignanKumar1234");
		System.out.println("Application Login "+res);
		
		res=ol.OrgLogout();
		System.out.println("Application Logout "+res);
		
		ol.OrgClose();
		System.out.println("Close Successfull");

	}

}
