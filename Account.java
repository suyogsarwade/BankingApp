package p2;

public class Account {
	private String name;
    private int pswd;
    private double bal;
    private long accno;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPswd() {
		return pswd;
	}

	public void setPswd(int pswd) {
		this.pswd = pswd;
	}

	public double getBal() {
		return bal;
	}

	public void setBal(double bal) {
		this.bal = bal;
	}

	public long getAccno() {
		return accno;
	}

	public void setAccno(long accno) {
		this.accno = accno;
	}

	public Account(String name,int pswd,double bal,long accno) {
		super();
		this.name=name;
		this.pswd=pswd;
		this.bal=bal;
		this.accno=accno;
	}
	

	
}
