package login_app.models;

public class User {
    private String username;
    private String password;

    public void setPassword(String password) {
        this.password = password;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
//tdk ada setter artinya setelah objek user dibuat, nilai username dan pasword
//tidak bisa diubah dari luar. Ini bisa jadi pilihan desain untuk alasan keamannan atau agar data user tetap konsisten