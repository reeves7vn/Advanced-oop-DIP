public class StudentEvaluator {

    public static void main(String[] args) {
      // Initialize average marks 
      double averageMarks = 75;
  
      // Calculate grade
      char grade;
      if (averageMarks >= 93) {
        grade = 'A';
      } else if (averageMarks >= 85) {
        grade = 'B';
      } else if (averageMarks >= 80) {
        grade = 'C';
      } else if (averageMarks >= 75) {
        grade = 'D';
      } else {
        grade = 'E';
      }
  
      // Determine pass/fail status
      String passStatus = (averageMarks >= 75) ? "Passed" : "Failed";
  
      System.out.println("Average Marks: " + averageMarks);
      System.out.println("Grade: " + grade);
      System.out.println("Pass Status: " + passStatus);
    }
  }
  