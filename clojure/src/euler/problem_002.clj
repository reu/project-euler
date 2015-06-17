(ns euler
  (:use [clojure.contrib.lazy-seqs :only (fibs)]))

(println (reduce + (take-while #(< % 4000000) (filter even? (fibs)))))
