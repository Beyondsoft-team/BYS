package model.bys;

public class Permission {

    private Integer Id;

    private String Title;

    private String Action;

    public Permission() {
    }

    public Permission(Integer id, String title) {
        Id = id;
        Title = title;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getAction() {
        return Action;
    }

    public void setAction(String action) {
        Action = action;
    }
}
