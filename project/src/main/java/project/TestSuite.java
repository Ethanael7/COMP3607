package project;

import java.util.ArrayList;
import java.util.List;

public class TestSuite {
    private List<TestStrategy> tests = new ArrayList<>();

    public void addTest(TestStrategy test) {
        tests.add(test);
    }

    public List<TestResult> runTests(ChatBot bot) {
        List<TestResult> results = new ArrayList<>();
        for (TestStrategy test : tests) {
            results.add(test.runTest(bot));
        }
        return results;
    }
}

