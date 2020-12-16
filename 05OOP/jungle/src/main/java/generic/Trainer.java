package generic;

import java.util.List;

public class Trainer<T> {
  private List<T> trainees;
  public Trainer(List<T> trainees) {
    this.trainees = trainees;    
  }

  @Override
  public String toString() {
    var sb = new StringBuilder("I coach following students:\n");
    for (T trainee : this.trainees) {
      sb.append(trainee.toString());
      sb.append("\n");
    }
    return sb.toString();
  }
}