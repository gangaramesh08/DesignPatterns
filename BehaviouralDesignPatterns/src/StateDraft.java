public class StateDraft implements StateIDocumentStages {
    public static StateDraft INSTANCE = new StateDraft();
    StateIDocumentStages state;

    @Override
    public void render(String role,StateDocument document) {
        System.out.println("Your changes are drafted and send for Moderation.");
        this.state = StateModeration.INSTANCE;
        if(document.getCurrentState()==StateEnum.NEW) {
            document.setCurrentState(StateEnum.DRAFT);
            state.render(role, document);
        }
    }


}
