(ns euler)

(defn multiple-of? [multiple number]
  (zero? (rem number multiple)))

(defn multiples [limit]
  (filter
    (fn [number] (or (multiple-of? 3 number) (multiple-of? 5 number)))
    (range limit)))

(println (reduce + (multiples 1000)))
