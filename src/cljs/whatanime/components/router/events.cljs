(ns whatanime.components.router.events
  (:require [whatanime.utils :refer [reg-event-db]]))

(reg-event-db
  ::initialize
  (fn [{{:keys [current-panel]} :storage :as db} _]
    (assoc-in db [:storage :current-panel]
              (or current-panel :home))))

(reg-event-db
  ::to-route
  (fn [db [panel]]
    (assoc-in db [:storage :current-panel] panel)))
