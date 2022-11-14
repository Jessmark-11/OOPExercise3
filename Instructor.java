public class Instructor{
    public static void main(String[]args){
    Student student;
    StudentCard card1,card2;
    
    Instructor=new Student();
    student.setName("Jessa Java");
    student.setEmail("jessa@gmail.com");
    
    card1=new Student();
    card1.setOwner(Student);
    card1.checkOut(3);

    card2=new StudentCard();
    card2.setOwner(student);//the same student is the owner of the second card,too
    
    System.out.println(Card1 Info:);
    System.out.println(card1.toString() + "\n");
    
    System.out.println("Card2 Info:");
    System.out.println(card2.toString() + "\");
  }
}  
