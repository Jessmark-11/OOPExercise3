class LibraryCard{
   //Data Members
   
   //Student owner of this card
   private Student owner;
   
   //number of books borrowed
   private int borrowCnt;
   
   //Constructor
   public LibraryCard(){
       owner=null;
       borrowCnt=0;
   }
   
   //numofBooks are checked out
   public void checkOut(int numOfBooks){
       borrowCnt=borrowCnt+ numOfBooks;
   }
   
   //Returns the number of books borrowed
   public int getNumberOfBooks(){
       return borrowCnt;
   }  
   
   //Returns the name of the  owner of this card
   public String getOwnerName(){
       return owner.getName();
   }
   
   //Sets owner of this card to student
   public void set Owner(Student student){
       owner=student;
   }
   
   //Returns the string representation of this card
   @Override
   public String toString(){
       return"Owner Name:"+ owner.getName()+"\n"
             +"Email:"+ owner.getEmail()+"\n"
             +"Books Borrowed:+ borrowCnt;
   }  
}  
