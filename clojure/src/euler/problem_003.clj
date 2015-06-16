(defn int-seq [n]
  (cons n (lazy-seq (int-seq (inc n)))))

(defn prime? [n]
  (if (<= n 1)
    false
    (if (= n 2)
      true
      (if (even? n)
        false
        (not (some (fn [x] (zero? (mod n x))) (range 2 (- n 1))))))))

(defn factors [n]
  (filter #(zero? (rem n %)) (range 1 (Math/sqrt n))))

(defn largest-prime [n]
  (reduce max (filter prime? (factors n))))

(println (largest-prime 600851475143))
