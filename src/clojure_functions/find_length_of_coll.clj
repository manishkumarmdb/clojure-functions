(ns clojure-functions.find-length-of-coll)

;; find length of collection

(defn len-of-coll?
  ([lst] (len-of-coll? 0 lst))
  ([n lst]
   (if (empty? lst)
     n
     (recur (inc n) (rest lst)))))

(len-of-coll? [1 2 5 4 6 8 2 5 4 7]) ;;=> 10

;;------------------------------------------
