package in.legato;
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
	int registrationNumber;
	String name;
	char gender;
	static class PatientService{
		public static void addpatient(Patient r) {
			r.gender='M';
			r.registrationNumber=12;
			r.name="mks";
		}
		public static void main(String[] args) {
			Patient m=new Patient();
			m.gender='M';
			m.name="mks";
			m.registrationNumber=12;
			System.out.println(m.name +" "+m.gender +" "+m.registrationNumber);
			Collection<Integer> arr=new ArrayList<Integer>();
			arr.add(11);
			System.out.println(arr);
			boolean result=arr.contains(10);
			System.out.println("is patient present in given list"+result);
			char[] charArray=new char[] {'F','M','F','F','M','M'};
			System.out.println("Gender before sort");
			for(char ch:charArray) {
				System.out.println(ch);
			}
			Arrays.sort(charArray);
			System.out.println("Gender after sort");
			for(char ch:charArray) {
				System.out.println(ch);
			}
		}
	}
}