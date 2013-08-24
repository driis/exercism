(ns beer
  (:require [clojure.string :as string]))

(defn- count-string [count]
  (cond 
    (zero? count) "no more bottles"
    (= count 1)   "1 bottle"
    :else         (str count " bottles")))

(defn- singular-string [count]
  (if (= count 1) 
    "it" 
    "one"))

(defn- first-strophe [count]
  (string/capitalize 
    (let [n-bottles (count-string count)]
      (str n-bottles " of beer on the wall, " n-bottles " of beer."))))

(defn- second-strophe [count]
  (if (zero? count)
    "Go to the store and buy some more, 99 bottles of beer on the wall.\n"
    (let [singular (singular-string count) 
          n-bottles (count-string (dec count))]
      (str "Take " singular " down and pass it around, " n-bottles " of beer on the wall.\n"))))
  
(defn verse [count]
  (str (first-strophe count) "\n" (second-strophe count)))

(defn sing 
  ([begin] (sing begin 0))
  ([begin end]
    (str (string/join "\n" (map verse (range begin (dec end) -1))) "\n")))