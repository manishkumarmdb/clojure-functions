(ns clojure-functions.print-power)

(defn power
  ([x y] (power x y 1))
  ([x y current]
   (if (= y 0)
     current
     (if (> y 0)
       (recur x (- y 1) (* x current))
       (recur x (+ y 1) (/ current x))))))

(power 2 4) ;;=> 16
(power 3 6) ;;=> 729

;; -----------------
