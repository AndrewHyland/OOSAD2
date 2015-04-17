/**
 * Licensee: Institute of Technology Tallaght
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateWeek10Data {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = ormtest.Week10PersistentManager.instance().getSession().beginTransaction();
		try {
			ormtest.Employee lormtestEmployee = ormtest.Employee.createEmployee();
			// Initialize the properties of the persistent object here
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
