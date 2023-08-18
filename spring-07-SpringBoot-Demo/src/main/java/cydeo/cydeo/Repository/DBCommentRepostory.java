package cydeo.cydeo.Repository;

import cydeo.cydeo.Module.Comment;
import org.springframework.stereotype.Component;

@Component
public class DBCommentRepostory implements CommentRepository{
    @Override
    public void storeComment(Comment comment) {
        System.out.println("storing comment "+comment.getText());
    }
}
