 class LibraryItem {
    private String title;
    private int itemID;

    public LibraryItem(String title, int itemID) {
        this.title = title;
        this.itemID = itemID;
    }
     public void displayInfo(){
         System.out.println("Title:  " + title);
         System.out.println("Item ID:  " + itemID);

    }

    public String getTitle() {
        return title;
    }

    public int getItemID() {
        return itemID;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }
}
class Book extends LibraryItem{
   private String author;



    public Book(String author, String title, int itemID) {
        super(title, itemID);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author"+ author);
    }
}
class DVD extends LibraryItem{
     private int duration;

    public DVD(String title,int itemID, int duration) {
        super(title,itemID);
        this.duration=duration;
    }

    public int getDuration() {
        return duration;
    }

  /*  public void setDuration(int duration) {
        this.duration = duration;
    }*/

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Duration" + duration);
    }
}
  abstract class LibraryMember{
    private int memberId ;
    private String name;

     public LibraryMember(int memberId, String name) {
         this.memberId = memberId;
         this.name = name;
     }

     public String getName() {
         return name;
     }

     public abstract void borrowItem(LibraryItem item);
}
class  StudentMember extends LibraryMember{

    public StudentMember(int memberId, String name) {
        super(memberId, name);
    }

    @Override
    public void borrowItem(LibraryItem item) {
        System.out.println("student "+getName() +"borrows"+item.getTitle());
    }
}
 class FacultyMember extends LibraryMember{
    public FacultyMember(int memberId, String name) {
        super(memberId, name);
    }

    @Override
    public void borrowItem(LibraryItem item) {
        System.out.println("faculty member"+ getName()+" is borrowing"+item.getTitle());
    }
}
  interface Reservable{
    void reserveItem(LibraryItem item);
}
public class Library {
    public static void main(String[] args) {
        Book b = new Book("   p", "  xyz",   8);
        DVD d = new DVD(" q",    9,    2);
        LibraryItem[] items = {b, d};
        for (LibraryItem item : items) {
            item.displayInfo();
            System.out.println();

        LibraryMember student = new StudentMember(   1001, "   Alice");
        LibraryMember faculty = new FacultyMember(   2001, "   Dr. Smith");


        student.borrowItem(b);
        faculty.borrowItem(d);

    }
}}
