(def name-chars  "ABCDEFGHIJKLMNOPQRSTUVWXYZW")
(def name-digits "0123456789")

(defn- random-chars [count collection]
  (repeatedly count #(rand-nth collection)))

(defn- new-name [& more]
  (apply str (concat
    (random-chars 2 name-chars)
    (random-chars 3 name-digits))))

(defn robot []
  (let [name (new-name)]
    {:id (atom name)}))

(defn robot-name [robot]
  @(robot :id))

(defn reset-name [robot]
  (swap! (robot :id) new-name))