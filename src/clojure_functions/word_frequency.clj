(ns clojure-functions.word-frequency
  (:require [clojure.string :as str]))

(defn get-word-counts [text]
  (reduce
   (fn [words word] (assoc words word (inc (words word 0))))
   {}
   (str/split (.toLowerCase text) #"\W+")))

;;using slurp
;;Opens a reader on f and reads all its contents, returning a string.
(get-word-counts (slurp "/home/manish/manish/Prob-Project/input files/input01.txt"))


;;passing string
(get-word-counts "This will return the html content of clojuredocs.org")

;; ---------------------------------------------------------------------
