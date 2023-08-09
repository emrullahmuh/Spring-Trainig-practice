package org.cydeo.Module.Proxy;

import org.cydeo.Module.Module.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("EMAIL")//NAME=EMAIL
public class EmailCommentNotificationProxy implements CommentNotificationProxy {
    @Override
    public void sentComment(Comment comment) {
        System.out.println("Sending notification for comment"+comment.getText());
    }
}
