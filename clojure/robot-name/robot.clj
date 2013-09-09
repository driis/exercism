(def name-chars  "ABCDEFGHIJKLMNOPQRSTUVWXYZW")
(def name-digits "0123456789")
(def names {})

(defn- random-chars [count collection]
  (repeatedly count #(rand-nth collection)))

(defn- new-name [& more]
  (apply str (concat
    (random-chars 2 name-chars)
    (random-chars 3 name-digits))))

(defn robot []
  (let [name (new-name)]
    (def names (assoc names name name))
    {:id name}))

(defn robot-name [robot]
  (names (robot :id)))

(defn reset-name [robot]
  (def names (update-in names [(robot :id)] new-name))
  robot)