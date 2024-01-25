package behavioral.Mediator;

public class SimpleChatRunner {
    public static void main(String[] args) {
        SimpleTextChat simpleTextChat= new SimpleTextChat();
        AdminUser admin = new AdminUser(simpleTextChat,"Admin");

        AdminUser user1 = new AdminUser(simpleTextChat,"user1");
        AdminUser user2 = new AdminUser(simpleTextChat,"user2");

        simpleTextChat.setAdmin(admin);
        simpleTextChat.addUser(user1);
        simpleTextChat.addUser(user2);

        user1.sendMessage("hello");
        user2.sendMessage("hello");
        admin.sendMessage("hello");
    }
}
