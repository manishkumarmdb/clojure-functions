(ns clojure-functions.check-is-perfect)

(defn is-perfect? [n]
  (loop [s 0
         i 1]
    (if (= i n)
      (if (= s n)
        true
        false)
      (recur (+ (if (zero? (mod n i))
                  i
                  0) s)
             (inc i)))))

(is-perfect? 6) ;;=> true
(is-perfect? 28) ;;=> true
(is-perfect? 5) ;;=> false

;; -----------------------

