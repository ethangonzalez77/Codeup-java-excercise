package movies;

public class Movie {

    public static void main(String[]args){

    }

    private String name;
    private String category;

    public Movie(){

    }
    public Movie(String name, String category){
        this.name = name;
        this.category = category;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setCategory(String category){
        this.name = category;
    }

    public String getName(){
        return this.name;
    }
    public String getCategory(){
        return this.category;
    }
}
