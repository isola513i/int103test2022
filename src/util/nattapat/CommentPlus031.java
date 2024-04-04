package util.nattapat;

import java.util.Comparator;
import java.util.StringJoiner;
import java.util.function.Predicate;

public class CommentPlus031 extends Comment{
  private final Grade031 grade031;
  public static final Comparator<CommentPlus031> GRADE031_COMPARATOR = Comparator.comparing(x -> x.grade031);
  public static Predicate<CommentPlus031> match031(Grade031 grade031){
    return x -> x.grade031.equals(grade031);
  }
  public CommentPlus031(String message, Grade031 grade031) {
    super(message==null ? "NO_COMMENT" : message);
    this.grade031 = grade031 == null ? Grade031.NONE : grade031;
  }
  @Override
  protected String getContent(){
    return getClass().getSimpleName() + "(" + super.getContent() + getContent() + ")";
  }
}
