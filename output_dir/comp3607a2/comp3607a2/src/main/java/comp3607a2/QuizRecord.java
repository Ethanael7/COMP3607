package comp3607a2;

import java.util.ArrayList;
import java.util.List;

public class QuizRecord implements CreateQuiz {
    private List<SpellingAttempt> records;

    public QuizRecord() {
        records = new ArrayList<>();
        
    }

    public void addSpellingAttempt(SpellingAttempt attempt) {
        if (attempt != null)
            records.add(attempt);
    }

    @Override
    public SpellIterator createAlphabeticalIterator() {
        return new AlphabeticalIterator(records);
    }

    @Override
    public SpellIterator createCorrectIterator() {
        return new CorrectIterator(records);
    }

    @Override
    public SpellIterator createDurationIterator() {
        return new DurationIterator(records);
    }

    @Override
    public SpellIterator createFluencyIterator() {
        return new FluencyIterator(records);
    }

    @Override
    public SpellIterator createErrorCorrectionIterator() {
        return new ErrorCorrectorIterator(records);
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (SpellingAttempt a : records) {
            s.append(a).append("\n");
        }
        return s.toString();
    }

}
