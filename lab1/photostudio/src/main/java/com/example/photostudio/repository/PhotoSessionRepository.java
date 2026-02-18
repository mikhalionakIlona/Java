package com.example.photostudio.repository;

import com.example.photostudio.model.PhotoSession;
import java.time.LocalDateTime;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;;

@Repository
public class PhotoSessionRepository {
    private final List<PhotoSession> storage = new ArrayList<>();
    private final AtomicLong idGenerator = new AtomicLong(1);

    public PhotoSessionRepository() {
        save(new PhotoSession(null, "Михалёнок", "Илона", "+375(29)155-00-37", LocalDateTime.now().plusDays(1), 50,
                "Иванов Иван", "Отменена"));
        save(new PhotoSession(null, "Петрова", "Катя", "+375(29)864-55-14", LocalDateTime.now().plusDays(2), 60,
                "Иванов Иван", "Запланирована"));
        save(new PhotoSession(null, "Сурма", "Таисия", "+375(44)899-23-32", LocalDateTime.now().plusDays(3), 80,
                "Ковалькова Ирина", "Запланирована"));
        save(new PhotoSession(null, "Тасуханов", "Максим", "+375(29)741-52-63", LocalDateTime.now().plusDays(4), 60,
                "Солонович Анна", "Завершена"));
    }

    public PhotoSession save(PhotoSession photoSession) {
        if (photoSession.getId() == null) {
            photoSession.setId(idGenerator.getAndIncrement());
            storage.add(photoSession);
        } else {
            for (int i = 0; i < storage.size(); i++) {
                if (storage.get(i).getId().equals(photoSession.getId())) {
                    storage.set(i, photoSession);
                    break;
                }
            }

        }
        return photoSession;
    }

    public List<PhotoSession> findAll() {
        return new ArrayList<>(storage);
    }

    public PhotoSession findById(Long id) {
        for (PhotoSession photoSession : storage) {
            if (photoSession.getId().equals(id)) {
                return photoSession;
            }
        }
        return null;
    }

    public void deleteById(Long id) {
        storage.removeIf(photoSession -> photoSession.getId().equals(id));
    }

    public boolean existById(Long id) {
        for (PhotoSession photoSession : storage) {
            if (photoSession.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    public List<PhotoSession> findByFirstNameAndLastName(String clientName, String clientLastName) {
        List<PhotoSession> result = new ArrayList<>();
        for (PhotoSession photoSession : storage) {
            if (photoSession.getClientLastName().equalsIgnoreCase(clientLastName)
                    && (photoSession.getClientName().equalsIgnoreCase(clientLastName))) {
                result.add(photoSession);
            }
        }
        return result;
    }

    public List<PhotoSession> findByClientName(String clientName) {
        List<PhotoSession> result = new ArrayList<>();
        for (PhotoSession photoSession : storage) {
            if (photoSession.getClientName().equalsIgnoreCase(clientName)) {
                result.add(photoSession);
            }
        }
        return result;
    }

    public List<PhotoSession> findByStatus(String status) {
        List<PhotoSession> result = new ArrayList<>();
        for (PhotoSession photoSession : storage) {
            if (photoSession.getStatus().equalsIgnoreCase(status)) {
                result.add(photoSession);
            }
        }
        return result;
    }

    public List<PhotoSession> findByPhotographer(String photographer) {
        List<PhotoSession> result = new ArrayList<>();
        for (PhotoSession photoSession : storage) {
            if (photoSession.getPhotographer().equalsIgnoreCase(photographer)) {
                result.add(photoSession);
            }
        }
        return result;
    }
}
