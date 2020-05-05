public class MementoOriginator {
    String state;

    public MementoOriginator(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public MementoMemento add() {
        return new MementoMemento(state);
    }

    public void fetch(MementoMemento memento){
        System.out.println("Reverted back to Previous state : "+memento.getState());
        this.setState(memento.getState());
    }
}
