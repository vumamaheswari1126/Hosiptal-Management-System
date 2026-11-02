package Details;

import java.util.ArrayList;

public class Bill {

	private  int billId;
	private int patientId;
	private String patientName;
	private int doctorId;
	private String doctorName;
	private double consultantfee;
	private double medicinefee;
	private double totalamount;
	private String paymentStatus;
	private double payment;
	private double balance;
	public static int count=1;
	
	public  void setBillId()
	{
		billId=count++;
	}
	public int getBillId()
	{
		return billId;
	}
	
	public String setPatientId(int id,ArrayList<PatientDetails> patient)
	{
		for(PatientDetails p:patient)
		{
		if(id==p.getPatientId())
		{
			this.patientId=id;
			this.patientName=p.getPatientName();
			return "patient found";
		}
		
         }
		return "Invalid ID";
				
	}
	
	public int getPatientId()
	{
		return patientId;
	}
	
	
	public String getPatientName()
	{
		return patientName;
	}

	public String setDoctorId(int id,ArrayList<DoctorDetails> doctor)
	{
		for(DoctorDetails d:doctor)
		{
		if(id==d.getDoctorId())
		{
			this.doctorId=id;
			this.doctorName=d.getDoctortName();
			this.consultantfee=d.getDoctorConsultantfee();
		}
		}
		
		return "Invalid ID";
				
	}
	
	public int getDoctorId()
	{
		return doctorId;
	}
	public String getdoctorName()
	{
		return doctorName;
		
	}
//	public void setConsultantFee(int id,ArrayList<DoctorDetails> doctor)
//	{   boolean found=true;
//		for(DoctorDetails d:doctor)
//		{
//		if(id==d.getDoctorId())
//		{
//			this.consultantfee=d.getDoctorConsultantfee();
//			found=false;
//		}
//		
//			}
//		if(found)
//		{
//			System.out.println("please Enter the valid ID");
//		}
//	}
//	
	public double getConsultantFee()
	{
		return consultantfee;
		
	}
	
	public void setMedicineFee(double medicinefee)
	{
		this.medicinefee=medicinefee;
	}
	
	public double getMedicineFee()
	{
		return medicinefee;
	}
	
	public void setTotalAmount(double consultantfee,double medicinefee)
	{
		this.totalamount=consultantfee+medicinefee;
	}
	public double getTotalAmount()
	{
		return totalamount;
	}
	
	public void setPaymentStatus(double payment)
	{
		if(payment>=totalamount)
		{
			this.paymentStatus="Sucess";
			this.balance=payment-totalamount;
		}
		if(payment<totalamount)
		{
			this.paymentStatus="Insufficient Balance";
		}
	}
	public String getPaymentStatus()
	{
		return paymentStatus;
	}
	public void setBalance()
	{
		if(payment>totalamount)
		{
		balance=totalamount-payment;
		
		}
		else
		{
			balance =0;
		}
		
	}
	
	public Double getBalance()
	{
		return balance;
	}
	public void setpayment(double payment) 
	{
		
		this.payment=payment;
	}
	
	public double getPayment()
	{
		return payment;
	}
	
}
