/**
 * Licensee: Institute of Technology Tallaght
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateOrmWeek11Data {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = ormweek11.ormtest.OrmWeek11PersistentManager.instance().getSession().beginTransaction();
		try {
			ormweek11.ormtest.Employee lormWeek11ormtestEmployee = ormweek11.ormtest.EmployeeDAO.loadEmployeeByQuery(null, null);
			// Update the properties of the persistent object
			ormweek11.ormtest.EmployeeDAO.save(lormWeek11ormtestEmployee);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Employee by EmployeeCriteria");
		ormweek11.ormtest.EmployeeCriteria lormWeek11ormtestEmployeeCriteria = new ormweek11.ormtest.EmployeeCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormWeek11ormtestEmployeeCriteria.ID.eq();
		System.out.println(lormWeek11ormtestEmployeeCriteria.uniqueEmployee());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateOrmWeek11Data retrieveAndUpdateOrmWeek11Data = new RetrieveAndUpdateOrmWeek11Data();
			try {
				retrieveAndUpdateOrmWeek11Data.retrieveAndUpdateTestData();
				//retrieveAndUpdateOrmWeek11Data.retrieveByCriteria();
			}
			finally {
				ormweek11.ormtest.OrmWeek11PersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
