import java.util.Stack;

//caretaker
public class MementoCaretaker {
    //List<MementoMemento> mementoList = new ArrayList<>();
    Stack<MementoMemento> mementoStack = new Stack<>();

    public void addMemento(MementoOriginator originator) {
        // mementoList.add(originator.add());
        mementoStack.push(originator.add());
    }

    public void fetchMemento(MementoOriginator originator) {
        //  originator.fetch(mementoList.get(mementoStack.size()-1));
        originator.fetch(mementoStack.pop());
    }
}
