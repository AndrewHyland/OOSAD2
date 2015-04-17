/**
 * Licensee: Institute of Technology Tallaght
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
import java.util.Scanner;

public class CreateWeek10Data {
	public void createTestData() throws PersistentException {
        Scanner sc = new Scanner(System.in);		
        PersistentTransaction t = ormtest.Week10PersistentManager.instance().getSession().beginTransaction();
		try {
			ormtest.Employee lormtestEmployee = ormtest.Employee.createEmployee();
			// Initialize the properties of the persistent object here
			lormtestEmployee.setName("A Hyland");
                        lormtestEmployee.setAddress("123 Fake Street");
                        lormtestEmployee.setPps("123456");
                        lormtestEmployee.setMobile("014445656");
                        int recs = 2;
                      //for(int i = 0; i < recs.length; i++){
                          System.out.println("Please enter your name: ");
                          lormtestEmployee.setName(sc.next());
                          sc.nextLine();
                          System.out.println("Please enter your address: ");
                          lormtestEmployee.setAddress(sc.next());
                          sc.nextLine();
                          System.out.println("Please enter your pps no: ");
                          lormtestEmployee.setPps(sc.next());
                          sc.nextLine();
                          System.out.println("Please enter your mobile no: ");
                          lormtestEmployee.setMobile(sc.next());
                          sc.nextLine();  
                      // }
                        lormtestEmployee.save();
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateWeek10Data createWeek10Data = new CreateWeek10Data();
			try {
				createWeek10Data.createTestData();
			}
			finally {
				ormtest.Week10PersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
