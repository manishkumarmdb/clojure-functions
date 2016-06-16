(ns clojure-functions.find-kth-element)

(defn find-kth-element [coll position]
  (let [kth (dec position)]
    (nth coll kth)))

(find-kth-element [12 34 5 67 54] 2) ;;=> 34
(find-kth-element '(345 67 78 45 3) 1) ;;=> 345

;;---------------------------------------------
