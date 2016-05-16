(ns clojure-fibonacci.FibonacciSeries-test
  (:require [expectations :refer :all]
            [clojure-fibonacci.FibonacciSeries :refer :all]))

;; Canary test
(expect true true)

;;test recursive for N equals 0
(expect [1] (fibonacciRecursive 0))

;;test recursive for N equals 1
(expect [1 1] (fibonacciRecursive 1))

;;test recursive for N equals 2
(expect [1 1 2] (fibonacciRecursive 2))

;;test recursive for N equals 5
(expect [1 1 2 3 5 8] (fibonacciRecursive 5))

;;test recursive for N equals 8
(expect [1 1 2 3 5 8 13 21 34] (fibonacciRecursive 8))

;;test recursive for N equals 13
(expect [1 1 2 3 5 8 13 21 34 55 89 144 233 377] (fibonacciRecursive 13))

;;test Tailrecursive for N equals 0
(expect [1] (fibonacciTailRecursive 0))

;;test Tailrecursive for N equals 1
(expect [1 1] (fibonacciTailRecursive 1))

;;test Tailrecursive for N equals 2
(expect [1 1 2] (fibonacciTailRecursive 2))

;;test Tailrecursive for N equals 5
(expect [1 1 2 3 5 8] (fibonacciTailRecursive 5))

;;test Tailrecursive for N equals 8
(expect [1 1 2 3 5 8 13 21 34] (fibonacciTailRecursive 8))

;;test Tailrecursive for N equals 13
(expect [1 1 2 3 5 8 13 21 34 55 89 144 233 377] (fibonacciTailRecursive 13))
