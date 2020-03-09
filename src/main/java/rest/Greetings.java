package rest;

public class Greetings {
    private final long id;
    private final String title;
    private final int year;
    private final String author;
    private final String type;


    public Greetings(long id, String title, int year, String author, String type){
        this.id = id;
        this.title = title;
        this.year = year;
        this.author = author;
        this.type = type;
    }

    public long getId(){
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String getAuthor() {
        return author;
    }

    public String getType() {
        return type;
    }
}
