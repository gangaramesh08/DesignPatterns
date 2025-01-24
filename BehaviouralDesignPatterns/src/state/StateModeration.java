package state;

public class StateModeration implements StateIDocumentStages {
    public static StateModeration INSTANCE = new StateModeration();
    StateIDocumentStages state;

    @Override
    public void render(String role, StateDocument document) {

        System.out.println("Document received for Moderation. Checking user Role....");
        if (document.getCurrentState() == StateEnum.DRAFT) {
            document.setCurrentState(StateEnum.MODERATION);
            if (role.equalsIgnoreCase("Admin")) {
                this.state = StatePublished.INSTANCE;

            } else {
                System.out.println("UnAuthorised");
                document.setCurrentState(StateEnum.DRAFT);
            }
            state.render(role, document);
        }
    }
}
