
class OctalSuite extends munit.FunSuite {
  import Clase1.octal

  test("octal(0) == 0") {
    assert(octal(0) == 0)
  }
  test("octal(1) == 1") {
    assert(octal(1) == 1)
  }
  test("octal(5) == 5") {
    assert(octal(5) == 5)
  }
  test("octal(8) == 10") {
    assert(octal(8) == 10)
  }
  test("octal(9) == 11") {
    assert(octal(9) == 11)
  }
  test("octal(18) == 22") {
    assert(octal(18) == 22)
  }
  test("octal(258) == 402") {
    assert(octal(258) == 402)
  }
  test("octal(700) == 1274") {
    assert(octal(700) == 1274)
  }
  test("octal(951) == 1667") {
    assert(octal(951) == 1667)
  }
}
