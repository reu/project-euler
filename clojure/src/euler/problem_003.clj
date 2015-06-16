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

(defn factors [n]
  (filter (partial divisible-by? n) (range 1 (Math/sqrt n))))

(defn largest-prime-factor [n]
  (reduce max (filter prime? (factors n))))

(println (largest-prime-factor 600851475143))
