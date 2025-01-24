package state;

public class StateDemo {
    public static void main(String[] args) {
        StateDocument document = new StateDocument("Learning Materials");
        document.write("This is my content.");
        StateUser user = new StateUser("1", "Ganga", "Admin");
        user.addDocument(document);
        user.render();

        StateDocument document2 = new StateDocument("Python");
        document2.write("Would not be printed.");
        StateUser user1 = new StateUser("2", "Ashwin", "User");
        user1.addDocument(document2);
        user1.render();
    }
}
