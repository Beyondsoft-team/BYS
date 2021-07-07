package model.bys;

import java.util.Date;

public class User_Process {

    private Integer User_id;

    private Integer Process_id;

    private Integer Type_id;

    private Integer Owner_id;

    private Date Start_time;

    private Date End_time;

    public User_Process() {
    }

    public User_Process(Integer process_id, Integer type_id) {
        Process_id = process_id;
        Type_id = type_id;
    }

    public User_Process(Integer process_id, Integer type_id, Integer owner_id) {
        Process_id = process_id;
        Type_id = type_id;
        Owner_id = owner_id;
    }

    public Integer getUser_id() {
        return User_id;
    }

    public void setUser_id(Integer user_id) {
        User_id = user_id;
    }

    public Integer getProcess_id() {
        return Process_id;
    }

    public void setProcess_id(Integer process_id) {
        Process_id = process_id;
    }

    public Integer getType_id() {
        return Type_id;
    }

    public void setType_id(Integer type_id) {
        Type_id = type_id;
    }

    public Integer getOwner_id() {
        return Owner_id;
    }

    public void setOwner_id(Integer owner_id) {
        Owner_id = owner_id;
    }

    public Date getStart_time() {
        return Start_time;
    }

    public void setStart_time(Date Start_time) {
        this.Start_time = Start_time;
    }

    public Date getEnd_time() {
        return End_time;
    }

    public void setEnd_time(Date End_time) {
        this.End_time = End_time;
    }
}
