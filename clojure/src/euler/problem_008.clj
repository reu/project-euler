(ns euler
  (:use [clojure.java.io :only (resource)])
  (:require [clojure.string :as string]))

(def digits
  (map #(bigint (str %)) (string/replace (slurp (resource "problem_008.txt")) #"\r?\n" "")))

(defn largest-product-in-series [numbers size]
  (reduce max (map #(reduce * %) (partition size 1 numbers))))

(println (str (largest-product-in-a-series digits 13)))
