(ns whatanime.components.sidebar.events
  (:require [whatanime.utils :refer [reg-event-db]]))

(reg-event-db
  ::initialize
  (fn [db _]
    (assoc-in db [:sidebar :expand?] false)))
