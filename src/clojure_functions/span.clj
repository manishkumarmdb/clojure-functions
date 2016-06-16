(ns clojure-functions.span)

;;using tail-call optimization
(defn span-implementation-tco [fn? n coll]
  (loop [c1 []
         c coll
         i 1]
    (if (<= n 0)
      (concat [c1] [c])
      (if (> n (count coll))
        (concat [c] [c1])
        (if (= i n)
          (concat [c1] [c])
          (recur (conj c1 (first c)) (into [] (rest c)) (inc i)))))))

(span-implementation-tco < 3 [1 2 3 4 1 2 3 4]) ;;=> ([1 2] [3 4 1 2 3 4])
(span-implementation-tco < 9 [1 2 3]) ;;=> ([1 2 3] [])
(span-implementation-tco < 0 [1 2 3]) ;;=> ([] [1 2 3])

;; ----------------------------------------------------

;; using higher order functions

(defn span-implementation-hof [fn? n coll]
  )
