package ru.gb.service;

import org.springframework.session.Session;


public interface ISessionManager<S extends Session> {

    S createSession();

    void save(S session);

    S findById(String id);

    void deleteById(String id);

    void deleteSessionExceptCurrentByUser(String username);
}