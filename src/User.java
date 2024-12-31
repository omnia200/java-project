public class User {
    private String name;
    private String role;//player,coach

    public User(String name, String role){
        this.name = name;
        this.role=role;
    }
    ////////set ,get//////////////////////
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public String getRole() {
        return role;
    }

    ////////////////////////////////////////
    public void view() {
        System.out.println("Name: "+name+  "/" + " Role: "+ role);
    }
}

