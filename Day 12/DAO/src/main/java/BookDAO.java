public interface BookDAO {
{

	    public List<Book> getAllBooks();
	    public void addBook(Book book);
	    public Book getBookByIsbn(int isbn);
	    public void updateBook();
	
}
