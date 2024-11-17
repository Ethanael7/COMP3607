package project;
public class TestResult {
    private boolean success;
    private String message;
    private int marks;

    public TestResult(){
        this.success = false;
        this.message = "";
        this.marks = 0;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getMarks(){
        return marks;
    }

    public void setMarks(int marks){
        this.marks = marks;
    }
}
