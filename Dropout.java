
/**
 * Write a description of class Dropout here.
 *
 * @author (BISHWASH CHAUDHARY)
 * @version (2023-05-05)
 */
/* we are creating a child class which inherits the parent class Students 
 * by using a keyword called extends
   */
public class Dropout extends Students
{
    /* decleration of the instance variable with a common access
     * modifier 
       */
    private int numOfRemainingModules;
    private int numOfMonthsAttended;
    private String dateOfDropout;
    private int remainingAmount;
    private boolean hasPaid;
    /* creating a constructor having the same name as class name 
     * constructor is always similar to the name of class
     * in this constructor we are providing seven parameters
       */
    public Dropout( String dateOfBirth, String studentName, int courseDuration, double tuitionFee,int  numOfRemainingModules, 
    int numOfMonthsAttended, String dateOfDropout,int enrollmentid,String coursename,String dateofenrollment)
    {
        super(dateOfBirth,studentName,courseDuration,tuitionFee);
        /*calling the constructor and setter method from the 
         * parent class by using the super keyword and also assigining the parameters as a instance variable
        */
        super.setEnrollmentID(enrollmentID);
        super. setCourseName (courseName) ;
        super.setEnrollmentID(enrollmentID);
        super.setDateOfEnrollment (dateOfEnrollment);
        this.numOfRemainingModules=numOfRemainingModules;
        this.numOfMonthsAttended=numOfMonthsAttended;
        this. dateOfDropout= dateOfDropout;
        this. remainingAmount= 0;
        this. hasPaid= false ;

    }
     // creating getter or an accessor method which helps to access the values 
    public int getNumOfRemainingModules()
    {
        return this.numOfRemainingModules;
    }

    public int getNumOfMonthsAttended()
    {
        return this.numOfMonthsAttended;
    }

    public String getDateOfDropout()
    {
        return this.dateOfDropout;
    }

    public int getRemainingAmount()
    {
        return this.remainingAmount;
    }

    public boolean getHasPaid()
    {
        return this.hasPaid;
    }
    /*creating setter or mutator method which helps to assigin the values
     * or change the value which is aassigined already
    */
    public void setNumOfRemainingModules(int numOfRemainingModules)
    {
        this.numOfRemainingModules=numOfRemainingModules;
    }
    public void setNumOfMonthsAttended(int numOfMonthsAttended)
    {
        this.numOfMonthsAttended=numOfMonthsAttended;
    }
    public void setDateOfDropout(String dateOfDropout)
    {
        this.dateOfDropout=dateOfDropout;
    }
    public void setRemainingAmount(int remainingAmount)
    {
        this.remainingAmount=remainingAmount;
    }
    //creating a method and assigining the value
    public void billsPayable()
    {
       remainingAmount=(getCourseDuration() - numOfMonthsAttended) * (int)getTuitionFee();
       hasPaid=true;
       
    }
    //creating a method and using if else condition
    public void removeStudent()
    {
        if (hasPaid) {
            this.dateOfBirth="";
            setCourseName("");
            this.studentName="";
            setDateOfEnrollment("");
            this.courseDuration=0;
            this.tuitionFee=0;
            dateOfDropout = "";
            setEnrollmentID(0);
            numOfRemainingModules= 0;
            numOfMonthsAttended = 0;
            remainingAmount = 0;
        } else {
            System.out.println("All bills are not cleared !");
        }
    }
    // creating a method which displays all the details of the dropout class
    public void dispaly()
    {
        super.display();
        System.out.println(" num of remaining modules :" + numOfRemainingModules);
        System.out.println("num ofmonth attend :"+numOfMonthsAttended );
        System.out.println("dropout date :" + dateOfDropout);
        System.out.println("remaining Amount:"+ remainingAmount);

    }

}
