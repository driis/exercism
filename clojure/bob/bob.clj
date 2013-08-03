(ns bob (:use clojure.string))

(defn response-for [x]
	(cond 
		(blank? x) "Fine, be that way."
		(= (upper-case x) x) "Woah, chill out!"
		(= \? (.charAt x (- (.length x) 1))) "Sure."
		true "Whatever."
	) 	
)