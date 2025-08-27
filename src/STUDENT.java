public class STUDENT

{

    int rollno;
    String name ;
           STUDENT( int r,String n){
    this.rollno = r;
    this.name = n;


    }
STUDENT(STUDENT s)
{
    rollno=s.rollno;
    name=s.name;
}
    public void display()
    {
        System.out.println("Roll No"+ rollno);
        System.out.println("Name is "+ name);
    }
}
