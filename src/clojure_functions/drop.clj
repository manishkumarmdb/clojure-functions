(ns clojure-functions.drop)

(defn drop-implementation [n coll]
  (loop [ret '()
         i 0
         c coll]
    (if (or (empty? coll) (> n (count coll)))
      ret
      (if (<= n 0)
        coll
        (if (= i (count coll))
          (reverse ret)
          (recur (if (not (>= i n))
                   ret
                   (conj ret (first c))) (inc i) (rest c)))))))

(drop-implementation 3 [234 45 23 56 23 6 4 2]) ;;=> (56 23 6 4 2)
(drop-implementation 0 [2 3 4 5 6]) ;;=> (2 3 4 5 6)
(drop-implementation -2 [32 23 45 7 4]) ;;=> (32 23 45 7 4)
(drop-implementation 8 [2 3 4 5 6 61]) ;;=> ()
(drop-implementation 3 '()) ;;=> ()
(drop-implementation 0 []) ;;=> ()

;; -------------------------------
