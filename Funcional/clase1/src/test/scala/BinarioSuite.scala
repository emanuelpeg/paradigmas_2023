
class BinarioSuite extends munit.FunSuite {
  import Clase1.binario

  test("binario(0) == 0") {
    assert(binario(0) == 0)
  }
  test("binario(1) == 1") {
    assert(binario(1) == 1)
  }
  test("binario(2) == 10") {
    assert(binario(2) == 10)
  }
  test("binario(3) == 11") {
    assert(binario(3) == 11)
  }
  test("binario(4) == 100") {
    assert(binario(4) == 100)
  }
  test("binario(5) == 101") {
    assert(binario(5) == 101)
  }
  test("binario(6) == 110") {
    assert(binario(6) == 110)
  }
  test("binario(7) == 111") {
    assert(binario(7) == 111)
  }
  test("binario(8) == 1000") {
    assert(binario(8) == 1000)
  }
}
