package collections;

public class Employee {
	
	private int empid;
	private String empname;
	private double salary;
	private int deptno;
	
	
	
	
	public Employee() {
		
		System.out.println("no-args/0-args Employee constructor called");
		
         
		/*
		this.empid=11;
		this.deptno=10;
		this.empname="xyz";
		this.salary=100;
		*/
	} 
	
	public Employee(Employee x)
	{
		this.deptno = x.deptno;
		this.empid = x.empid;
		this.empname = x.empname;
		this.salary = x.salary;
		
	}
	
	
	public Employee(int empid, String empname, double salary, int deptno) {
		//super();
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
		
		if(salary > 0)
		{
		  this.salary = salary;
		}
		else
		{
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
	
	
	public void display()
	{
		//this
		System.out.println("details:"+this.empid+","+this.empname+","+this.salary+","+this.deptno);
		//System.out.println(empid+","+this.empname+","+this.salary+","+this.deptno);
		
		
	}
	
	
	@Override
	public String toString()
	{
		return "details:"+this.empid+","+this.empname+","+this.salary+","+this.deptno;
	}
	
	
	public double calcAnnSal()
	{
		System.out.println("calculate annual salary of Employee called..");
		return this.salary * 12;
	}
	
	//function overloading  - static/compile time polymorphism
	public double calcAnnSal(double bonus)
	{
		return (this.salary * 12)+bonus;
	}

	private void setEmpid(int empid)
	{
		this.empid=empid;
	}
	
	
	
	//e1.equals(e2)
	
	@Override
	public boolean equals(Object obj)  //obj = e2
	{
		
		System.out.println("emp's equal method:comparing empid="+this.empid+"and empid="+((Employee)obj).empid);
		if(obj instanceof Employee)
		  return this.empid == ((Employee)obj).empid;
		else
		  return false;
	}
	
	
	@Override
	public int hashCode()
	{
		System.out.println("hashCode of this employee with empid:"+this.empid+" is :"+this.deptno);
		return this.deptno;
	}
	
	

}
