(ns clojure-functions.rotate-coll)

(defn rotate-coll-implementation-01 [coll n]
  (let [r (take n coll)]
    (mapv (fn [x] x) (concat (drop n coll) r))))

(rotate-coll-implementation-01 '(a b c d e f g h) 3)
;;=> [d e f g h a b c]

(rotate-coll-implementation-01 '[a b c d e f g h] 4)
;;=> [e f g h a b c d]

;;--------------------------------------------------
