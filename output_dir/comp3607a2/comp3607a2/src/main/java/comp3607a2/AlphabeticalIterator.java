package comp3607a2;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AlphabeticalIterator implements SpellIterator {
    private List<SpellingAttempt> attempts;
    private int currentIndex = 0;

    public AlphabeticalIterator(List<SpellingAttempt> attempts) {
        this.attempts = attempts;
        Collections.sort(this.attempts, Comparator.comparing(SpellingAttempt::getSpellingWord));
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

