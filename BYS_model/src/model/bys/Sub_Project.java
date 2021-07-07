package model.bys;

import java.util.Date;

public class Sub_Project {

    private Integer Id;

    private String Name;

    private Integer Project_id;

    private String Lead;

    private Date Create_time;

    private Date Update_time;

    public Sub_Project() {
    }

    public Sub_Project(String name, Integer project_id, String lead) {
        Name = name;
        Project_id = project_id;
        Lead = lead;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getProject_id() {
        return Project_id;
    }

    public void setProject_id(Integer project_id) {
        Project_id = project_id;
    }

    public String getLead() {
        return Lead;
    }

    public void setLead(String lead) {
        Lead = lead;
    }

    public Date getCreate_time() {
        return Create_time;
    }

    public void setCreate_time(Date Create_time) {
        this.Create_time = Create_time;
    }

    public Date getUpdate_time() {
        return Update_time;
    }

    public void setUpdate_time(Date Update_time) {
        this.Update_time = Update_time;
    }
}
