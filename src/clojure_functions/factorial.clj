(ns clojure-functions.factorial)

(defn factorial [n]
  (loop [n n
         acc 1]
    (if (= 0 n)
      acc
      (recur (dec n) (* n acc)))))

(factorial 7) ;;=> 5040
(factorial 10) ;;=> 3628800

;; ------------------------
