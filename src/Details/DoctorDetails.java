package Details;

public class DoctorDetails {
	
	private int doctorId;
	private String doctorName;
	private String doctorSpecialization;
	private int doctorConsultantfee;
	
	public void setDoctorId(int doctorId)
	{
		this.doctorId=doctorId;
	}
	
	public int getDoctorId()
	
	{
		return doctorId;
	}
	
	public void setDoctorName(String doctorName)
	{
		this.doctorName=doctorName;
	}
	
    public String getDoctortName()
	
	{
		return doctorName;
	}
	
	public void setDoctorSpecialization(String doctorSpecialization)
	{
		this.doctorSpecialization=doctorSpecialization;
	}
	
     public String getDoctorSpecialization()
	
	{
		return doctorSpecialization;
	}
	public void setDoctorConsultantfee(int doctorConsultantfee)
	{
		this.doctorConsultantfee=doctorConsultantfee;
	}
	
     public int getDoctorConsultantfee()
	
	{
		return doctorConsultantfee;
	}

}
