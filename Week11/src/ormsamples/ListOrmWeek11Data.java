/**
 * Licensee: Institute of Technology Tallaght
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class ListOrmWeek11Data {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Employee...");
		ormweek11.ormtest.Employee[] ormWeek11ormtestEmployees = ormweek11.ormtest.EmployeeDAO.listEmployeeByQuery(null, null);
		int length = Math.min(ormWeek11ormtestEmployees.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormWeek11ormtestEmployees[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Employee by Criteria...");
		ormweek11.ormtest.EmployeeCriteria lormWeek11ormtestEmployeeCriteria = new ormweek11.ormtest.EmployeeCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormWeek11ormtestEmployeeCriteria.ID.eq();
		lormWeek11ormtestEmployeeCriteria.setMaxResults(ROW_COUNT);
		ormweek11.ormtest.Employee[] ormWeek11ormtestEmployees = lormWeek11ormtestEmployeeCriteria.listEmployee();
		int length =ormWeek11ormtestEmployees== null ? 0 : Math.min(ormWeek11ormtestEmployees.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormWeek11ormtestEmployees[i]);
		}
		System.out.println(length + " Employee record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListOrmWeek11Data listOrmWeek11Data = new ListOrmWeek11Data();
			try {
				listOrmWeek11Data.listTestData();
				//listOrmWeek11Data.listByCriteria();
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
