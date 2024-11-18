package comp3607a2;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CorrectIterator implements SpellIterator {
    private List<SpellingAttempt> attempts;
    private int currentIndex = 0;

    public CorrectIterator(List<SpellingAttempt> attempts) {
        
        this.attempts = attempts.stream()
            .filter(SpellingAttempt::isCorrect)
            .sorted(Comparator.comparing(SpellingAttempt::getSpellingWord))
            .collect(Collectors.toList());
    }

    @Override
    public boolean hasNext() {
        return currentIndex < attempts.size();
    }

    @Override
    public SpellingAttempt next() {
        return attempts.get(currentIndex++);
    }

    @Override
    public int getLength() {
        return attempts.size();
    }
}
