package commenting;

import java.util.StringJoiner;

public interface CommentablePlus031 extends Commentable {
  default String inspect031(){
    StringJoiner js = new StringJoiner(";");
    while (iterator().hasNext()){
      js.add(iterator().next().toString());
    }
    return js.toString();
  }

}
