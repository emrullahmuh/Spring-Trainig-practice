package org.cydeo.Proxy;

import org.cydeo.Module.Comment;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class PushNotification implements CommentNotificationProxy {

    @Override
    public void sentComment(Comment comment) {
        System.out.println("Sending push notification "+comment);
    }
}
