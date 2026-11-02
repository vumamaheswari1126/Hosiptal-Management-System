package Details;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Management {
	
	ArrayList <PatientDetails> patient = new ArrayList<>();
	ArrayList<DoctorDetails> doctor = new ArrayList<>();
	ArrayList<Appointment>  appointment =new ArrayList<>();
	ArrayList<Bill> bill=new ArrayList<>();
	public void addPatient()
	{   
		PatientDetails PD=new PatientDetails();
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter the Patient ID");
		int id=sc.nextInt();
		PD.setPatientId(id);
         
		sc.nextLine();
		System.out.println("Enter Patient Name:");
		String name = sc.nextLine();
		PD.setPatientName(name);

		System.out.println("Enter Patient Age:");
		int age = sc.nextInt();
		PD.setPatientAge(age);
        
		sc.nextLine();
        System.out.println("Enter Patient Gender:");
        String gender = sc.nextLine();
        PD.setPatientGender(gender);
          
        System.out.println("Enter Patient Phone Number:");
        long Number = sc.nextLong();
        PD.setPatientNumber(Number);
        
        sc.nextLine();
        System.out.println("Enter Patient Address:");
        String address = sc.nextLine();
        PD.setPatientAddress(address);
        
        patient.add(PD);
        
        System.out.println("Patient details added successfully!");

	}
	
	public void viewPatient()
	{   
		System.out.println("Patient Details....");
		for(PatientDetails p:patient)
		{
			System.out.println("PATIENT ID      :"+p.getPatientId());
			System.out.println("PATIENT NAME    :"+p.getPatientName());
			System.out.println("PATIENT AGE     :"+p.getPatientAge());
			System.out.println("PATIENT GENDER  :"+p.getPatientGender());
			System.out.println("PATIENT NUMBER  :"+p.getPatientNumber());
			System.out.println("PATIENT ADDRESS :"+p.getPatientAddress());
			System.out.println("*******************************************");
		}
		
	}
	public void viewPatientById(int id) 
	{
		boolean found=true;
		System.out.println("Details of Patient "+ id);
		for(PatientDetails p:patient)
		{
				
			if(id==p.getPatientId())
		{
			System.out.println("PATIENT ID      :"+p.getPatientId());
			System.out.println("PATIENT NAME    :"+p.getPatientName());
			System.out.println("PATIENT AGE     :"+p.getPatientAge());
			System.out.println("PATIENT GENDER  :"+p.getPatientGender());
			System.out.println("PATIENT NUMBER  :"+p.getPatientNumber());
			System.out.println("PATIENT ADDRESS :"+p.getPatientAddress());
			System.out.println("*******************************************");
			found=false;
			break;
		}
			
		}
		if(found)
		{
			System.out.println("Please Enter the Valid Patient ID");
		}
			
		}
		
	
	
	public void addDoctors()
	{
		
		DoctorDetails DD=new DoctorDetails();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Doctor ID");
		int id=sc.nextInt();
		DD.setDoctorId(id);
         
		sc.nextLine();
		System.out.println("Enter Doctor Name:");
		String name = sc.nextLine();
		DD.setDoctorName(name);

		System.out.println("Enter Specialization:");
		String Specialization = sc.nextLine();
		DD.setDoctorSpecialization(Specialization);
        
        System.out.println("Enter DoctorConsultantfee:");
        int fee = sc.nextInt();
        DD.setDoctorConsultantfee(fee);
        
        doctor.add(DD);
        System.out.println("Doctors Detail Added Sucessfully!");
	}
	
	public void viewDoctor()
	{   
		System.out.println("Doctor Details....");
		for(DoctorDetails d:doctor)
		{
			System.out.println("DOCTOR ID      :"+d.getDoctorId());
			System.out.println("DOCTOR NAME    :"+d.getDoctortName());
			System.out.println("DOCTOR AGE     :"+d.getDoctorSpecialization());
			System.out.println("DOCTOR GENDER  :"+d.getDoctorConsultantfee());
			System.out.println("*******************************************");
			
		}
		
	}
	
	public void viewDoctorById(int doctorId)
	{ 
		Boolean found=true;
		for(DoctorDetails d:doctor)
		{   
			
			if(doctorId==d.getDoctorId())
		     {   	
			System.out.println("DOCTOR ID      :"+d.getDoctorId());
			System.out.println("DOCTOR NAME    :"+d.getDoctortName());
			System.out.println("DOCTOR AGE     :"+d.getDoctorSpecialization());
			System.out.println("DOCTOR GENDER  :"+d.getDoctorConsultantfee());
			System.out.println("*******************************************");
			found=false;
			
		     } 
			
		}
		if(found)
			
        {
			System.out.println("Please Enter the Valid Doctor ID");	
		 }
		

	}
	
	public void appointment()
	{   
		
        Scanner sc=new Scanner(System.in);
        
        System.out.println("To Appointment Book");
        
        if(patient.isEmpty())
        {
    	System.out.println("Patient  List is Empty Please Register the patient ");
    	if(patient.size()==0)
    	{
    		this.addPatient();
    		
    	}
    	
   
       
        }
        boolean patientvalue=false;
        while(!patientvalue)
        {   
        	System.out.println("Enter the Patient ID");
   	        int id=sc.nextInt();
        	for(PatientDetails p:patient)
        	{
        		  if(id==p.getPatientId())
        	    	 {
        	    		 patientvalue=true;
        	    		 break;
        	    	 }
        	}
        	if(!patientvalue)
		       {
		    	   System.out.println("Enter the valid Doctor ID");
		    	   break;
		       }
        		
        	
		  boolean value=false;
		  while(!value)
		  {
			  System.out.println("Enter the Doctor ID");
	          int Id=sc.nextInt();
			 
		  for(DoctorDetails d:doctor)
		  {   
				  if(Id==d.getDoctorId())
				  {
					  value=true;
					  break;
				  }
			       
		  }
		  if(!value)
	       {
	    	   System.out.println("Enter the valid Doctor ID");
	    	   break;
	       }

		  System.out.println("Enter the Date");
		  String inputdate=sc.next();
		  DateTimeFormatter f=DateTimeFormatter.ofPattern("dd-MM-yyyy");
		  LocalDate date=LocalDate.parse(inputdate,f);		  
		 
		  
		  System.out.println("Enter the Time");
		  double time=sc.nextDouble();
	 
		  
		  boolean isBooked=false;
		  
		  for(Appointment a:appointment)
			  
		  {
			 
			  if(Id==a.getDoctorId()&& time==a.getTime()&&date.equals(a.getDate())&&a.getStatus().equals("Booked"))
				  
			  {
				 isBooked=true;
				  
			  }
		  }
			  if(!isBooked)
			  {
				  Appointment A = new Appointment();
				  System.out.println("Appointment booking please wait... ");
				  A.setDate(date);
				  A.setTime(time);
				  A.setDoctorId(Id);
				  A.setPatientId(id);
				  A.setAppointmentId(0);
				  A.setStatus("Booked");
				  System.out.println("Appointment Booked Successfully!");
				  System.out.println("Appointment ID: " + A.getAppointmentId());
				  appointment.add(A);
			  }
			  else
			  {
				 System.out.println("Already booked Please try another time and date"); 
			  }
		  }
        }      
	}
	public void viewAppointments()
	{  
		for(Appointment a : appointment)
		{
		System.out.println("APPOINTMENT ID      :"+a.getAppointmentId());
	    System.out.println("PATIENT ID   :"+a.getPatientId());
	    System.out.println("DOCTOR ID     :"+a.getDoctorId());
	    System.out.println("DATE  :"+a.getDate());
	    System.out.println("TIME  :"+a.getTime());
        System.out.println("STATUS:"+a.getStatus());
		System.out.println("*******************************************");
	}
	
		}
	public void cancelAppointment(int id)
	{   
		
		for(Appointment a:appointment)
			if(id==a.getAppointmentId())
			{
				a.setStatus("cancelled");
				System.out.println("Appointment Cancelled Sucessfully ");
			}

		
	}
	
	
	public void bill()
	{   
		Bill B=new Bill();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Patient Id");
		int pid=sc.nextInt();
		B.setPatientId(pid, patient);
		sc.nextLine();
		
		System.out.println("Enter the Doctor Id");
		int did=sc.nextInt();
		B.setDoctorId(did, doctor);
//		sc.nextLine();
		
//		System.out.println("Enter the Doctor Id");
//		int id=sc.nextInt();
//		B.setConsultantFee(id,doctor);
		
		
         
		sc.nextLine();
		System.out.println("Enter Addtional Fee:");
		double fee = sc.nextInt();
		B.setMedicineFee(fee);
		
		
        
		bill.add(B);
		
		System.out.println("*****************BILL************** ");
		
		System.out.println("Patient ID   :"+B.getPatientId());
		System.out.println("Patient Name :"+B.getPatientName());
		System.out.println("Doctor Id    :"+B.getDoctorId());
		System.out.println("Doctor Name  :"+B.getdoctorName());
		System.out.println("Doctor Consultant Fee  :"+B.getConsultantFee());
		System.out.println("Addtional fee(Medicine):"+B.getMedicineFee());
		B.setTotalAmount(B.getConsultantFee(),B.getMedicineFee());
		System.out.println("Total Bill Amount is    :"+B.getTotalAmount());
		sc.nextLine();
		System.out.println("Enter Payment :");
		double payment = sc.nextInt();
		B.setpayment(payment);
		B.setPaymentStatus(payment);
		System.out.println("Payment Status :"+B.getPaymentStatus());
		System.out.println("Balance        :"+B.getBalance());
		
		
		
	}
	public static void main(String args[])
	{   
		Scanner sc=new Scanner(System.in);
		Management MD=new Management();
		
		
		
		System.out.println("***********************HOSPITAL MANAGEMENT*******************");
		
		System.out.println("1.___* ADD PATIENT DETAILS  *___");
		System.out.println("2.___* VIEW PATIENT DETAILS *___");
		System.out.println("3.___* VIEW BY PATIENT ID   *___");
		
		System.out.println("4.___* ADD DOCTOR DETAILS   *___");
		System.out.println("5.___* VIEW DOCTOR DETAILS  *___");
		System.out.println("6.___* VIEW DOCTOR BY ID    *___");
		
		System.out.println("7.___* BOOK APPOINTMENT     *___");
		System.out.println("8.___* VIEW APPOINTMENTS    *___");
		System.out.println("9.___* CANCEL APPOINTMENT   *___");
		
		System.out.println("10.__* GENERATE BILL        *___");
		System.out.println("11.EXIT");
//		MD.bill();
		
		boolean found=true;
		while(found)
		{
		System.out.println("PLEASE ENTER THE OPTION ");
		int option=sc.nextInt();
		
		switch(option)
		{
		case 1:
		{
			MD.addPatient();
			break;
				
		}
		case 2:
		{
			MD.viewPatient();
			break;
		}
		case 3:
		{
			System.out.println("Enter the Patient ID");
	     	int id=sc.nextInt();
			MD.viewPatientById(id);
			break;
		}
		case 4:
		{
			MD.addDoctors();
			break;
		}
		case 5:
		{
			MD.viewDoctor();
			break;
		}
		case 6:
		{
			System.out.println("Enter the Doctor ID");
	     	int DoctorId=sc.nextInt(); 
			MD.viewDoctorById(DoctorId);
			break;
		}
		case 7:
		{
			MD.appointment();
			break;
		}
		case 8:
		{
			MD.viewAppointments();
			break;
		}
		case 9:
		{
			System.out.println("To Cancel Appointment Please Enter the Appointment ID");
			int Appointmentid=sc.nextInt(); 
			MD.cancelAppointment(Appointmentid);
			break;
		}
		case 10:
		{
			MD.bill();
			break;
		}
		case 11 :
		{
			System.out.println("*******Thank you*******");
			
			System.out.println("To continue 1 || To exit 0");
			System.out.println("Please Enter the Option ");
			int  op=sc.nextInt();
			
			if(op==1)
			{
				found=true;
			}
			else
			{
				found=false;
			}
			break;
				
		}
		default:
		{
			System.out.println("Enter the valid option");
			break;
		}
		}
		}
//		
		
		
		
	}

}
