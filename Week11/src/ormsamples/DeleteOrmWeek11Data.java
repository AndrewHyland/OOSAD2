/**
 * Licensee: Institute of Technology Tallaght
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteOrmWeek11Data {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = ormweek11.ormtest.OrmWeek11PersistentManager.instance().getSession().beginTransaction();
		try {
			ormweek11.ormtest.Employee lormWeek11ormtestEmployee = ormweek11.ormtest.EmployeeDAO.loadEmployeeByQuery(null, null);
			// Delete the persistent object
			ormweek11.ormtest.EmployeeDAO.delete(lormWeek11ormtestEmployee);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteOrmWeek11Data deleteOrmWeek11Data = new DeleteOrmWeek11Data();
			try {
				deleteOrmWeek11Data.deleteTestData();
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
