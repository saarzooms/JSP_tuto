package models;

public class Users {
    String userName;
    String pwd;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public boolean validate(){
        if(pwd.equals(userName)){
            return true;
        }
        else
            return false;
    }
}
