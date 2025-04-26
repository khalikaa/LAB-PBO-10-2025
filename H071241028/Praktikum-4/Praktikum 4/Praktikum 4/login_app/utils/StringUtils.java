package login_app.utils;

public class StringUtils {
    public static String generateNickName(String fullName) {
        String[] words = fullName.trim().split("\\s+");
        if (words.length == 1) {
            return words[0];
        } else {
            return words[1];
        }
    }    
}