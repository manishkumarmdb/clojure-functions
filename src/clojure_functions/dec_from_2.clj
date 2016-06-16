(ns clojure-functions.dec-from-2)

(loop [x 10]
  (when (> x 1)
    (println x)
    (recur (- x 2))))

;;=> 10 8 6 4 2 ;;here println use so output will be printed in new line.
