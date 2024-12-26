public class Contact {
    private String name;
    private String email;
    private String info;

    public Contact(String name, String email, String info){
        this.name = name;
        this.email = email;
        this.info = info;
    }

    public String getName(){
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

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString(){
        return "Contact{" + "name=" + name + "\"" + ", email=" + email + "\"" + ", info=" + info + "}";
    }
}

