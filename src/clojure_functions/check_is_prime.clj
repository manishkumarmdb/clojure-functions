(ns clojure-functions.check-is-prime)

;;check prime or not

(defn is-prime? [n]
  (if (= n 2)
    true
    (if (even? n)
      false
      (let [root (num (int (Math/sqrt n)))]
        (loop [i 3]
          (if (> i root)
            true
            (if (zero? (mod n i))
              false
              (recur (+ i 2)))))))))

(is-prime? 17) ;;=> true
(is-prime? 33) ;;=> false
(is-prime? 2) ;;=> true
(is-prime? 3) ;;=> true

;; --------------------
