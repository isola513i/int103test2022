import commenting.CommentList031;
import util.nattapat.Grade031;

public class Main {
  public static void main(String[] args) {
    testCommentList();
  }

  private static void testCommentList() {
    CommentList031 cl = new CommentList031();
    System.out.println("Add comment 1: " + cl.addComment("So fucking stupid", Grade031.POOR));
    System.out.println("Add comment 2: " + cl.addComment("SO good", Grade031.GOOD));
    System.out.println("Add comment 3: " + cl.addComment("JUST AVERAGE", Grade031.AVERAGE));
    System.out.println("Add comment 4: " + cl.addComment("So goodddd", Grade031.GOOD));
    System.out.println("Add comment 5 (null message) : " + cl.addComment(null, Grade031.GOOD));
    System.out.println("Add comment 6 (null grade) : " + cl.addComment("terrible", null));
    System.out.println("Add comment 7 (null,null) : " + cl.addComment(null, null));
    System.out.println("add comment 8: " + cl.addComment("Poor", Grade031.POOR));
    System.out.println("add comment 9: " + cl.addComment("Poor", Grade031.POOR));
    System.out.println("add comment 10: " + cl.addComment("Poor", Grade031.POOR));
    System.out.println("\nALL Comment");
    for (var x : cl
    ) {
      System.out.println(x);
    }
    System.out.println("\nAfter sorting");
    cl.sort();
    for (var x : cl) {
      System.out.println(x);
    }

    System.out.println("\nRemove (So good) : " + cl.removeComment("So good"));
    for (var x : cl) {
      System.out.println(x);
    }

    System.out.println("extract : " + cl.extract(Grade031.POOR));
  }
}
