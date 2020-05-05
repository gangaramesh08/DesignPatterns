public interface MediatorIChatRoom {
    void addUser(MediatorUser user);

    void sendMessage(String userId, String message);
}
