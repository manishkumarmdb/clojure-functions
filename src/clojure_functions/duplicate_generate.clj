(ns clojure-functions.duplicate-generate)


;;using pre-define functions
(defn duplicate-generator-01 [coll]
  (interleave coll coll))

(duplicate-implementation '(a b c c d))
;;=> (a a b b c c c c d d)
(duplicate-generator-01 '[a b c c d])
;;=> (a a b b c c c c d d)

;;-------------------------------------

(defn copy-n-times [coll]
  (mapv (fn [x] (into [] (repeat 2 x))) coll))

(copy-n-times '(a b c c d))
;;=> [[a a] [b b] [c c] [c c] [d d]]
(copy-n-times '[a b c c d])
;;=> [[a a] [b b] [c c] [c c] [d d]]

;; ---------------------------------

(defn duplicate-generator-02 [coll]
  (loop [c (copy-n-times coll)
         v '[]
         b c]
    (if (empty? b)
      (into '[] v)
      (recur c (concat v (first b)) (rest b)))))

(duplicate-generator-02 '(a b c c d))
;;=> [a a b b c c c c d d]
(duplicate-generator-02 '[a b c c d])
;;=> [a a b b c c c c d d]

;;-----------------------------------
