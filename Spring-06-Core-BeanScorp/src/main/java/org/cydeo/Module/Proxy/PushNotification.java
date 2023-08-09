package org.cydeo.Module.Proxy;

import org.cydeo.Module.Module.Comment;
import org.springframework.stereotype.Component;

@Component

public class PushNotification implements CommentNotificationProxy {

    @Override
    public void sentComment(Comment comment) {
        System.out.println("Sending push notification "+comment);
    }
}
