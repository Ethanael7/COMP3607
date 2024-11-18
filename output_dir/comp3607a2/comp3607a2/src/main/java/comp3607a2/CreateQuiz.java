package comp3607a2;
public interface CreateQuiz {
    public SpellIterator createAlphabeticalIterator();
    public SpellIterator createCorrectIterator();
    public SpellIterator createDurationIterator();
    public SpellIterator createFluencyIterator();
    public SpellIterator createErrorCorrectionIterator();
}
