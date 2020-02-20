package pl.connectis.projektgrupowy.response;

public class AddUserResponse extends BasicResponse {
    private Long id;

    public AddUserResponse(){

    }
public AddUserResponse(String responseMsg,Long id){
        super (responseMsg);
        this.id=id;
}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
