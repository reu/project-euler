(ns euler
  (:use [clojure.contrib.lazy-seqs :only (primes)])
  (:use [clojure.contrib.math :only (sqrt)]))

(defn divisible-by? [number multiple]
  (zero? (rem number multiple)))

(defn prime-factors [n]
  (filter (partial divisible-by? n) (take-while #(< % (sqrt n)) primes)))

(defn largest-prime-factor [n]
  (reduce max (prime-factors n)))

(println (largest-prime-factor 600851475143))
