public class PhoneBook {

  private static final int SIZE = 10;
  String[] names;
  String[] numbers;

  public PhoneBook() {
    numbers = new String[SIZE];
    names = new String[SIZE];
  }

  /*We want a Single String that prints EVERY name, next to EVERY phone number, each entry on another line.  
   * Basically, we want toString() to print ALL of the information held in your PhoneBook object, printed nicely and neatly.
   */
  
  public String toString() {  // This is good.
    String str = "";
    for(int i=0; i<SIZE; i++) 
      if (names[i] != null || numbers[i] != null) {// but it would be better if it skipped null entries.  
      str += ("String" + names[i] + "\tString2 " + numbers[i] + "\n");
      }
    return str;
  }
//setName is incorrect.  Here are instructions:
  /*
   * A setName() method that takes a String as a name and an int as an index number for parameters. 
   * Set the name array at index to equal the String parameter. 
   * Return true if the index is in bounds of the name array and the data was set. 
   * Return false if the index is out of bounds.
   */
  
//Returning true or false?  That means a **boolean** return type.
  
  public boolean setName(String name, int index) {
    int i = 0;  
    if (index < names.length) {
        names[i] = name;
        return true;
      }
    else {
      return false;
    }
    /*  
     *  if the index param is in bounds
     *    set the name element at index to the name param
     *    return true
     *  else (the index is out-of-bounds)
     *     DON'T set the name to anything
     *     return false.
     *    
     *  like this:
     *   if index is less than name.length
     *     set name[index] to name;
     *     return ture, for success.  :)
     *   else
     *     return false, for failure.  
     */
  }
  //return this.names;
 //}
  //Similar story.
  // Copy/Paste your instructions so you can see it right here in your code.  
  //  USE your tools to make life easier.
  //public String[] setNumber(String number, int index) {
    //return this.number;
  //}
  
  public boolean setNumber(String number, int index) {
    int i = 0;  
    if (index < numbers.length) {
        numbers[i] = number;
        return true;
      }
    else {
      return false;
    }
  }

  /*
   * A getRecord() method that takes an index number of a record (array slot).
   * Look up the record at that index in the name and phoneNumber arrays. Return
   * a new String array with the record's name in element 0 and the person's
   * phone number in element 1. If the index number is out of bounds or if the
   * record contains no valid data, return null. This method returns either a
   * two element String array or null.
   */

  
  //Close, but not perfect.
  public String[] getRecord(int index) {
    String[] getRecord = new String[2];
    int i=0;
    if (i >= 0 && i < SIZE) {
    getRecord[0] = names[0];  // only do this if index is in range.
    getRecord[1] = numbers[1];  // same, range-check FIRST, then set.
      // here is your range-check, add brackets and set your new array slots here.
    return getRecord;
    }
    else 
      return null;
  }

  /*
   * A getRecord() method that overloads your other getRecord() method. This
   * method needs to take a String as a parameter that represents the name of a
   * person you want to get the record of. It should return the index number of
   * that record. Your search of the array should be case insensitive. There are
   * methods in the String class that can help with this. Remember to check for
   * a null value before trying to access data in the array element. Return -1
   * if the record is not found.
   */
  
  // This is incorrect.  To 'search' an array, you'll have to loop thru it.
  public int getRecord(String person) {
    String[] getRecord = new String[SIZE];
    int i=0;  // i is 0
    if (names[i] != null) {  // i is STILL 0
      if (getRecord[i] == names[i])
        i++;
        return i;  // only returns 0.
    }
    
  // But if you LOOP, i will increase in value, effectively looking at each slot in the name array.
    return -1;
}

  public int nextIndex() {  // Perfect!
    for (int i = 0; i <= names.length; i++) {
      if (names[i] == null) {
        return i;
      }
    }
    return -1;
  }

}
