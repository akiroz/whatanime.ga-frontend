(ns whatanime.components.main.events
  (:require [clojure.pprint :refer [pprint]]
            [re-frame.core :refer [reg-event-fx reg-event-db]]
            [akiroz.re-frame.whatanime :as whatanime]))

(reg-event-fx
  ::initialize
  (fn [_ _]
    {}))
