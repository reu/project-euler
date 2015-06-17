(ns euler
  (:use [clojure.string :only (reverse) :rename {reverse reverse-string}]))

(defn palindrome? [n]
  (let [a (str n)]
    (= a (reverse-string a))))

(def three-digit-numbers
  (range 100 1000))

(defn products [numbers]
  (for [x numbers y numbers] (* x y)))

(def largest-palindrome-product
  (reduce max (filter palindrome? (products three-digit-numbers))))

(println largest-palindrome-product)
