package in.kgcoding.challange80;

public class LibraryItems {
    private String itemId;
    private String title;
    private String author;

    protected void checkOut(){
        System.out.println("successfully check out:");
    }

    protected void returnItem(){
        System.out.println("the item is returned:");
    }


}
