(ns clojure-functions.pack)

;;using Higher-order functions
;;not completed

(defn pack-implementation-hof [coll]
  (partition-by (fn [x] x) coll))

(pack-implementation-hof '(a a a a b c c a a d e e e e))

;;not completed using hof

;;-----------------------

;;using Tell-call optimization

(defn partition-by-2? [coll]
  (loop [c coll
         ret `()]
    (if (empty? c)
      (cons ret `())
      (if (= (first coll) (first c))
        (recur (rest c) (cons (first c) ret))
        (cons ret (list c))))))

(partition-by-2 '(a a a a b c c a a d e e e e))
;;=> ((a a a a) (b c c a a d e e e e))

;;-------------continue---------------

(defn pack-implementation-tco-1? [coll]
  (loop [c (partition-by-2? coll)
         ret `()]
    (if (empty? (second c))
      (reverse (cons (first c) ret))
      (recur (partition-by-2? (second c))
             (cons (first c) ret)))))

(pack-implementation-tco-1? '(a a a a b c c a a d e e e e))
;;=> ((a a a a) (b) (c c) (a a) (d) (e e e e))


;;--------------------------------------------
;;--------------------------------------------
;;another way

(defn pack-implementation-tco-2? [coll]
  ())
