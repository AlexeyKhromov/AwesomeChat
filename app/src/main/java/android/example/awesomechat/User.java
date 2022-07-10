package android.example.awesomechat;

public class User {
    private String name;
    private String email;
    private String id;
    private int avatarMOckUpResource;

    public User(String name, String email, String id, int avatarMOckUpResource) {
        this.name = name;
        this.email = email;
        this.id = id;
        this.avatarMOckUpResource = avatarMOckUpResource;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAvatarMOckUpResource() {
        return avatarMOckUpResource;
    }

    public void setAvatarMOckUpResource(int avatarMOckUpResource) {
        this.avatarMOckUpResource = avatarMOckUpResource;
    }
}
