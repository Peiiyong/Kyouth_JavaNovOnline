package question4;

class Book implements Comparable<Book> {
    private String title;
    private String isbn;

    public Book(String title, String isbn) {
        this.title = title;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public int compareTo(Book other) {
        return this.title.compareTo(other.title); // Sort books by title
    }

    @Override
    public String toString() {
        return "Title: " + title + ", ISBN: " + isbn;
    }
}