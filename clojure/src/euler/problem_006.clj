(defn square [n] (* n n))

(defn sum [items] (reduce + items))

(defn sum-of-squares [n]
  (sum (map square (range 1 (inc n)))))

(defn square-of-sum [n]
  (square (sum (range 1 (inc n)))))

(defn sum-square-difference [n]
  (- (square-of-sum n) (sum-of-squares n)))

(println (sum-square-difference 100))
