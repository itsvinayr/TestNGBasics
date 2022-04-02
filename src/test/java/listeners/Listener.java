package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {
    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("In listener : "+result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("In listener : "+result.getName());
    }
}
