import java.util.ArrayList;
import java.lang.Thread;
import java.util.Scanner;

public class ResumeTester
{
    public static void main(String[] args) throws InterruptedException
    {
      Scanner userInput = new Scanner(System.in); 
      ArrayList<Integer> gradeSequence = new ArrayList<>();
       //Test Cases
       /*
        Student test = new Student("Ian Bustamante");
        Student testTwo = new Student("Ian Bustamante", 16, "2 / 24 / 2009");
        System.out.println(test.toNameString());
        System.out.println(testTwo.toString());
        */
        
        //Introduction to Generator
        System.out.println("Hello. Welcome to the Academic Resume Generator. \nTo begin, please enter, 'c' for continue.");
        String output = userInput.nextLine();
        while(!output.equals("c")){
            output = userInput.nextLine();
        }
        //Begins Generator only if user puts 'c' ; Form of Exception Handling
        if(output.equals("c"))
        {
            System.out.print("\u001b[H\u001b[2J");
            
            System.out.println("Preparing Generator.... \nNote: Once you begin, you will not be able to stop the generator onward. Please complete all prompts. \nDO NOT type anything here.");
            
            Thread.sleep(5000);
            
            System.out.print("\u001b[H\u001b[2J");
            
            //Gathering Insight on Student's Personal Information
            System.out.println("What is your name?");
        
            String name = userInput.nextLine();
            
            System.out.println("\nWhat is your birthdate? (Example: 1/21/2009)");
            
            String birthDate = userInput.nextLine();
            
            System.out.println("\nWhat is your age?");
            
           //Exception Handling for Age
            int age = 0;
            boolean ageException = true;
            while(ageException == true)
            {
                try
                {
                    age = userInput.nextInt();
                    ageException = false;
                }
                
                catch(Exception e)
                {
                    System.out.println("Error in callibration. Please enter a valid age number. Ex: 9\n" + e);
                }
                    userInput.nextLine();
            }
            System.out.println("\nFinally, what is your grade level?");
            
            //Exception Handling for Grade Level
            int gradeLevel = 0;
            boolean gradeException = true;
            while(gradeException == true)
            {
                try 
                {
                    gradeLevel = userInput.nextInt();
                    gradeException = false;
                }
                
            
                catch(Exception e)
                {
                    System.out.println("Error. Please enter a valid number... (in integer notation!) \n" + e);
                }
                    userInput.nextLine();
            }
            
          //Creating Student Object with Data
           Student student = new Student(name, age, birthDate, gradeLevel);
            
            //Gathering Data on Student's Academic Performance (a.k.a. The Hardest Part of All)
            System.out.print("\u001b[H\u001b[2J");
            System.out.println("Processing....");
            Thread.sleep(5000);
            System.out.print("\u001b[H\u001b[2J");
            
            System.out.println("Are you currently taking 5, 6, or 7 classes? (We will be using this to calculate your unweighted GPA.)");
            int numClasses = userInput.nextInt();
            
            System.out.println("\nPlease specify your grades from a scale of 0 - 4 in a \nsequence, one digit at a time by pressing 'enter' after inputting each number. \nNote: 0 = F ; 1 = D ; 2 = C ; 3 = B ; 4 = A \nExample: \n4 \n3 \n4 \n4 \n3 \n4 - Indicates: A, B, A, A, B, A\n");
            
            //Callibrating number of inputs pending on value of numClasses
            if(numClasses == 5)
            {
                int grade1 = userInput.nextInt();
                int grade2 = userInput.nextInt();
                int grade3 = userInput.nextInt();
                int grade4 = userInput.nextInt();
                int grade5 = userInput.nextInt();
                int[] grades = {grade1, grade2, grade3, grade4, grade5};
                for(int grade : grades)
                {
                    gradeSequence.add(grade);
                }
                System.out.print("\u001b[H\u001b[2J");
            }
            if(numClasses == 6)
            {
                int grade1 = userInput.nextInt();
                int grade2 = userInput.nextInt();
                int grade3 = userInput.nextInt();
                int grade4 = userInput.nextInt();
                int grade5 = userInput.nextInt();
                int grade6 = userInput.nextInt();
                int[] grades = {grade1, grade2, grade3, grade4, grade5, grade6};
                for(int grade : grades)
                {
                    gradeSequence.add(grade);
                }
                System.out.print("\u001b[H\u001b[2J");
            }
            else if(numClasses == 7)
            {
                int grade1 = userInput.nextInt();
                int grade2 = userInput.nextInt();
                int grade3 = userInput.nextInt();
                int grade4 = userInput.nextInt();
                int grade5 = userInput.nextInt();
                int grade6 = userInput.nextInt();
                int grade7 = userInput.nextInt();
                int[] grades = {grade1, grade2, grade3, grade4, grade5, grade6, grade7};
                for(int grade : grades)
                {
                    gradeSequence.add(grade);
                }
                
                System.out.print("\u001b[H\u001b[2J");
            }
            //end of callibration sequence
            
                //Gathering Insights on Student - SAT / Work Experience
                System.out.println("The generator will now be asking you a series of questions. \n\nPlease  type, 'y', for yes, and 'n' for no, \npending on the prompts. \nDO NOT TYPE ANYTHING HERE.");
                Thread.sleep(5000);
                System.out.print("\u001b[H\u001b[2J");
                
                System.out.println("Have you taken any exams involving the SAT?");
                userInput.nextLine();
                String sat = userInput.nextLine();
                //Program is ran if Student did take SAT
                if(sat.equals("y") || sat.length()==3)
                {
                    boolean hasTaken = true; 
                    System.out.println("What was your score? (Please input as an integer.)");
                    int satScore = userInput.nextInt();
                    userInput.nextLine();
                    
                    System.out.println("Finally, do you have any notable work experience?");
                    String work = userInput.nextLine();
                    if(work.equals("y") || work.length()==3)
                    {
                        boolean hasWork = true;
                        System.out.println("What work have you conducted or have been employed in? (Be as descriptive as you wish.) \n\nIf you have not been involved in any work, please put, 'N/A'.");
                        String workExperience = userInput.nextLine();
                        Generator performance = new Generator(name, numClasses, gradeSequence, hasTaken, hasWork, satScore, workExperience);
                        //Testing Output: System.out.println(performance.toString());
                        System.out.print("\u001b[H\u001b[2J");
                        System.out.println("Calibrating Final Data....");
                        Thread.sleep(5000);
                        System.out.print("\u001b[H\u001b[2J");
                        System.out.println(performance.generateAcademicResume(student, gradeSequence));
                        Thread.sleep(8000);
                        //Pitiful Way of Incorporating Polymorphism - I know this is seemingly trivial, but hope you would consider accepting this.
                        Student academics = new Generator(name, numClasses, gradeSequence, hasTaken, hasWork, workExperience);
                        System.out.println("\u001b[H\u001b[2J");
                        System.out.println("Thank you " + academics.getName() + " for using this generator! \nWe appreciate it more than you know!");
                    }
                    else
                    {
                    boolean hasWork = false;
                    String workExperience = "N/A";
                    Generator performance = new Generator(name, numClasses, gradeSequence, hasTaken, hasWork, satScore, workExperience);
                    System.out.print("\u001b[H\u001b[2J");
                    System.out.println("Calibrating Final Data....");
                    Thread.sleep(5000);
                    System.out.print("\u001b[H\u001b[2J");
                    System.out.println(performance.generateAcademicResume(student, gradeSequence));
                    Thread.sleep(8000);
                    
                    Student academics = new Generator(name, numClasses, gradeSequence, hasTaken, hasWork, workExperience);
                    System.out.println("\u001b[H\u001b[2J");
                    System.out.println("Thank you " + academics.getName() + " for using this generator! \nWe appreciate it more than you know!");
                    }
                }
                //Program is Ran if Student did not take SAT
                else if(sat.equals("n") || sat.length() == 2)
                {
                    boolean hasTaken = false;
                    System.out.println("Finally, do you have any notable work experience?");
                    String work = userInput.nextLine();
                    if(work.equals("y") || work.length()==3)
                    {
                        boolean hasWork = true;
                        System.out.println("What work have you conducted or have been employed in? (Be as descriptive as you wish.) \n\nIf you have not been involved in any work, please put, 'N/A'.");
                        String workExperience = userInput.nextLine();
                        Generator performance =  new Generator(name, numClasses, gradeSequence, hasTaken, hasWork, workExperience);
                        //Testing Output: System.out.println(performance.toString());
                        System.out.print("\u001b[H\u001b[2J");
                        System.out.println("Calibrating Final Data....");
                        Thread.sleep(5000);
                        System.out.print("\u001b[H\u001b[2J");
                        System.out.println(performance.generateAcademicResume(student, gradeSequence));
                        Thread.sleep(8000);
                        
                        Student academics = new Generator(name, numClasses, gradeSequence, hasTaken, hasWork, workExperience);
                        System.out.println("\u001b[H\u001b[2J");
                        System.out.println("Thank you " + academics.getName() + " for using this generator! \nWe appreciate it more than you know!");
                    }
                    else
                    {
                        boolean hasWork = false;
                        String workExperience = "N/A";
                        Generator performance  = new Generator(name, numClasses, gradeSequence, hasTaken, hasWork, workExperience);
                        //Testing Output: System.out.println(performance.toString());
                        System.out.print("\u001b[H\u001b[2J");
                        System.out.print("Calibrating Final Data....");
                        Thread.sleep(5000);
                        System.out.print("\u001b[H\u001b[2J");
                        System.out.println(performance.generateAcademicResume(student, gradeSequence));
                        Thread.sleep(8000);
                        
                        Student academics = new Generator(name, numClasses, gradeSequence, hasTaken, hasWork, workExperience);
                        System.out.println("\u001b[H\u001b[2J");
                        System.out.println("Thank you " + academics.getName() + " for using this generator! \nWe appreciate it more than you know!");
                    } 
                }//end of gathering data on SAT / Work Experience
            }
        }//end of Main Method
}//end of ResumeTester
