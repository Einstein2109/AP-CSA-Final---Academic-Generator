public class Student 
{
    //Instance Variables
    private String studentName;
    private int studentAge;
    private String birthDate;
    private int gradeLevel;
    
    //Student Constructor
    public Student(String studentName)
    {
        this.studentName = studentName;
    }
    
    public Student(String studentName, int studentAge, String birthDate, int gradeLevel)
    {
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.birthDate = birthDate;
        this.gradeLevel = gradeLevel;
    }
    
    //Accessor Methods
    public String getName()
    {
        return studentName;
    }
    
    public int getAge()
    {
        return studentAge;
    }
    
    public String getBirthday()
    {
        return birthDate;
    }
    
    public int getGradeLevel()
    {
        return gradeLevel;
    }
    
    //toStrings()
    public String toNameString()
    {
       return "Student Name: " + studentName;
    }
    
} //end of Student Class
