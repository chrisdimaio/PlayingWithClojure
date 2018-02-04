(ns main.clojure.take-one.core)

(def greeting "Ello Govna")

(println greeting)

(def emphasize
  (fn [phrase]
    (str phrase \!)))

(println (emphasize greeting))