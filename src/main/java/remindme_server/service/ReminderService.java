package remindme_server.service;

import remindme_server.entity.Remind;

import java.util.List;

public interface ReminderService {
    List<Remind> getAll();

    Remind getByID(long remindID);

    Remind save(Remind remind);

    void remove(long id);
}
