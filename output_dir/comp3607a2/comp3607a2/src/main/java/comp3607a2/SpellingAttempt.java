package comp3607a2;

import java.util.ArrayList;
import java.util.List;

public class SpellingAttempt {
    private String spellingWord;
    private String attemptedSpelling;
    private String duration;
    private boolean correct;
    private String voicePron;
    private List<StudentAction> actions;

    public SpellingAttempt( String spellingWord, String attemptedSpelling, 
                            String duration, boolean correct, String voicePron){
        this.spellingWord = spellingWord;
        this.attemptedSpelling = attemptedSpelling;
        this.duration = duration;
        this.correct = correct;
        this.voicePron = voicePron;
        actions = new ArrayList<StudentAction>();
    }
    public void addStudentAction(StudentAction a){
        actions.add(a);
    }
    public String toString(){
        return "Spelling word: "+ spellingWord + " Duration: "+ duration + " ms  Student Attempt: " + attemptedSpelling + " Correct: "+ correct + " Voice: "+voicePron+ "\n" + getAttempts();
    }
    private String getAttempts(){
        String s = "";
        for(StudentAction a: actions){
            s+= a + "\n";
        }
        return s;
    }

    public boolean isCorrect() {
        return correct;
    }

    public String getSpellingWord() {
        return spellingWord;
    }

    public int getDuration() {
        return Integer.parseInt(duration);
    }

    public int getBackspaceCount() {
        int count = 0;
        for (StudentAction action : actions) {
            if (action.getAction().equals("Backspace")) {
                count++;
            }
    }
    return count;
 }

    public int getFluency() {
        int totalSteps = actions.size();
        int wordLength = spellingWord.length(); 
    return totalSteps / wordLength;
        
    }

    public int getSteps(){
        return actions.size();
    }

}
