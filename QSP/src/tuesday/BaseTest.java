package tuesday;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest  {
 @BeforeSuite
 public void m1() {Reporter.log("@BS",true);}
 @BeforeTest
 public void m2() {Reporter.log("@BT",true);}
 @BeforeClass
 public void m3() {Reporter.log("@BC",true);}
 @BeforeMethod
 public void m4() {Reporter.log("@BM",true);}
 @AfterMethod
 public void m5() {Reporter.log("@AM",true);}
 @AfterClass
 public void m6() {Reporter.log("@AC",true);}
 @AfterTest
 public void m7() {Reporter.log("@AT",true);}
 @AfterSuite
 public void m8() {Reporter.log("@AS",true);}





}
