(ns clojure-functions.sum-of-n-numbers)

(loop [iter 1
       acc  0]
  (if (> iter 10)
    (println acc)
    (recur (inc iter) (+ acc iter))))
