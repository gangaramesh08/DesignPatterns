package state;

import java.util.ArrayList;
import java.util.List;

public class StateUser {
    String userId;
    String userName;
    String role;
    List<StateDocument> documentList;



    public String getUserId() { return userId;   }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public StateUser(String userId, String userName, String role) {
        this.userId = userId;
        this.userName = userName;
        this.role = role;
        this.documentList = new ArrayList<>();
    }
    public void render(){
        documentList.forEach(document -> document.render(role,document));

    }


    public void addDocument(StateDocument document) {
        documentList.add(document);
    }
}
