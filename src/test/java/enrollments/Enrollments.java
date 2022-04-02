package enrollments;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Enrollments {
    @Test(groups = {"smoke"})
    public void addHSA(){
        System.out.println("Adding HSA account");
    }

    @Test(dataProvider ="getEnrollmentData")
    public void addFSA(String id, String name){
        System.out.println("Adding FSA account");
        System.out.println(id+"--"+name);
    }

    @Test
    public void cipPassHSA(){
        System.out.println("do a CIP pass");
    }

    @DataProvider(name = "getEnrollmentData")
    public Object[][] getData(){
        return new Object[][]{
            {"23", "arjun"},
            {"24", "vinay"},
            {"25", "venu"}
        };
    }
}
