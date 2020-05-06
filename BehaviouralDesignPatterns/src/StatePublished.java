public class StatePublished implements StateIDocumentStages {
    public static StatePublished INSTANCE = new StatePublished();

    @Override
    public void render(String role, StateDocument document) {
        if (document.getCurrentState() == StateEnum.MODERATION) {
            System.out.println("Available for Publishing.");
            document.setCurrentState(StateEnum.PUBLISHED);

        }
        document.publish();
    }
}
