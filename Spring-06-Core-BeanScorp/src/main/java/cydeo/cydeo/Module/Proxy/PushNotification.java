package cydeo.cydeo.Module.Proxy;

import cydeo.cydeo.Module.Module.Comment;
import org.springframework.stereotype.Component;

@Component

public class PushNotification implements CommentNotificationProxy {

    @Override
    public void sentComment(Comment comment) {
        System.out.println("Sending push notification "+comment);
    }
}
