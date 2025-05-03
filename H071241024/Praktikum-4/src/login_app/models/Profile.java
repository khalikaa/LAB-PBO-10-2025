package src.login_app.models;

import src.login_app.utils.StringUtils;

public class Profile {
    private String fullName;
    private int age;
    private String hobby;
    private String nickName;

    public Profile(String fullName, int age, String hobby) {
        this.fullName = fullName;
        this.age = age;
        this.hobby = hobby;
        this.nickName = StringUtils.generateNickName(fullName);
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public String getHobby() {
        return hobby;
    }

    public String getNickName() {
        return nickName;
    }
}
