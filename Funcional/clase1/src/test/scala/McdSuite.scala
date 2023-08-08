
class McdSuite extends munit.FunSuite {
  import Clase1.mcd

  test("mcd(1,1) == 1") {
    assert(mcd(1,1) == 1)
  }
  test("mcd(2,2) == 2") {
    assert(mcd(2,2) == 2)
  }
  test("mcd(3,2) == 1") {
    assert(mcd(3,2) == 1)
  }
  test("mcd(6,2) == 2") {
    assert(mcd(6,2) == 2)
  }
  test("mcd(66,22) == 22") {
    assert(mcd(66,22) == 22)
  }
  test("mcd(22,66) == 22") {
    assert(mcd(22,66) == 22)
  }
  test("mcd(33,22) == 11") {
    assert(mcd(33,22) == 11)
  }
  test("mcd(330,220) == 110") {
    assert(mcd(330,220) == 110)
  }
  test("mcd(7335,220) == 5") {
    assert(mcd(7335,220) == 5)
  }
  test("mcd(220,7335) == 5") {
    assert(mcd(220,7335) == 5)
  }
}
