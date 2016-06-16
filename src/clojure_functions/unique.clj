(ns clojure-functions.unique)

(defn unique-implementation [coll]
  (map (fn [x] (first x)) (partition-by (fn [x] x) coll)))

(unique-implementation '(a a a a b c c a a d e e e e))
;;=> (a b c a d e)

;; ---------------
