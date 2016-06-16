(ns clojure-functions.compress)


(defn compress-implementation [coll]
  (map (fn [x] (list (count x) (first x)))
       (partition-by (fn [x] x) coll)))

(compress-implementation '(a a a a b c c a a d e e e e))
;;=> ((4 a) (1 b) (2 c) (2 a) (1 d) (4 e))
