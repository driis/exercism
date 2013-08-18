(ns phrase (:require [clojure.string :as str]))

(defn word-count [sentence]
    (let [words (re-seq #"\w+" (str/lower-case sentence))]
        (frequencies words)
    )
)