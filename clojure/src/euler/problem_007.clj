(ns euler.problem-007
  (:use [clojure.contrib.lazy-seqs :only (primes)]))

(println (last (take 10001 primes)))
