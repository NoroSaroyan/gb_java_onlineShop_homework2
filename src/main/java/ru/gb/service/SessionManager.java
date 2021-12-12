package ru.gb.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.session.FindByIndexNameSessionRepository;
import org.springframework.session.Session;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;

@Service
@RequiredArgsConstructor
@Slf4j
public class SessionManager implements ISessionManager {

    private FindByIndexNameSessionRepository<Session> sessionRepository;

    @Override
    public Session createSession() {
        return null;
    }

    @Override
    public void save(Session session) {

    }

    @Override
    public Session findById(String id) {
        return null;
    }

    @Override
    public void deleteById(String id) {

    }

    @Override
    public void deleteSessionExceptCurrentByUser(String username) {
        String sessionId = RequestContextHolder.currentRequestAttributes().getSessionId();
        sessionRepository.findByPrincipalName(username)
                .keySet().stream()
                .filter(key -> !sessionId.equals(key))
                .forEach(key -> sessionRepository.deleteById((String) key));
    }
}