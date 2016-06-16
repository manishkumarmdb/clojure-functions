(ns clojure-functions.slice)

(defn slice-implementation-01 [coll i k]
  (subvec (into '[] coll) (dec i) k))

(slice-implementation-01 '(a b c d e f g h i k) 3 7)
;;=> [c d e f g]
(slice-implementation-01 '[a b c d e f g h i k] 3 7)
;;=> [c d e f g]

;;--------------------------------------------------

(defn slice-implementation-02 [coll i k]
  (into '[] (take (inc (- k i)) (drop (dec i) coll))))

(slice-implementation-02 '(a b c d e f g h i k) 3 7)
;;=> [c d e f g]
(slice-implementation-02 '[a b c d e f g h i k] 3 7)
;;=> [c d e f g]

;;--------------------------------------------------
