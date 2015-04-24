/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Institute of Technology Tallaght
 * License Type: Academic
 */
package ormweek11.ormtest;

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class EmployeeDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression name;
	public final StringExpression address;
	public final StringExpression mobile;
	public final StringExpression PPS;
	public final StringExpression year;
	public final StringExpression title;
	public final StringExpression department;
	
	public EmployeeDetachedCriteria() {
		super(ormweek11.ormtest.Employee.class, ormweek11.ormtest.EmployeeCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		address = new StringExpression("address", this.getDetachedCriteria());
		mobile = new StringExpression("mobile", this.getDetachedCriteria());
		PPS = new StringExpression("PPS", this.getDetachedCriteria());
		year = new StringExpression("year", this.getDetachedCriteria());
		title = new StringExpression("title", this.getDetachedCriteria());
		department = new StringExpression("department", this.getDetachedCriteria());
	}
	
	public EmployeeDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, ormweek11.ormtest.EmployeeCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		address = new StringExpression("address", this.getDetachedCriteria());
		mobile = new StringExpression("mobile", this.getDetachedCriteria());
		PPS = new StringExpression("PPS", this.getDetachedCriteria());
		year = new StringExpression("year", this.getDetachedCriteria());
		title = new StringExpression("title", this.getDetachedCriteria());
		department = new StringExpression("department", this.getDetachedCriteria());
	}
	
	public Employee uniqueEmployee(PersistentSession session) {
		return (Employee) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Employee[] listEmployee(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Employee[]) list.toArray(new Employee[list.size()]);
	}
}

