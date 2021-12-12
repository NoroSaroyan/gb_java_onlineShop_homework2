package ru.gb.service;

public interface ISecurityService {
    boolean isAuthenticated();
    void autoLogin(String username, String password);

}