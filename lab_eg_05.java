5. An educational institution provides stipends for post-graduate students every year. For calculating the stipend, the institution has fixed a base amount of $100 which is provided to all the students. The students who perform exceptionally well during the academics get an extra amount based on their performance. You need to help the institution in developing an application for calculating the stipend by implementing the class using info given below. Note: STIPEND is a final variable.
calculateTotalStipend():-Calculate and return the total stipend amount based on the aggregate marks of the student using the below table. Implement the getter and setter methods appropriately.	
i)  Aggregate marks>=85 and <90 then bonus stipend amt is $10  
ii) Aggregate marks>=90 and <95 then bonus stipend amt is $15
iii) Aggregate marks>=95 and <100 then bonus stipend amt is $20  
sample input:  student ID:1212                                                                                                                                                                                                                                                                    aggregate marks :93                                                                                                                                                                                                                                                                                                         output: the final stipend of 1212 is $115.0

public class Ritesh {
    private int STIPEND = 100 ;
    private int studentId;
    private int aggregateMarks;
    double calculateTotalStipend;
    
    public FinalStudent (){
    this.STIPEND = STIPEND;
    this.studentId = studentId;
    this.aggregateMarks = aggregateMarks;
    }
    
    
    public int getStudentId() {
    return studentId;
    }
    public void setStudentId(int studentId) {
    this.studentId = studentId ;
    }
    public int getSTIPEND(){
    return STIPEND;
    }
    public void setSTIPEND(int STIPEND) {
    this.STIPEND = STIPEND;
    }
    
    public double calculateTotalStipend() {
    if(getaggregateMarks() >= 85 && getaggregateMarks() < 90) {
    return STIPEND +10;
    }
    else if(getaggregateMarks() >= 90 && getaggregateMarks() < 95) {
    return STIPEND +15;
    }
    else if(getaggregateMarks() >= 95 && getaggregateMarks() < 100) {
    return STIPEND +20;
    }
    else return STIPEND ;
    }
    
    public int getaggregateMarks() {
    return aggregateMarks;
    }
    
    public void setaggregateMarks(int aggregateMarks) {
    this.aggregateMarks = aggregateMarks;
    }
    }
    
    class lab_eg_05 {
    
    public static void main(String[] args) {
    FinalStudent student1 = new FinalStudent() ;
    student1.setStudentId(1212);
    student1.setaggregateMarks(93);
    
    double totalStipend = student1.calculateTotalStipend();
    System.out.println("The final stipend of " + student1.getstudentId()+" is $" + totalStipend);
    
    
    }
    }
    
