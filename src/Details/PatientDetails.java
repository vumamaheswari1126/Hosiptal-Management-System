package Details;

public class PatientDetails {
	private int patientId;
	private String patientName;
	private int patientAge;
	private String patientGender;
	private long patientNumber;
	private String patientAddress;
	
	
	public void setPatientId(int patientId)
	{
		this.patientId=patientId;
	}
	
	public int getPatientId()
	
	{
		return patientId;
	}
	
	public void setPatientName(String patientName)
	{
		this.patientName=patientName;
	}
	
    public String getPatientName()
	
	{
		return patientName;
	}
	
	public void setPatientAge(int patientAge)
	{
		this.patientAge=patientAge;
	}
	
     public int getPatientAge()
	
	{
		return patientAge;
	}
	public void setPatientGender(String patientGender)
	{
		this.patientGender=patientGender;
	}
	
     public String getPatientGender()
	
	{
		return patientGender;
	}
	public void setPatientNumber(long patientNumber)
	{
		this.patientNumber=patientNumber;
	}
	
     public long getPatientNumber()
	
	{
		return patientNumber;
	}
	public void setPatientAddress(String patientAddress)
	{
		this.patientAddress=patientAddress;
	}
     public String getPatientAddress()
	
	{
		return patientAddress;
	}
     
    public void patientDetail()
    {
    	System.out.print("Patient Details...");
    	System.out.println("Id"+patientId);
    	System.out.print("Name"+patientName);
    	System.out.print("Age"+patientAge);
    	System.out.print("Gender"+patientGender);
    	System.out.print("Number"+patientNumber);
    	System.out.print("Address"+patientAddress);
    }
	

}
