import org.scalatest._

class UnitTestExe extends FunSuite {

  test("Testing is a sum of two numbers is equal to a already defined result") {
    assert(1 + 2 === 3)
  }

  // Using FlatSpec and Matchers
  //it "Some text" in { }
  //  1 + 2 should be (32)
}