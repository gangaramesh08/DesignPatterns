package mediator;

public class MediatorUser {
    String userId;
    String name;
    MediatorIChatRoom chatRoom;

    public MediatorUser(MediatorIChatRoom chatRoom, String userId, String name) {
        this.userId = userId;
        this.name = name;
        this.chatRoom = chatRoom;

    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public void sendMessage(String id2, String message) {
        System.out.println(this.getName() + " is sending message.");
        chatRoom.sendMessage(id2, message);
    }

    public void receiveMessage(String message) {
        System.out.println(this.getName() + " is receiving message ");
        System.out.println("Message :: " + message);
    }
}
