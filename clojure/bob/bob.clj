(ns bob (:use clojure.string))

(defn response-for [x] 
	(if (blank? x) 
		"Fine, be that way."
		(if (= (upper-case x) x)
			"Woah, chill out!"
			(if (= \? (.charAt x (- (.length x) 1)))
				"Sure."
				"Whatever."
			)
		)
	)

)