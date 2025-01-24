package mediator;

import java.util.HashMap;
import java.util.Map;

public class MediatorChatRoom1 implements MediatorIChatRoom {

    Map<String, MediatorUser> userMap;

    public MediatorChatRoom1() {
        this.userMap = new HashMap<>();
    }

    @Override
    public void addUser(MediatorUser user) {
        userMap.put(user.getUserId(), user);
    }

    @Override
    public void sendMessage(String userId, String message) {
        MediatorUser receiver = userMap.get(userId);
        receiver.receiveMessage(message);
    }
}
