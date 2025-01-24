package memento;

public class MementoDemo {
    public static void main(String[] args) {
        MementoOriginator originator = new MementoOriginator("State1");
        System.out.println("State now : " + originator.getState());
        MementoCaretaker caretaker = new MementoCaretaker();
        caretaker.addMemento(originator);
        originator.setState("State 2");
        caretaker.addMemento(originator);
        originator.setState("State 3");
        System.out.println("State now : " + originator.getState());
        caretaker.fetchMemento(originator);
        caretaker.fetchMemento(originator);
    }
}
