
/**
 * Write a description of class Regular here.
 *
 * @author (BISHWASH CHAUDHARY)
 * @version (2023-05-05)
 */
/* creating a clild class which inherits the 
 * parent class Students using a keyword called ectends
 */
public class Regular extends Students
{
   //declaring instance variable with common access modifier 
  private int numOfModules;
  private int numOfCreditHours;
  private double daysPresent;
  private boolean isGrantedScholarship;
//creating a constructor same name as class name with ten parameters
 public Regular(String dateOfBirth, String studentName, int courseDuration,double tuitionFee, int numOfModules,
 int numOfCreditHours,double daysPresent,int enrollmentID, String courseName,String dateOfEnrollment)
 {
     //calling the constructor of the parent class Students using the key word super
     super(dateOfBirth,studentName,courseDuration,tuitionFee);
     super.setEnrollmentID(enrollmentID);
     super.setCourseName(courseName);
     super.setDateOfEnrollment( dateOfEnrollment);
     //declearing the parameters as instance variable
     this.numOfModules=numOfModules;
     this. numOfCreditHours= numOfCreditHours;
     this.daysPresent=daysPresent;
     this.isGrantedScholarship= false;
         
    }
    // creating getter or accessor method 
    public int getNumOfModules()
 { 
        return this.numOfModules;
    }
    public int getNumOfCreditHours()
    {
        return this.numOfCreditHours;
 }
    public double getDaysPresent()  
    {
        return this.daysPresent;
 }
 public int getEnrollmentID()
    {
        return this.enrollmentID;
    }
 public void setEnrollmentID(int enrollmentID)
    {
        this.enrollmentID=enrollmentID;
    }
    public boolean  getIsGrantedScholarship ()
    {
       return this. isGrantedScholarship;
 }
 public void setDaysPresent(double daysPresent)
 {
     this.daysPresent=daysPresent;
 }
 public void setIsGrantedScholarship(boolean isGrantedScholarship){
     this.isGrantedScholarship=isGrantedScholarship;
    
 }
 
 /*in this method we used nested if-else statement to display the attendance grade 
  * and we created a local variables with data type double  and another one with data type String
 */
    public String presentPercentage(double daysPresent)
     {
        double presentPercentage = (getDaysPresent() /(getCourseDuration()))*100;
        String attendanceGrade;
        if (getDaysPresent() >(getCourseDuration()*30))
    {
        System.out.println("COURSE DURATION SHOULD NOT BE LESS THAN DAYS PRESENT"); 
    }
      if (presentPercentage >= 80)
      {
      isGrantedScholarship = true;
       return "A";
      } 
     else if (presentPercentage>= 60) 
     {
       return "B";
     }     
     else if (presentPercentage >= 40) 
     {
        return "C";
     } 
     else if (presentPercentage >= 20) 
     {
         return "D";
     }
    else 
    {
        return "E";
    }
    
    
}
    public String grantCertificate(String courseName, int enrollmentID , String dateOfEnrollment)
{
        System.out.println( courseName + enrollmentID + dateOfEnrollment);
        if(isGrantedScholarship)
        {
            System.out.println("smile cause your scholarship has been granted");
        }
        return "granted";
    }
    // this method displays all the details of the Regular class
public void display()
    {
          super.display();
          System.out.println("num of modules :" + numOfModules);
          System.out.println(" num of credit hours : " + numOfCreditHours);
          System.out.println("num of day present :" + daysPresent);
         
         
        
        
    }
    
}
