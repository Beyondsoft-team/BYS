package model.bys;

import java.util.Date;

public class User_role {

    private Integer Id;

    private Integer User_id;

    private Integer Role_id;

    private Date Create_time;

    public User_role() {
    }

    public User_role(Integer user_id, Integer role_id) {
        User_id = user_id;
        Role_id = role_id;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getUser_id() {
        return User_id;
    }

    public void setUser_id(Integer user_id) {
        User_id = user_id;
    }

    public Integer getRole_id() {
        return Role_id;
    }

    public void setRole_id(Integer role_id) {
        Role_id = role_id;
    }

    public Date getCreate_time() {
        return Create_time;
    }

    public void setCreate_time(Date Create_time) {
        this.Create_time = Create_time;
    }
}
