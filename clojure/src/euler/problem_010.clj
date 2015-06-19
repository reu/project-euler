(ns euler.problem-010
  (:use [clojure.contrib.lazy-seqs :only (primes)]))

(defn sum-primes-below [n]
  (reduce + (take-while #(< % n) primes)))

(println (sum-primes-below 2000000))
