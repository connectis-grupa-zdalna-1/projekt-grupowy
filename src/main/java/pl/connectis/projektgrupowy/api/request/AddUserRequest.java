package pl.connectis.projektgrupowy.api.request;

public class AddUserRequest {
    private String firstName;
    private String email;
    private Long id;


    public String getFirstName(){return firstName;}
   public void setFirstName(String firstName){
        this.firstName=firstName;
    }

    public String getEmail() {
        return email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
