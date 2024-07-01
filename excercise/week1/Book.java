package excercise.week1;

public class Book {
    String name;
    Author[] authors;
    double price;
    int qty;

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = 0;
    }

    public String getName() {
        return this.name;
    }

    public Author geAuthors() {
        String res = "";

        for (int i = 0; i < this.authors.length; i++) {
            res += authors[i].name;
            if(i != this.authors.length - 1) res += ",";
        }

        return res;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return this.qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String toString() {
        return Book
    }

    public String getAuthorNames() {
        String res = "";

        for (int i = 0; i < this.authors.length; i++) {
            res += authors[i].name;
            if(i != this.authors.length - 1) res += ",";
        }

        return res;
    }
}
