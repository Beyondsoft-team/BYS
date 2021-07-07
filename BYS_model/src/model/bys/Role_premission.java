package model.bys;

public class Role_premission {

    private Integer Role_id;

    private Integer Permission_id;

    public Role_premission() {
    }

    public Role_premission(Integer role_id, Integer permission_id) {
        Role_id = role_id;
        Permission_id = permission_id;
    }

    public Integer getRole_id() {
        return Role_id;
    }

    public void setRole_id(Integer role_id) {
        Role_id = role_id;
    }

    public Integer getPermission_id() {
        return Permission_id;
    }

    public void setPermission_id(Integer permission_id) {
        Permission_id = permission_id;
    }
}
