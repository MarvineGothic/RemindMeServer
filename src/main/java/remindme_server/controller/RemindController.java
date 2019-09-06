package remindme_server.controller;

import remindme_server.entity.Remind;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
@RequestMapping("/remind")
public class RemindController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public @ResponseBody
    Remind getReminder() {
        return createMockRemind();
    }

    private Remind createMockRemind() {
        Remind remind = new Remind();
        remind.setId(1);
        remind.setRemindDate(new Date());
        remind.setTitle("My First Remind");
        return remind;
    }
}
