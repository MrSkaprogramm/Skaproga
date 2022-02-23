import java.io.Serializable;

public class GenerateWord implements Serializable{
  /**
   * 
   */
  private static final long serialVersionUID = 2299562972281300207L;

  public String generateRandomWord() {
    String letters = "abcdefghijklmnopqrstuvwxyz";

    char[] randomWord = new char[(int) (Math.random() * 10 + 1)];
    for (int i = 0; i < randomWord.length; i++) {
      randomWord[i] = letters.charAt((int) (Math.random() * letters.length()));
    }
    randomWord[0] = Character.toUpperCase(randomWord[0]);
    return new String(randomWord);
  }
}
