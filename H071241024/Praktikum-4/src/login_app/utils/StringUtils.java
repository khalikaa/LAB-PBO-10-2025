package src.login_app.utils;

public class StringUtils {
    public static String generateNickName(String fullName) {
        String[] parts = fullName.trim().split(" ");
        return (parts.length > 1) ? parts[1] : fullName;
    }
}
