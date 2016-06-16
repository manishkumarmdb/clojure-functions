(ns clojure-functions.take-while)


(defn take-while-implementation [fn? coll]
  (loop [ret '()
         c coll]
    (if (or (empty? coll) (= coll nil) (not (fn? (first coll))))
      ret
      (if (not (fn? (first c)))
        (reverse ret)
        (recur (conj ret (first c)) (rest c))))))



;;take-while-imlementation

(take-while-implementation neg? [-2 -6 -8 23 12 -43 -56]) ;;=> (-2 -6 -8)
(take-while-implementation neg? [2 3 4 5 -2 -4 -1 34 23]) ;;=> () ;;when it false then stop the treversing
(take-while-implementation neg? [3 4 5 2 6 7 5]) ;;=> ()
(take-while-implementation neg? []) ;;=> ()
(take-while-implementation neg? nil) ;;=> ()
(take-while-implementation #{[34 12] [67 34] [78 45]} #{[34 12]}) ;;=> ([34 12])
(take-while-implementation #{[34 12] [67 35] [78 45]} #{[78 45]}) ;;=> ([78 45])
(take-while-implementation #{[34 12] [67 34] [78 45]} #{[34 16]}) ;;=> ()
(take-while-implementation #{[34 12] [67 34] [78 45]} #{[67 12] [45 32]}) ;;=> ()
(take-while-implementation #{[34 12] [67 34] [78 45]} #{[34 12] [56 23]}) ;;=> ([34 12])

;; ----------------------------------------------------------------------
