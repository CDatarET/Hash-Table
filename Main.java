//add to table
//remove from table
//get from table

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentInfo someStudent;
		StudentInfo removedStudent;
        StudentInfo gotStudent;
		
		MyHashTable theHT = new MyHashTable(10);  // Open hash table with 10 buckets
		
		theHT.displayTable();
		
		someStudent = new StudentInfo(123456, "Bugs", "Bunny");
		theHT.addToTable(someStudent);
		
		someStudent = new StudentInfo(987654, "Lola", "Bunny");
		theHT.addToTable(someStudent);
		
		someStudent = new StudentInfo(464646, "Daffy", "Duck");
		theHT.addToTable(someStudent);

		theHT.displayTable();
		
		removedStudent = theHT.removeFromTable(777777);
		if (removedStudent == null) {
			System.out.println("\nRemove failed!  No student with that student number in the table!");
		}
		else {
			System.out.println("\nRemoved " + removedStudent.firstName);
		}
		
		theHT.displayTable();
		
		removedStudent = theHT.removeFromTable(123456);
		if (removedStudent == null) {
			System.out.println("\nRemove failed!  No student with that student number in the table!");
		}
		else {
			System.out.println("\nRemoved " + removedStudent.firstName);
		}
		
		theHT.displayTable();
    
    gotStudent = theHT.getFromTable(987654);
    System.out.println("Getting student with student number " + gotStudent.studentNum);
    if(gotStudent == null){
      System.out.println("\nGet failed!  No student with that student number in the table!");
    }
    else{
      System.out.println("\nGot " + gotStudent.firstName +" at "+ gotStudent);
    }
	}

}
