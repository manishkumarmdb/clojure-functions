(ns clojure-functions.find-last-element-in-coll)

(defn last-element [coll]
  (let [c (count coll)]
    (nth coll (dec c))))

(last-element [23 45 23 67 43 78]) ;;=> 78
(last-element '(34 56 76 567 23 22)) ;;=> 22

;; -----------------------------------------
