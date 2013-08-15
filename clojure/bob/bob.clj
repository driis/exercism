(ns bob (:require [clojure.string :as str]))

(defn- silent? [phrase]
    (str/blank? phrase)
)
(defn- shouting? [phrase]
    (= phrase (str/upper-case phrase))
)

(defn- question? [phrase]
    (= \? (last phrase))
)

(defn response-for [phrase]
	(cond 
		(silent?   phrase) "Fine, be that way."
		(shouting? phrase) "Woah, chill out!"
		(question? phrase) "Sure."
		:else              "Whatever."
	) 	
)