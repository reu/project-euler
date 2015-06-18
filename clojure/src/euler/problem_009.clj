(ns euler.problem-009)

(defn square [n] (* n n))

(defn triplet? [a b c]
  (= (+ (square a) (square b)) (square c)))

(defn pythagorean-triplet [n]
  (loop [a 1 b 2 c n]
    (cond
      (triplet? a b c) (* a b c)
      (< c b) (recur (inc a) (+ a 2) (- n a 3))
      :else (recur a (inc b) (- n a b 1)))))

(println (pythagorean-triplet 1000))