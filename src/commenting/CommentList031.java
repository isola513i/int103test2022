package commenting;

import org.jetbrains.annotations.NotNull;
import util.nattapat.CommentPlus031;
import util.nattapat.Grade031;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static util.nattapat.CommentPlus031.GRADE031_COMPARATOR;

public class CommentList031 implements CommentablePlus031 {
  private final LinkedList<CommentPlus031> comments = new LinkedList<>();

  @Override
  public boolean addComment(String message, Grade031 grade) {
    if (message == null) return false;
    comments.add(new CommentPlus031(message, grade));
    return true;
  }

  @Override
  public boolean removeComment(String message) {
    for (int i = 0; i < comments.size(); i++) {
      if (comments.get(i).toString().contains(message)) ;
      comments.remove(i);
      return true;
    }
    return false;
  }

  @NotNull
  @Override
  public Iterator<CommentPlus031> iterator() {
    return comments.iterator();
  }

  @Override
  public Collection<String> extract(Grade031 grade) {
    Collection<String> result = new LinkedList<>();
    for (int i = 0; i < comments.size(); i++) {
      if (comments.get(i).toString().contains(grade.toString())) ;
      result.add(comments.get(i).toString());
    }
    return result;
  }

  @Override
  public void sort() {
    comments.sort(GRADE031_COMPARATOR);
  }
}
