(ns anagram
  (:require [clojure.string :as str]))

(defn- normalizeWord [word]
  (sort (str/upper-case word)))

(defn anagrams-for [word, candidates]
  (let [normWord (normalizeWord word)] 
    (filter (fn [candidate] 
      (= normWord (normalizeWord candidate))) 
      candidates)))