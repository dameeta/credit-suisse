package exceptionDemos;

import java.io.FileOutputStream;

public class testIpAddressException {

	public static void checkIp(String ipaddress) throws invalidIpAddress
	{
		if(ipaddress != "192.168.2.2")
		{
			throw new invalidIpAddress("Please enter valid ip");
		}
		
		else {
			
			System.out.println("connected..");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			checkIp("192.134.2.5");
		    }
		catch(invalidIpAddress ips)
		{
			
			System.out.println("Exception caught.." + ips);
			
		}
		
		finally {
			
			System.out.println("always print.");
		}
		
		try (
			FileOutputStream st1=new FileOutputStream("d:f1.txt") 
				
			)	
		{
			
			
		}
	catch(Exception e){
		
		
	}
	}
	}


