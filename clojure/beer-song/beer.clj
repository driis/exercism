(ns beer
  (:require [clojure.string :as str]))

(defn- count-string [count]
  (cond 
    (= count 0) "no more bottles"
    (= count 1) "1 bottle"
    :else (str/join [count, " bottles"])))

(defn- beer-string [count]
  (if (= count 1) 
    "it" 
    "one"))

(defn- first-strophe [count]
  (str/capitalize 
    (str/join [(count-string count), 
      " of beer on the wall, ", 
      (count-string count), 
      " of beer."])))

(defn- second-strophe [count]
  (if (= 0 count)
    "Go to the store and buy some more, 99 bottles of beer on the wall.\n"
    (str/join ["Take ",
      (beer-string count),
      " down and pass it around, ", 
      (count-string (- count 1)), 
      " of beer on the wall.\n"])))
  
(defn verse [count]
  (str/join "\n" [(first-strophe count), (second-strophe count)]))

(defn sing 
  ([begin] (sing begin 0))
  ([begin,end]
    (str/join [(str/join "\n" (map verse (range begin (- end 1) -1))) "\n"])))