package cydeo.cydeo.Proxy;

import cydeo.cydeo.Module.Comment;
import org.springframework.stereotype.Component;

@Component

public class PushNotification implements CommentNotificationProxy {

    @Override
    public void sentComment(Comment comment) {
        System.out.println("Sending push notification "+comment);
    }
}
