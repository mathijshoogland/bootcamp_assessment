import org.scalatest.FunSuite

class BootcampAssessmentTest extends FunSuite {
  test("Uploadfiles test") {
    assert(BootcampAssessment.uploadFiles() === true)
  }

  test("Createtables test") {
    assert(BootcampAssessment.createTables() === true)
  }

}
