class MyStreamSuite extends munit.FunSuite {

  import MyStream._

  test("test de test") {
    assert(1 + 2 == 3)
  }

  test("EmptyLazyList is empty") {
    assert(isEmpty(new EmptyLazyList()))
  }

  test("LazyList is not empty") {
    assert(!isEmpty(new LazyList(1, new EmptyLazyList())))
  }

  test("size of EmptyLazyList is 0") {
    assert(size(new EmptyLazyList()) == 0)
  }

  test("size of LazyList is 1") {
    assert(size(new LazyList(1, new EmptyLazyList())) == 1)
  }

  test("EmptyLazyList is not equals than LazyList") {
    assert(!equalsList(new EmptyLazyList(), new LazyList(1, new EmptyLazyList())))
  }

  test("EmptyLazyList is equals than EmptyLazyList") {
    assert(equalsList(new EmptyLazyList(), new EmptyLazyList()))
  }

  test("size of LazyList is 1 with add") {
    assert(size(add(1, new EmptyLazyList())) == 1)
  }

  test("LazyList with 1 is equals than add 1 of EmptyList") {
    assert(equalsList(new LazyList(1, new EmptyLazyList()), add(1, new EmptyLazyList())))
  }

  test("LazyList with 1,2 is equals than addLast 2,1 of EmptyList") {
    assert(equalsList(new LazyList(1, new LazyList(2, new EmptyLazyList())), addLast(2, addLast(1, new EmptyLazyList()))))
  }

  test("range is equals than addLast 2,1 of EmptyList") {
    assert(equalsList(range(1, 3, 1), addLast(2, addLast(1, new EmptyLazyList()))))
  }

  test("range of 1,101,2 has 50 elements") {
    assert(size(range(1, 101, 2)) == 50)
  }


}
