(ns clojure-functions.take)

(defn take-implementation [n coll]
  (loop [ret '()
         i 0
         c coll]
    (if (or (empty? coll) (= coll nil) (<= n 0))
      ret
      (if (= i n)
        (reverse ret)
        (recur (if (> n (count coll))
                 (if-not (empty? c)
                   (conj ret (first c))
                   ret)
                 (conj ret (first c))) (inc i) (rest c))))))


(take-implementation 4 '(2 3 4 6 2 1 76 45)) ;;=> (2 3 4 6)
(take-implementation 5 [34 56 232 67 78 34 12 21]) ;;=> (34 56 232 67 78)
(take-implementation 4 [2 3 1]) ;;=> (2 3 1)
(take-implementation 2 [34 23 56 78]) ;;=> (34 23)
(take-implementation 1 '()) ;;=> ()
(take-implementation 1 nil) ;;=> ()
(take-implementation 0 [1]) ;;=> ()
(take-implementation -1 [4]) ;;=> ()

(take 4 (drop 6 (range 10 25))) ;;=> (16 17 18 19)

;;---------------------------
