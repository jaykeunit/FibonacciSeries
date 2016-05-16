package fibonacci

import org.scalatest.FunSuite

class FibonacciSeriesTest extends FunSuite {
  val fibonacciSequence = new FibonacciSeries()

  test("Canary"){
    assert(true)
  }

  test("test for N equals 0") {
    assert(fibonacciSequence.fibonacciRecursive(0) == List(1))
  }

  test("test for N equals 1") {
  assert(fibonacciSequence.fibonacciRecursive(1) == List(1, 1))
  }

  test("test for N equals 2") {
    assert(fibonacciSequence.fibonacciRecursive(2) == List(1, 1, 2))
  }

  test("test for N equals 5") {
    assert(fibonacciSequence.fibonacciRecursive(5) == List(1, 1, 2, 3, 5, 8))
  }

  test("test for N equals 8") {
    assert(fibonacciSequence.fibonacciRecursive(8) == List(1, 1, 2, 3, 5, 8, 13, 21, 34 ))
  }

  test("test for N equals 13") {
    assert(fibonacciSequence.fibonacciRecursive(13) == List(1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377))
  }

  test("tailRecursive test for N equals 0") {
    assert(fibonacciSequence.fibonacciTailRecursive(0) == List(1))
  }

  test("tailRecursive test for N equals 1") {
    assert(fibonacciSequence.fibonacciTailRecursive(1) == List(1, 1))
  }

  test("tailRecursive test for N equals 2") {
    assert(fibonacciSequence.fibonacciTailRecursive(2) == List(1, 1, 2))
  }

  test("tailRecursive test for N equals 5") {
    assert(fibonacciSequence.fibonacciTailRecursive(5) == List(1, 1, 2, 3, 5, 8))
  }

  test("tailRecursive test for N equals 8") {
    assert(fibonacciSequence.fibonacciTailRecursive(8) == List(1, 1, 2, 3, 5, 8, 13, 21, 34 ))
  }

  test("tailRecursive test for N equals 13") {
    assert(fibonacciSequence.fibonacciTailRecursive(13) == List(1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377))
  }
}