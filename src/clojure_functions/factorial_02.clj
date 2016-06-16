(ns clojure-functions.factorial-02)

;;using tail-recursion
;;calculate factorial of numb
(defn factorial [numb]
  (loop [acc 1
         n numb]
    (if (zero? n)
      acc
      (recur (* acc n) (dec n)))))

(factorial 7) ;;=> 5040

;; --------------------
