package driverScripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import methods.OrgLib;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Keyword {

	public static void main(String[] args) throws IOException 
	{
		OrgLib o=new OrgLib();
		String res=null;
		String xlpath="F:\\SulocahanaRecordings\\Workspace\\Seleniumproject\\src\\testdata\\Keyword.xlsx";
		
		String xlout="F:\\SulocahanaRecordings\\Workspace\\Seleniumproject\\src\\results\\keyres.xlsx";
		FileInputStream fi=new FileInputStream(xlpath);
		
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("Testcase");
		XSSFSheet ws1=wb.getSheet("Teststeps");
		XSSFSheet ws2=wb.getSheet("TestData");
		
		int TcRc=ws.getLastRowNum();
		int TsRc=ws1.getLastRowNum();
		
		for (int i = 1; i <= TcRc; i++)
		{
			ws.getRow(i).createCell(3);
			String exe=ws.getRow(i).getCell(2).getStringCellValue();
			if (exe.equalsIgnoreCase("Y"))
			{
				String TcTcId=ws.getRow(i).getCell(0).getStringCellValue();
				
				for (int j = 1; j <= TsRc; j++) 
				{
					String TsTcId=ws1.getRow(j).getCell(0).getStringCellValue();
					if (TcTcId.equalsIgnoreCase(TsTcId)) 
					{
						String keyword=ws1.getRow(j).getCell(3).getStringCellValue();
						
						switch (keyword) 
						{
						case "Launch":
							String url=ws2.getRow(1).getCell(0).getStringCellValue();
							res=o.OrgLaunch(url);
							break;
						case "login":
							String u=ws2.getRow(1).getCell(1).getStringCellValue();
							String p=ws2.getRow(1).getCell(2).getStringCellValue();
							res=o.OrgLogin(u, p);
							break;
						case "logout":
							res=o.OrgLogout();
							o.OrgClose();
							break;
						case "Empreg":	
							String f=ws2.getRow(1).getCell(3).getStringCellValue();
							String l=ws2.getRow(1).getCell(4).getStringCellValue();
							String Eid=ws2.getRow(1).getCell(5).getStringCellValue();
							res=o.OrgEmpReg(f, l, Eid);
							break;
						case "Usereg":
							String ename=ws2.getRow(1).getCell(6).getStringCellValue();
							String uname=ws2.getRow(1).getCell(7).getStringCellValue();
							String pswd=ws2.getRow(1).getCell(8).getStringCellValue();
							String cpswd=ws2.getRow(1).getCell(9).getStringCellValue();
							res=o.OrgUserReg(ename, uname, pswd, cpswd);
							break;
						case "Ulogin":
							String un=ws2.getRow(1).getCell(7).getStringCellValue();
							String cp=ws2.getRow(1).getCell(8).getStringCellValue();
							res=o.OrgLogin(un, cp);
							break;
						default:
							System.out.println("Select a proper keyword");
							break;
						}
						
						ws1.getRow(j).createCell(4).setCellValue(res);
						
						if (!ws.getRow(i).getCell(3).getStringCellValue().equalsIgnoreCase("Fail")) 
						{
							ws.getRow(i).getCell(3).setCellValue(res);
						}
						
					}
				}
			}
			else
			{
				ws.getRow(i).createCell(3).setCellValue("BLOCKED");
			}
			
		}
		FileOutputStream fo=new FileOutputStream(xlout);
		wb.write(fo);
		wb.close();	
	}

}
