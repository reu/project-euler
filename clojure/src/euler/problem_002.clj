(def fib-seq
  ((fn fib [a b] (lazy-seq (cons a (fib b (+ a b))))) 1 1))

(print (reduce + (take-while #(< % 4000000) (filter even? fib-seq))))
