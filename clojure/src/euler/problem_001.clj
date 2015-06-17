(ns euler)

(defn multiple-of? [multiple number]
  (zero? (rem number multiple)))

(defn multiples [limit]
  (filter
    #(or (multiple-of? 3 %) (multiple-of? 5 %))
    (range limit)))

(println (reduce + (multiples 1000)))
