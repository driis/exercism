(ns anagram
  (:require [clojure.string :as str]))

(defn- word-char-frequencies [word]
  (frequencies (str/upper-case word)))

(defn anagrams-for [word, candidates]
  (let [norm-word (word-char-frequencies word)] 
    (filter 
      (fn [candidate] 
        (= norm-word) (word-char-frequencies candidate)))
      candidates)))