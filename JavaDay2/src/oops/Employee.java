package oops;

public class Employee {

	private int empid;
	private String empname;
	private double salary;
	private int deptno;

	// no argument constructor
	public Employee() {

		System.out.println("no-args/0-args Employee constructor called");

		/*
		 * this.empid=11; this.deptno=10; this.empname="xyz"; this.salary=100;
		 */
	}

	// copy constructor
	public Employee(Employee x) {
		this.deptno = x.deptno;
		this.empid = x.empid;
		this.empname = x.empname;
		this.salary = x.salary;

	}

	public Employee(int empid, String empname, double salary, int deptno) {
		// super();
		System.out.println("Parameterized Employee constructor called..");
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
		this.deptno = deptno;

	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {

		if (salary > 0) {
			this.salary = salary;
		} else {
			System.out.println("Slary can't be 0 or less than 0");
		}
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public int getEmpid() {
		return empid;
	}

	public void display() {
		// this
		System.out.println("details:" + this.empid + "," + this.empname + "," + this.salary + "," + this.deptno);
		// System.out.println(empid+","+this.empname+","+this.salary+","+this.deptno);

	}

	public double calcAnnSal() {
		return this.salary * 12;
	}

	// function overloading - static/compile time polymorphism
	public double calcAnnSal(double bonus) {
		return (this.salary * 12) + bonus;
	}

}