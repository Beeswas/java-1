
/**
 * Write a description of class Students here.
 *
 * @author (BISHWASH CHAUDHARY)
 * @version (2023-05-05)
 */
public class Students//creating a parent class 
{
    /* declaring the instance variable of the Student class
     * declearing the access modifier to protected for all variables
     */
    protected int enrollmentID;
    protected String dateOfBirth;
    protected String courseName;
    protected String studentName;
    protected String dateOfEnrollment;
    protected int courseDuration;
    protected double tuitionFee;
    /*creating a constructor which has similar name as the class name 
     * and assigining the parameters inside the constructor
     */
    public Students(String dateOfBirth, String studentName, int courseDuration,double tuitionFee)
    {
        this.enrollmentID= 0;/* here we are assigining the paramater as a instance variable and assigining some variables value
        to a empty string and zero
        */
        this.dateOfBirth=dateOfBirth;
        this.courseName= "";
        this.studentName= studentName;
        this.dateOfEnrollment= "";
        this.courseDuration=courseDuration;
        this.tuitionFee=tuitionFee;
        
    }
    // creating a getter or an accessor method for all the parameters of the constructor
    public int getEnrollmentID()
    {
        return this.enrollmentID;
    }
    
    public String getDateOfBirth()
    {
        return this.dateOfBirth;
    }
    public String getCourseName()
    {
        return this.courseName;
    }
    public String getStudentName()
    {
       return this.studentName;
    }
    public String getDateOfEnrollment()
    {
      return this.dateOfEnrollment; 
    }
    public int getCourseDuration()
    {
        return this.courseDuration;
    }
    public double getTuitionFee()
    {
        return this.tuitionFee;
    }
    // creating a settor or an mutator method for only three parameters of the constructor 
    public void setCourseName(String courseName)
    {
       this.courseName=courseName;
    }
    public void setEnrollmentID(int enrollmentID)
    {
        this.enrollmentID=enrollmentID;
    }
    public void setDateOfEnrollment(String dateOfEnrollement)
    {
        this.dateOfEnrollment=dateOfEnrollement;
    }
    /*cretaing a method named display and inside the method we are using the if else condition and accoding to this condition 
     * the values is displayed in the screen
    */
    public void  display()     
    {
          if(enrollmentID== 0  || courseName.isEmpty() || dateOfEnrollment.isEmpty()) 
          {
              System.out.println( "all values is not been set properly");
          }
            else
          {
                 System.out.println("enrollmentid  =" + enrollmentID);
                 System.out.println("dateofbirth ="+ dateOfBirth);
                 System.out.println("course name ="+ courseName);
                 System.out.println("name of student ="+ studentName);
                 System.out.println(" enrollment date ="+ dateOfEnrollment);
                 System.out.println("cource duration ="+ courseDuration +"month");
                 System.out.println("tuition fee ="+ tuitionFee);        
          }
    }
}


