package Details;

//import java.sql.Date;
import java.time.LocalDate;

public class Appointment {


	private int appointmentId;
	private int doctorId;
	private int patientId;
	private LocalDate date;
	private double time;
	private String status;
	public static int count=1000;
	
	
	public int getAppointmentId() 
	{   
		
	    return appointmentId;
	}

	public void setAppointmentId(int appointmentId) 
	{
	    this.appointmentId=count++;
	}

	public int getDoctorId() 
	{
	    return doctorId;
	}

	public void setDoctorId(int doctorId)
	{
	    this.doctorId = doctorId;
	}

	public int getPatientId() 
	{
	    return patientId;
	}

	public void setPatientId(int patientId)
	{
	    this.patientId = patientId;
	}

	public LocalDate getDate() 
	{
	    return date;
	}

	public void setDate(LocalDate date) 
	{
	    this.date = date;
	}

	public double getTime() 
	{
	    return time;
	}

	public void setTime(double time)
	{
	    this.time = time;
	}
	public String getStatus()
	{
		return status;
	}
	public void setStatus(String status)
	{
		this.status=status;
	}
	
	
}
