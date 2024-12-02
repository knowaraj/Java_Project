package com.lproject.LibraryMS.service;

public interface AuthService {
    String login(String username, String password);
    boolean changePassword(String oldpassword, String newpassword);
}
