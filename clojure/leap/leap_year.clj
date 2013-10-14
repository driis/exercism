(defn divisible-by [number, divisor]
  (= 0 (mod number divisor)))

(defn leap-year [year]
  (and 
    (divisible-by year 4) 
    (or 
      (not (divisible-by year 100))
      (divisible-by year 400))))