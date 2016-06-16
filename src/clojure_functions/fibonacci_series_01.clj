(ns clojure-functions.fibonacci-series-01)

(defn fibonacci-number-at-n-position [n]
  (loop [first 0
         second 1
         iter 0]
    (if (= iter n)
      first
      (recur second (+ first second) (inc iter)))))

(fibonacci-number-at-n-position 6) ;;=> 8
(fibonacci-number-at-n-position 10) ;;=> 55

;;------------------------------------------

(defn fibonacci-series [n]
  (loop [fib-nums [0 1]]
    (if (>= (count fib-nums) n)
      (subvec fib-nums 0 n)
      (let [[n1 n2] (reverse fib-nums)]
        (recur (conj fib-nums (+ n1 n2)))))))

(fibonacci-series 6) ;;=> [0 1 1 2 3 5]
