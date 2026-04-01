// BookController.java — CONTROLLER [30 pts]
// Responsibility: Coordinates between the Model (Book) and the View (BookView).
// Rule: Keep this class THIN. It validates and delegates — it does not store
// or display data directly.
public class BookController {
// TODO (1): Declare two private fields:
// - model (Book)
// - view (BookView)
private book model;
private bookView view;
// TODO (2): Write a constructor that accepts a Book and a BookView
// and assigns them to the fields above.
public BookController(book model, bookView view) {
this.model = model;
this.view = view;
}
// TODO (3): Write a method called updateYear that accepts:
// - newYear (int)
// Logic:
// - If newYear is between 1000 and 2100 (inclusive):
// • Call model.setYear(newYear)
// • Call view.displayMessage("Year updated.")
// - Otherwise:
// • Call view.displayMessage("Invalid year.")
public void updateYear(int newYear) {
if (newYear >= 1000 && newYear <+ 2100) {
model.setYear(newYear);
view.displayMessage("Year Updated");
} else {
view.displayMessage("Invalid Year");
}
}
// TODO (4): Write a method called showBook.
// It should retrieve the title, author, and year from the model
// and pass them to view.displayBook(...).
public void showBook() {
String title = model.getTitle();
String author = model.getAuthor();
int year = model.getYear();
view.displayBook(title, author, year);
}
}