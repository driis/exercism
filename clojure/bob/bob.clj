(ns bob (:require [clojure.string :as str]))

(defn response-for [x]
	(cond 
		(str/blank? x) "Fine, be that way."
		(= (str/upper-case x) x) "Woah, chill out!"
		(= \? (last x)) "Sure."
		:else "Whatever."
	) 	
)