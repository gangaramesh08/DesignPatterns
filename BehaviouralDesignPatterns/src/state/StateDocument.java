package state;

public class StateDocument {
    String documentName;
    String content;
    StateEnum currentState;
    StateIDocumentStages state;

    public StateEnum getCurrentState() {
        return currentState;
    }

    public void setCurrentState(StateEnum currentState) {
        this.currentState = currentState;
    }

    public StateDocument(String documentName) {
        this.documentName = documentName;
        this.currentState = StateEnum.NEW;
    }

    public void render(String role, StateDocument document) {
        this.state = StateDraft.INSTANCE;
        state.render(role, document);
    }

    public void publish() {
        if (currentState == StateEnum.PUBLISHED) {
            System.out.println(content);
        } else {
            System.out.println("Cannot be published. Current Status  :" + currentState);
        }
    }

    public void write(String content) {
        this.content = content;
    }
}
