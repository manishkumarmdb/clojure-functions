(ns clojure-functions.day-of-week)

(def days {0 "Sunday"
           1 "Monday"
           2 "Tuesday"
           3 "Wednesday"
           4 "Thursday"
           5 "Friday"
           6 "Saturday"})

;;according to "Zeller's Rule" month start from March so march code is 1
;;http://mathforum.org/dr.math/faq/faq.calendar.html

;;here in months coll [jan feb march .. .. .. .. .. .. .. .. dec]
(def months [11 12 1 2 3 4 5 6 7 8 9 10])

(defn day-of-week [dd mm year]
  (let [k dd
        m (get months (dec mm)) ;;here i decrement of mm cause of find month code from months coll and coll index start from zero.
        d (if (or (= m 11) (= m 12))
            (mod (dec year) 100)
            (mod year 100))
        c (quot year 100)]
    (days (mod (- (+ k (quot (dec (* 13 m)) 5) d (quot d 4) (quot c 4)) (* 2 c)) 7))))

(day-of-week 04 05 2016) ;;=> "Wednesday"
(day-of-week 29 01 2064) ;;=> "Tuesday"
(day-of-week 05 05 2016) ;;=> "Thursday"

;;note
;;using "Zeller's Rule" month start from "March" and its code is 1
