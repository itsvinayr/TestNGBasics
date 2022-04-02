package contribution;

import org.testng.annotations.Test;

public class Contribution {
    @Test(groups = {"smoke"})
    public void addContribution(){
        System.out.println("Adding contribution");
    }

    @Test(enabled = false)
    public void deadContribution(){
        System.out.println("dead contribution");
    }

    @Test
    public void processContribution(){
        System.out.println("processing Contribution");
    }
}
