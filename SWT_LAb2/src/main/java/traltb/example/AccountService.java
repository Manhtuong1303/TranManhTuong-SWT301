/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package traltb.example;

/**
 *
 * @author Acer
 */

import java.util.regex.Pattern;

public class AccountService {
    // Biểu thức chính quy (Regex) để kiểm tra định dạng email
    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");

    public boolean isValidEmail(String email) {
        if (email == null || email.isBlank()) {
            return false;
        }
        return EMAIL_PATTERN.matcher(email).matches();
    }

    public boolean registerAccount(String username, String password, String email) {
        // Kiểm tra username không được null hoặc rỗng
        if (username == null || username.isBlank()) return false;
        
        // Kiểm tra password phải lớn hơn 6 ký tự
        if (password == null || password.length() <= 6) return false;
        
        // Kiểm tra email đúng định dạng
        if (!isValidEmail(email)) return false;
        
        // (Demo) bỏ qua phần lưu Database
        return true;
    }
}