(ns etl 
  (:require [clojure.string :as str]))

(defn- pairs [[value key]]
    (map (fn [k] {(str/lower-case k) value}) key))
    
(defn transform [words]
  (into {} (flatten (map pairs words))))