/**
 * Licensee: Institute of Technology Tallaght
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateOrmWeek11Data {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = ormweek11.ormtest.OrmWeek11PersistentManager.instance().getSession().beginTransaction();
		try {
			ormweek11.ormtest.Employee e = ormweek11.ormtest.EmployeeDAO.createEmployee();
			// Initialize the properties of the persistent object here
                        e.setName("Steve Johnson");
                        e.setAddress("127 Main Street");
                        e.setMobile("014445656"); 
                        e.setPPS("123456");
                        e.setYear("2009");
                        e.setTitle("Manager");
                        e.setDepartment("Finance");
			ormweek11.ormtest.EmployeeDAO.save(e);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateOrmWeek11Data createOrmWeek11Data = new CreateOrmWeek11Data();
			try {
				createOrmWeek11Data.createTestData();
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
