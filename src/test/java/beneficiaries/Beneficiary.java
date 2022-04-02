package beneficiaries;

import org.testng.annotations.*;

public class Beneficiary {

    @BeforeSuite
    public void runBeforeSuite(){
        System.out.println("run before suite");
    }

    @BeforeTest
    public void runBeforeTest(){
        System.out.println("run before test tag");
    }

    @BeforeClass
    public void runBeforeClass(){
        System.out.println("run before class");
    }

    @BeforeMethod
    public void runBeforeMethod(){
        System.out.println("run before method");
    }

    @Test(groups = {"smoke"})
    public void addBeneficiary(){
        System.out.println("Adding beneficiary");
    }

    @Test(dependsOnMethods = {"addBeneficiary", "updatingBeneficiary"})
    public void deleteBeneficiary(){
        System.out.println("deleting beneficiary");
    }

    @Test
    public void updatingBeneficiary(){
        System.out.println("updating beneficiary");
    }

    @AfterSuite
    public void runAfterSuite(){
        System.out.println("run after suite");
    }

    @AfterTest
    public void runAfterTest(){
        System.out.println("run after test tag");
    }

    @AfterClass
    public void runAfterClass(){
        System.out.println("run after class");
    }

    @AfterMethod
    public void runAfterMethod(){
        System.out.println("run after method");
    }
}
