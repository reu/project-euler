(ns euler.core)

(use 'clojure.java.io)

(defn run-problem [number]
  (def file-name (str "src/euler/problem_" (format "%03d" number) ".clj"))
  (if (.exists (as-file file-name))
    (load-file file-name)
    (println "There is no solution yet for problem" number)))

(defn -main [& args]
  (if (zero? (count args))
    (println "Usage: run <problem number>")
    (run-problem (read-string (first args)))))
