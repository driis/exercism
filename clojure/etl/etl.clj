(ns etl 
  (:require [clojure.string :as str]))

(defn- pairs [pair]
  (let [[value key] pair]
    (map (fn [k] {(str/lower-case k) value}) key)))
    
(defn transform [words]
  (into {} (flatten (map pairs words))))