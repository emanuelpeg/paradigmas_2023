class MyListSuite extends munit.FunSuite {

  import MyList._

  test("test de test") {
    assert(1 + 2 == 3)
  }

  test("EmptyList is empty") {
    assert(isEmpty(new EmptyList()))
  }

  test("List is not empty") {
    assert(!isEmpty(new MyList(1, new EmptyList())))
  }

  test("size of EmptyList is 0") {
    assert(size(new EmptyList()) == 0)
  }

  test("size of List is 1") {
    assert(size(new MyList(1, new EmptyList())) == 1)
  }

  test("EmptyList is not equals than LazyList") {
    assert(!equalsList(new EmptyList(), new MyList(1, new EmptyList())))
  }

  test("EmptyList is equals than EmptyList") {
    assert(equalsList(new EmptyList(), new EmptyList()))
  }

  test("size of LazyList is 1 with add") {
    assert(size(add(1, new EmptyList())) == 1)
  }

  test("List with 1 is equals than add 1 of EmptyList") {
    assert(equalsList(new MyList(1, new EmptyList()), add(1, new EmptyList())))
  }

  test("List with 1,2 is equals than addLast 2,1 of EmptyList") {
    assert(equalsList(new MyList(1, new MyList(2, new EmptyList())), addLast(2, addLast(1, new EmptyList()))))
  }

  test("range is equals than addLast 2,1 of EmptyList") {
    assert(equalsList(range(1, 3, 1), addLast(2, addLast(1, new EmptyList()))))
  }

  test("range of 1,101,2 has 50 elements") {
    assert(size(range(1, 101, 2)) == 50)
  }


}
