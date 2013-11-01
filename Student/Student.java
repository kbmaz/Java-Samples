
public class Student {
  
  private String lastName;
  private String firstName;
  private int iDNumber;
  private double projects[] = new double [15];
  private double quizzes[] = new double [10];
  
  public Student(String lastName, String firstName, int iDNumber) {
    this.lastName=lastName;
    this.firstName=firstName;
    this.iDNumber=iDNumber;
    projects = new double[] {-1.0,-1.0,-1.0,-1.0,-1.0,-1.0,-1.0,-1.0,-1.0,-1.0,-1.0,-1.0,-1.0,-1.0,-1.0};
    quizzes = new double[] {-1.0,-1.0,-1.0,-1.0,-1.0,-1.0,-1.0,-1.0,-1.0,-1.0};
    
  }
  
  public boolean setProjectScore(double projectScore, int projectID) { 
    while ((projectID >= 0) && (projectID < projects.length)) {
      projects[projectID]=projectScore;
      return true;
    }
    return false;
  }
  
  public boolean setQuizScore(double quizScore, int quizID) {
    while ((quizID >= 0) && (quizID < quizzes.length)) {
      quizzes[0]=quizScore;
      return true;
    }
    return false;
  }
  
  public double getProjectScore(int index) { 
    if (index < 0 || index > projects.length -1) {
      return (double) -1.0;
      }
      return projects[index];
  }
  
  public double getQuizScore(int index) {
    if (index < 0 || index > quizzes.length -1) {
  return (double) -1.0;
    }
  return quizzes[index];

  }
  
  public int getNextProjectIndex() {
    int i = 0;
    while (i < projects.length) {
      while (projects[i]== -1)
      return i; }
    return -1;
    
    }
  
  public int getNextQuizIndex() {
    int i = 0;
    while (i < quizzes.length) {
      while (quizzes[i] == -1)
        return i; }
    return -1;
    }
  
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
  public int getiDNumber() {
    return iDNumber;
  }
  public void setiDNumber(int iDNumber) {
    this.iDNumber = iDNumber;
  }
  
  

}
