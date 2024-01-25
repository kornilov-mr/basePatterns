package behavioral.Mediator;

public class AdminUser implements User{
    Chat chat;
    String name;

    public AdminUser(Chat chat, String name) {
        this.chat = chat;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sendMessage(String text) {
        chat.sendMessage(text,this);
    }

    @Override
    public void getMessage(String text) {
        System.out.println(this.name + " received: "+ text);
    }
}
