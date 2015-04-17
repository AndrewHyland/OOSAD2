/**
 * Licensee: Institute of Technology Tallaght
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteWeek10Data {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = ormtest.Week10PersistentManager.instance().getSession().beginTransaction();
		try {
			ormtest.Employee lormtestEmployee = ormtest.Employee.loadEmployeeByQuery(null, null);
			lormtestEmployee.delete();
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteWeek10Data deleteWeek10Data = new DeleteWeek10Data();
			try {
				deleteWeek10Data.deleteTestData();
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
