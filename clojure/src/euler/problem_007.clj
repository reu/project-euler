(defn divisible-by? [number multiple]
  (zero? (rem number multiple)))

(defn prime? [n]
  (if (<= n 1)
    false
    (if (= n 2)
      true
      (if (even? n)
        false
        (not (some (partial divisible-by? n) (range 2 (- n 1))))))))

(defn int-seq [n]
  (cons n (lazy-seq (int-seq (inc n)))))

(def prime-seq
  (filter prime? (int-seq 2)))

(println (last (take 10001 prime-seq)))
