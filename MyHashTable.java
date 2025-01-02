import java.util.*;


public class MyHashTable {
	
	// ATTRIBUTES
  
	// buckets is an array of ArrayList.  Each item in an ArrayList holds
	// a reference value pointing to a student.  Each ArrayList is initially
	// empty.

	public ArrayList<StudentInfo>[] buckets;

	
	// CONSTRUCTOR

	public MyHashTable(int howManyBuckets) {

		// Construct the hash table (open hashing/closed addressing) as an array of howManyBuckets ArrayLists.

		// Instantiate buckets as an array to have an ArrayList as each element of the array.
		buckets = new ArrayList[howManyBuckets];

		// For each element in the array, instantiate its ArrayList.
		for (int i = 0; i < howManyBuckets; i++) {
			buckets[i] = new ArrayList();  // Instantiate the ArrayList for bucket i.
		}
	}


	// METHODS

	public int calcBucket(int sN) {
		return(sN % buckets.length);  // student number modulo number of buckets
	}


	public void addToTable(StudentInfo theStudent) {
		// Add the student referenced by theStudent to the hash table.
    int lastNum = theStudent.studentNum;
    lastNum = lastNum%10;
		
		if (theStudent == null) {
			return; // Nothing to do!
		}
    else{
      buckets[lastNum].add(theStudent);
    }
		
		// CODE GOES HERE
	}  // end addToTable


	public StudentInfo removeFromTable(int sNum) {
		// Remove the student with that student number from the hash table and return the
		// reference value for that student.
    
		// Return null if that student isn't in the table.

		// CODE GOES HERE
    int lastNum = sNum%10;
    for(int i = 0; i < buckets[lastNum].size(); i++){
      if(buckets[lastNum].get(i).studentNum == sNum){
        buckets[lastNum].remove(i);
        return buckets[lastNum].get(i);
      }
    }
		return(null);
		
	}  // end removeFromTable

	public StudentInfo getFromTable(int sNum) {
		// Return the reference value for the student with that student number,
		// return null if student isn't in the table.
		// CODE GOES HERE
    int lastNum = sNum%10;
    for(int i = 0; i < buckets[lastNum].size(); i++){
      if(buckets[lastNum].get(i).studentNum == sNum){
        return buckets[lastNum].get(i);
      }
    }
		return(null);
		

	}  // end getFromTable


	public void displayTable() {
		
		// Walk through the buckets and display the items in each bucket's ArrayList.
		
		System.out.println("\n\nHERE ARE THE CONTENTS OF THE TABLE:\n");
		for (int i = 0; i < buckets.length; i++) {
			if (buckets[i].isEmpty()) {
				System.out.println("BUCKET " + i + " has an empty ArrayList!\n");
			}
			else {
				System.out.println("BUCKET " + i + " has an ArrayList holding the following students:");
				// Print out the first name of each student in the ArrayList for the current bucket.
				StudentInfo aStudent;
				for (int j = 0; j < buckets[i].size(); j++) {
					aStudent = buckets[i].get(j);
					System.out.println("  "+ aStudent.studentNum + " " + aStudent.firstName+ " " + aStudent.lastName);
				}
			}
		}
		
	} // end displayTable


}
