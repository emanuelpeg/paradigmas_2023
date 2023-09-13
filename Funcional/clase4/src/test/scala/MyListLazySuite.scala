class MyListLazySuite extends munit.FunSuite {

  import MyList.*

  test("test de test") {
    assert(1 + 2 == 3)
  }

  test("List is not empty") {
    assert(newLazyList(1, MyList(2, EmptyList())).sizeLazy() == 2)
  }

  test("the from 1 is not empty") {
    assert(from(1, 1,1).head == 1)
  }

  test("the from 1 is not empty") {
    assert(from(1).head == 1)
  }
}
