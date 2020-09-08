package com.stackroute;
/*Program 6
Create a class Patient
registrationNumber:int
name: String
gender: char
 Create a class PatientService
	Implement the below methods

 **Create a set of type Patient**

addPatient(int registrationNumber, String name, char gender)
Add the patient details to set and display the set

searchPatient(int registrationNumber)
  This method searches a patient in the set given

getAllPatientsByGender(char gender)
 This method returns a Set of patients for a given gender in the sorted order of patient name
 */
import java.util.*;
public class Patient {
	private int registrationNumber;
	private String name;
	private char gender;
	// parameterised constructor
	public Patient(int registrationNumber, String name, char gender) {
		super();
		this.registrationNumber = registrationNumber;
		this.name = name;
		this.gender = gender;
	}
	// constructor
	public Patient() {
		super();
	}
	// getters and setters
	public int getRegistrationNumber() {
		return registrationNumber;
	}
	public void setRegistrationNumber(int registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	// toString method
	@Override
	public String toString() {
		return "Patient{" + "registrationNumber=" + registrationNumber + ", name='" + name + '\'' + ", gender=" + gender + '}';
	}
}

class PatientService {
	Set<Patient> patients = new HashSet();
	// addPatient method to add data
	public void addPatient(int registrationNumber, String name, char gender) {
		Patient patient = new Patient();    //created object for Patient
		// setting details
		patient.setRegistrationNumber(registrationNumber);
		patient.setName(name);
		patient.setGender(gender);
		patients.add(patient);
		for (Patient p1 : patients) {
			System.out.println(p1);
		}
	}
	// searchPatient method to search a patient from data
	public void searchPatient(int registrationNumber) {
		for (Patient patient : patients) {
			if (patient.getRegistrationNumber() == registrationNumber) {
				System.out.println(patient);
			} else {
				System.out.println("Patient not found");
			}
		}
	}
	// This method returns a Set of patients for a given gender in the sorted order of patient name
	public Set<Patient> getAllPatientsByGender(char gender) {
		Set<Patient> res = new HashSet();
		for (Patient patient : patients) {
			if (patient.getGender() == gender) {
				res.add(patient);
			}
		}
		return res; // returning result
	}
}

class PatientMenu {
	public static void main(String[] args) {
		Set<Patient> res = new HashSet();
		//creation of objects
		PatientService service = new PatientService();
		PatientService service1 = new PatientService();
		PatientService service2 = new PatientService();
		//passing values to addPatient method
		service.addPatient(1, "Rahul", 'M');
		service1.addPatient(2, "Kanika", 'F');
		service2.addPatient(3, "Sunil", 'M');
		// fetching the patients of gender M in service object
		res = service.getAllPatientsByGender('M');
		System.out.println(res);
		//calling searchPatient method
		service.searchPatient(8);
	}
}