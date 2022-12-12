package movies;

public class Movie {

    private String name;
    private String category;

    public Movie (String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String getName () {
        return name;
    }

    public void setName (String newName) {
        this.name = newName;
    }

    public void getCategory(String newCategory) {
        this.category = newCategory;
    }



}
