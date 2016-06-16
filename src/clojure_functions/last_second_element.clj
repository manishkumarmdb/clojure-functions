(ns clojure-functions.last-second-element)

(defn second-last-element [coll]
  (let [c (count coll)]
    (nth coll (dec (dec c)))))

(second-last-element [34 65 32 87 23 546]) ;;=> 23
(second-last-element '(56 23 53 12 234 34)) ;;=> 234

;; -------------------------------------------------
