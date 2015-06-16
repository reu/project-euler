(require '[clojure.string :as string])

(defn palindrome? [n]
  (let [a (str n)]
    (= a (string/reverse a))))

(def three-digit-numbers
  (range 100 1000))

(defn products [numbers]
  (for [x numbers y numbers] (* x y)))

(def largest-palindrome-product
  (reduce max (filter palindrome? (products three-digit-numbers))))

(println largest-palindrome-product)
