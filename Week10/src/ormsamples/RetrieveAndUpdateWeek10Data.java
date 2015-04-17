/**
 * Licensee: Institute of Technology Tallaght
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateWeek10Data {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = ormtest.Week10PersistentManager.instance().getSession().beginTransaction();
		try {
			ormtest.Employee lormtestEmployee = ormtest.Employee.loadEmployeeByQuery(null, null);
			// Update the properties of the persistent object
			lormtestEmployee.save();
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Employee by EmployeeCriteria");
		ormtest.EmployeeCriteria lormtestEmployeeCriteria = new ormtest.EmployeeCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormtestEmployeeCriteria.id.eq();
		System.out.println(lormtestEmployeeCriteria.uniqueEmployee());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateWeek10Data retrieveAndUpdateWeek10Data = new RetrieveAndUpdateWeek10Data();
			try {
				retrieveAndUpdateWeek10Data.retrieveAndUpdateTestData();
				//retrieveAndUpdateWeek10Data.retrieveByCriteria();
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
