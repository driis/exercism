(ns phone 
  (:require [clojure.string :as str]))

(def phone-number-length 10)

(defn- clean-number [input]
  (let [digits (str/replace input #"[^\d]" "")]
    (if 
      (and 
        (= (count digits) (+ 1 phone-number-length)) 
        (= \1 (first digits)))
      (subs digits 1)
      digits)))

(defn- is-valid [digits]
  (= 10 (count digits)))

(defn number [input]
  (let [digits (clean-number input)]
    (let [length (count digits) 
          invalid "0000000000"]
      (if (is-valid digits) 
        digits
        invalid))))

(defn area-code [input]
  (let [digits (clean-number input)]
    (subs digits 0 3)))

(defn pretty-print [input]
  (let [digits (clean-number input)]
    (let [area (area-code digits)
          prefix (subs digits 3 6)
          line (subs digits 6)]
      (format "(%s) %s-%s" area prefix line))))