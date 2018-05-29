package methods;

import java.io.IOException;

public class TestSuiteEg {

	public static void main(String[] args) throws IOException 
	{
		OrgLib ol=new OrgLib();
		
		String res=ol.OrgLaunch("http://opensource.demo.orangehrmlive.com");
		System.out.println("Application Launch "+res);
		
		res=ol.OrgLogin("Admin", "admin");
		System.out.println("Application Login "+res);
		
		res=ol.OrgLogout();
		System.out.println("Application Logout "+res);
		
		ol.OrgClose();
		System.out.println("Close Successfull");
		
		//Empreg
		res=ol.OrgLaunch("http://opensource.demo.orangehrmlive.com");
		System.out.println("Application Launch "+res);
		
		res=ol.OrgLogin("Admin", "admin");
		System.out.println("Application Login "+res);
		
		res=ol.OrgEmpReg("Jithender", "Neela", "J1234");
		System.out.println("Employee Registration "+res);
		
		res=ol.OrgLogout();
		System.out.println("Application Logout "+res);
		
		ol.OrgClose();
		System.out.println("Close Successfull");
		
		//Userreg
		res=ol.OrgLaunch("http://opensource.demo.orangehrmlive.com");
		System.out.println("Application Launch "+res);
		
		res=ol.OrgLogin("Admin", "admin");
		System.out.println("Application Login "+res);
		
		res=ol.OrgUserReg("Jithender Neela", "JithenderNeela123", "JithenderNeela123", "JithenderNeela123");
		System.out.println("User Registration "+res);
		
		res=ol.OrgLogout();
		System.out.println("Application Logout "+res);
		
		ol.OrgClose();
		System.out.println("Close Successfull");
		
		//UserLogin
		res=ol.OrgLaunch("http://opensource.demo.orangehrmlive.com");
		System.out.println("Application Launch "+res);
		
		res=ol.OrgLogin("JithenderNeela123", "JithenderNeela123");
		System.out.println("Application Login "+res);
		
		res=ol.OrgLogout();
		System.out.println("Application Logout "+res);
		
		ol.OrgClose();
		System.out.println("Close Successfull");

	}

}
