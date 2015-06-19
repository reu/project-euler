(ns euler.problem-012)

(def triangle-numbers-seq
  (lazy-seq
    (cons 0 (map + triangle-numbers-seq (iterate inc 1)))))

(defn factors-count [n]
  (* 2 (count (filter #(zero? (rem n %)) (range 1 (Math/sqrt n))))))

(defn highly-divisible-triangular-number [divisor]
  (first (filter #(> (factors-count %) divisor) triangle-numbers-seq)))

(println (highly-divisible-triangular-number 500))