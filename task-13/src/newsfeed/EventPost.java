import java.time.*;




public class EventPost extends Post {

    String title = "";
    String location = "";
   public LocalDate date = LocalDate.of(2021, 1, 1);


    public EventPost(String author, String title, String location, LocalDate date)
    {
        super(author);
        this.title = title;
        this.location = location;
        this.date = date;
    }

    public void display()
    {
        System.out.println("  " + title );
        System.out.println("  " + location);
        System.out.println("  " + date);
        System.out.println("*********************");
        super.display();
    }





}