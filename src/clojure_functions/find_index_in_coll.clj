(ns clojure-functions.find-index-in-coll)

(defn find-index? [coll element]
  (loop [i 0]
    (if (= element (get coll i))
      i
      (recur (inc i)))))

(find-index? [23 4 5 6 2] 5) ;;=> 2
(find-index? [34 245 6 23 76] 23) ;;=> 3
