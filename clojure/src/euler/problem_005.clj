(ns euler)

(defn greater-common-divisor [a b]
  (if (zero? b)
    a
    (greater-common-divisor b (mod a b))))

(defn lowest-common-multiple [a b]
  (/ (* a b) (greater-common-divisor a b)))

(def smallest-multiple
  (reduce #(lowest-common-multiple %1 %2) (range 1 21)))

(println smallest-multiple)
