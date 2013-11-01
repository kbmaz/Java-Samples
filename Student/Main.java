public class Main {

  public static void main(String[] args) {

    Student student1 = new Student("Mirkes", "Kimberly", 100);
    double[] projects = new double[15];
    double quizzes[] = new double[10];

    // Fill the projects and quizzes for this student.
    double[] pScores = { 88.5, 75.0, 99.5, 94.5, 88.0, 90.0, 93.5, 100.0, 89.5, 90.0, 97.5, 90.5, 100.0, 95.5, 98.0 };
    double[] qScores = { 97.5, 90.5, 100.0, 95.5, 98.0, 88.5, 75.0, 99.5, 94.5, 88.0 };

    // Use the getNextProjectIndex() and getNextQuizIndex() methods to find the
    // indexes in which to add the scores.
    student1.getNextProjectIndex();
    student1.getNextQuizIndex();

    // Use a loop to get project and quiz scores from the student object.
    int numProjects = student1.getNextProjectIndex();
    for (int i = 0; i < pScores.length; i++) {
      System.out.println(student1.getFirstName() + " " + student1.getLastName() + " project scores are "
          + student1.getProjectScore(i));

      while (i < numProjects) {
        System.out.println(i + "\t" + student1.getProjectScore(i));
        i++;
      }
    }
    System.out.println(student1.getFirstName() + " " + student1.getLastName() +  " has no project scores");
  
  int numQuizzes = student1.getNextQuizIndex();
  for (int i = 0; i < qScores.length; i++) {
    System.out.println(student1.getFirstName() + " " + student1.getLastName() + " quiz scores are " + student1.getQuizScore(i));
    
    while(i < numQuizzes) {
      System.out.println(i + "\t" + student1.getQuizScore(i));
      i++;
  }
}
    System.out.println(student1.getFirstName() + " " + student1.getLastName() + " has no quiz scores");
  }
}

// Try to go out of bounds to add a project and a quiz to the student to test
// the ability of the Student class's methods to handle full arrays.
// Once full, display the student's information to the console. Use a loop to
// get project and quiz scores from the student object.
