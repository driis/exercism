(ns bob (:require [clojure.string :as str]))

(defn is-silent [phrase]
    (str/blank? phrase)
)
(defn is-shouting [phrase]
    (= phrase (str/upper-case phrase))
)

(defn is-question [phrase]
    (= \? (last phrase))
)

(defn response-for [phrase]
	(cond 
		(is-silent phrase) "Fine, be that way."
		(is-shouting phrase) "Woah, chill out!"
		(is-question phrase) "Sure."
		:else "Whatever."
	) 	
)