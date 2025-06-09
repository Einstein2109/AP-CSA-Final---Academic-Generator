import java.util.ArrayList;
public class Generator extends Student
{
   private int numClasses;
   private double GPA;
   private ArrayList<Integer> arr;
   private boolean hasWork;
   private boolean hasTakenSAT;
   private int satScore;
   private String workExperience;

   
   public Generator(String studentName, int numClasses, ArrayList<Integer> arr, boolean hasTakenSAT, boolean hasWork, int satScore, String workExperience)
   {
       super(studentName);
       this.numClasses = numClasses;
       this.arr = arr;
       this.GPA = calculateGPA(arr);
       this.hasWork = hasWork;
       this.hasTakenSAT = hasTakenSAT;
       this.satScore = satScore;
       this.workExperience = workExperience;
   }
   
   public Generator(String studentName, int numClasses, ArrayList<Integer> arr, boolean hasTakenSAT, boolean hasWork, String workExperience)
   {
       super(studentName);
       this.numClasses = numClasses;
       this.arr = arr;
       this.GPA = calculateGPA(arr);
       this.hasWork = hasWork;
       this.hasTakenSAT = hasTakenSAT;
       this.workExperience = workExperience;
   }
   
   //Accessor Methods
   public int getNumClasses()
   {
       return numClasses;
   }
   
   public boolean hasTakenExam()
   {
       return hasTakenSAT;
   }
   
   public boolean hasWorkExperience()
   {
       return hasWork;
   }
   
   public int getSATScore()
   {
       return satScore;
   }
   
   public String getWork()
   {
       return workExperience;
   }
   
   //Mutator Methods
   
   public double calculateGPA(ArrayList<Integer> arr)
   {
       double points = 0.0;
       for(int grade : arr)
       {
           points += grade;
       }
       return (points / arr.size());
   }
   
   @Override
   public String toString()
   {
       return super.getName() + "'s GPA: " + calculateGPA(arr);
   }
   
   public String generateAcademicResume(Student other, ArrayList<Integer> arr)
    {
        String output = "";
        output += other.getName() + "'s Academic Resume"; 
        output += "\n\nAge: " + other.getAge() + "\n\nDate of Birth: " + other.getBirthday(); 
        output += "\n\nCurrent Grade Level: " + other.getGradeLevel() + "\n\nGPA (Unweighted): " + calculateGPA(arr);
        if(hasTakenExam())
        {
            output += "\n\nSAT Exam: " + satScore;
        }
        if(hasWorkExperience())
        {
            output += "\n\nWork Experience: " + workExperience;
        }
        return output;
    }

} //end of Generator Class
