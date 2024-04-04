package util.nattapat;

import java.util.Objects;
import java.util.StringJoiner;

// student id: 66130500031
// student name: nattapat lamnui
  public class Comment {
    private final String message;

    public Comment(String message) {
      this.message = message;
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj) return true;
      if (obj == null || getClass() != obj.getClass()) return false;
      return message.equals(((Comment) obj).message);
    }

    @Override
    public int hashCode() {
      return message.hashCode();
    }

    protected String getContent() {
      return message;
    }

    @Override
    public String toString() {
      return this.getClass().getSimpleName() + "(" + getContent() + ")";
    }
  }

