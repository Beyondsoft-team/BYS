package model.bys;

import java.util.Date;

public class User {
    private Integer Id;

    private Integer Bys_id;

    private String Bys_account;

    private Integer Sub_project_id;

    public User() {
    }

    public User(Integer id, Integer bys_id, String bys_account, Integer sub_project_id, String psw, String CName, String EName, String alias, String tel, String screen_id, String status) {
        Id = id;
        Bys_id = bys_id;
        Bys_account = bys_account;
        Sub_project_id = sub_project_id;
        Psw = psw;
        this.CName = CName;
        this.EName = EName;
        Alias = alias;
        Tel = tel;
        Screen_id = screen_id;
        Status = status;
        MS_Email = Alias.concat("@microsoft.com");
        BYS_Email = Bys_account.concat("@beyondsoft.com");
    }

    public User(Integer id, Integer bys_id, String bys_account, Integer sub_project_id, String psw, String CName, String EName, String alias, String tel, String BYS_Email, String MS_Email, String screen_id, String status) {
        Id = id;
        Bys_id = bys_id;
        Bys_account = bys_account;
        Sub_project_id = sub_project_id;
        Psw = psw;
        this.CName = CName;
        this.EName = EName;
        Alias = alias;
        Tel = tel;
        this.BYS_Email = BYS_Email;
        this.MS_Email = MS_Email;
        Screen_id = screen_id;
        Status = status;
    }

    private Date Onboard_date;

    private Date Offboard_date;

    private Date Startwork_date;

    private Date Create_time;

    private Date Update_time;

    public String toString() {
        return "user{" +
                "id=" + Id +
                ", CName='" + CName + '\'' +
                ", EName='" + EName + '\'' +
                ", Bys_id=" + Bys_id + '\'' +
                ", Sub_project_id=" + Sub_project_id + '\'' +
                ", Alias='" + Alias + '\'' +
                ", Tel=" + Tel + '\'' +
                ", BYS_Email='" + BYS_Email + '\'' +
                ", MS_Email=" + MS_Email + '\'' +
                ", Status='" + Status + '\'' +
                ", Onboard_date='" + Onboard_date + '\'' +
                ", Offboard_date='" + Offboard_date + '\'' +
                ", Startwork_date=" + Startwork_date + '\'' +
                ", Create_time=" + Create_time + '\'' +
                ", Update_time='" + Update_time +
                '}';
    }

    public Date getOnboard_date() {
        return Onboard_date;
    }

    public void setOnboard_date(Date Onboard_date) {
        this.Onboard_date = Onboard_date;
    }

    public Date getOffboard_date() {
        return Offboard_date;
    }

    public void setOffboard_date(Date Offboard_date) {
        this.Offboard_date = Offboard_date;
    }

    public Date getStartwork_date() {
        return Startwork_date;
    }

    public void setStartwork_date(Date Startwork_date) {
        this.Startwork_date = Startwork_date;
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

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getBys_id() {
        return Bys_id;
    }

    public void setBys_id(Integer bys_id) {
        Bys_id = bys_id;
    }

    private String Psw;

    private String Token;

    private String CName;

    private String EName;

    private String Alias;

    private String Tel;

    private String BYS_Email;

    private String MS_Email;

    private String Screen_id;

    private String Status;

    public String getBys_account() {
        return Bys_account;
    }

    public void setBys_account(String bys_account) {
        Bys_account = bys_account;
    }

    public Integer getSub_project_id() {
        return Sub_project_id;
    }

    public void setSub_project_id(Integer sub_project_id) {
        Sub_project_id = sub_project_id;
    }

    public String getPsw() {
        return Psw;
    }

    public void setPsw(String psw) {
        Psw = psw;
    }

    public String getToken() {
        return Token;
    }

    public void setToken(String token) {
        Token = token;
    }

    public String getCName() {
        return CName;
    }

    public void setCName(String CName) {
        this.CName = CName;
    }

    public String getEName() {
        return EName;
    }

    public void setEName(String EName) {
        this.EName = EName;
    }

    public String getAlias() {
        return Alias;
    }

    public void setAlias(String alias) {
        Alias = alias;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String tel) {
        Tel = tel;
    }

    public String getBYS_Email() {
        return BYS_Email;
    }

    public void setBYS_Email(String BYS_Email) {
        this.BYS_Email = BYS_Email;
    }

    public String getMS_Email() {
        return MS_Email;
    }

    public void setMS_Email(String MS_Email) {
        this.MS_Email = MS_Email;
    }

    public String getScreen_id() {
        return Screen_id;
    }

    public void setScreen_id(String screen_id) {
        Screen_id = screen_id;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }
}