(ns anagram
  (:require [clojure.string :as str]))

(defn- word-chars [word]
  (frequencies (str/upper-case word)))

(defn anagrams-for [word, candidates]
  (let [norm-word (word-chars word)] 
    (filter (fn [candidate] 
      (= norm-word (word-chars candidate)))
      candidates)))