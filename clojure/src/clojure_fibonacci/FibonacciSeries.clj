(ns clojure-fibonacci.FibonacciSeries)

  
(defn fibonacciRecursive [position] 
	(case position
		0 [1]
		1 [1 1]
		(conj 
			@(def numberSequence (fibonacciRecursive(dec position))) (reduce + (take-last 2 numberSequence)))))

			
(defn fibonacciTailRecursive [position] 
	(loop [newPosition position updatedList [1]]
		(if (zero? newPosition) updatedList
			(recur (dec newPosition)  (conj updatedList (reduce + (take-last 2 updatedList)))))))
