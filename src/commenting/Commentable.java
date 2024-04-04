package commenting;


import util.nattapat.CommentPlus031;
import util.nattapat.Grade031;

import java.util.Collection;
import java.util.Iterator;

// student id: 99999999999
// student name: kriengkrai porkaew
public interface Commentable extends Iterable<CommentPlus031> {
  default boolean addComment(String message) {
    return addComment(message, null);
  }

  boolean addComment(String message, Grade031 grade);

  boolean removeComment(String message);

  Iterator<CommentPlus031> iterator();

  Collection<String> extract(Grade031 grade);

  void sort();
}

