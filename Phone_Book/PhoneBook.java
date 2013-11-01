public class PhoneBook {

  private static final int SIZE = 10;
  String[] name;
  String[] number;

  public PhoneBook() {
    number = new String[SIZE];
    name = new String[SIZE];
  }

  /*We want a Single String that prints EVERY name, next to EVERY phone number, each entry on another line.  
   * Basically, we want toString() to print ALL of the information held in your PhoneBook object, printed nicely and neatly.
   */
  
  public String toString() {
    return "Name: " + this.name + " Phone Number: " + this.number;
  }

  public String[] setName(String name, int index) {
    return this.name;
  }

  public String[] setNumber(String number, int index) {
    return this.number;
  }

  /*
   * A getRecord() method that takes an index number of a record (array slot).
   * Look up the record at that index in the name and phoneNumber arrays. Return
   * a new String array with the record's name in element 0 and the person's
   * phone number in element 1. If the index number is out of bounds or if the
   * record contains no valid data, return null. This method returns either a
   * two element String array or null.
   */

  public String[] getRecord(int index) {
    String[] getRecord = new String[2];
    getRecord[0] = name[0];
    getRecord[1] = number[1];
    int i=0;
    if (i >= 0 && i < SIZE)
    return getRecord;
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
  public int getRecord(String person) {
    String[] getRecord = new String[SIZE];
    int i = 0;
    if (name[i] != null) {
      if (getRecord[i] == name[i])
        return i;
    }
  
    return -1;
}

  public int nextIndex() {
    for (int i = 0; i <= name.length; i++) {
      if (name[i] == null) {
        return i;
      }
    }
    return -1;
  }

}
