public class MediatorDemo {
    public static void main(String[] args) {
        MediatorIChatRoom room1 = new MediatorChatRoom1();
        MediatorUser user1 = new MediatorUser(room1, "ID1", "Ashwin");
        MediatorUser user2 = new MediatorUser(room1, "ID2", "Bibin");
        MediatorUser user3 = new MediatorUser(room1, "ID3", "Carlose");

        // Adding users to ChatRoom


        room1.addUser(user1);
        room1.addUser(user2);
        room1.addUser(user3);
        user1.sendMessage("ID2", "Hello There");
        user2.sendMessage("ID1", "Hey Buddy");
    }
}
