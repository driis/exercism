(ns beer
  (:require [clojure.string :as string]))

(defn- count-string [count]
  (cond 
    (zero? count) "no more bottles"
    (= count 1)   "1 bottle"
    :else         (str count " bottles")))

(defn- beer-string [count]
  (if (= count 1) 
    "it" 
    "one"))

(defn- first-strophe [count]
  (string/capitalize 
    (str (count-string count)
      " of beer on the wall, " 
      (count-string count) 
      " of beer.")))

(defn- second-strophe [count]
  (if (zero? count)
    "Go to the store and buy some more, 99 bottles of beer on the wall.\n"
    (str "Take "
      (beer-string count)
      " down and pass it around, "
      (count-string (- count 1))
      " of beer on the wall.\n")))
  
(defn verse [count]
  (str (first-strophe count) "\n" (second-strophe count)))

(defn sing 
  ([begin] (sing begin 0))
  ([begin end]
    (str (string/join "\n" (map verse (range begin (- end 1) -1))) "\n")))