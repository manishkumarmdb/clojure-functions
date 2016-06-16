(ns clojure-functions.find-max-of-coll)

;;find max of list

(defn find-max? [coll]
  (loop [c coll
         f (first c)]
    (if (empty? c)
      f
      (recur (rest c)
             (if (> f (first c))
               f
               (first c))))))

(find-max? [1 2 345 4 6 84 22 52 4 7 45 32 24]) ;;=> 345
