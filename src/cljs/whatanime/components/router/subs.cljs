(ns whatanime.components.router.subs
  (:require [re-frame.core :refer [reg-sub]]))

(reg-sub
  ::current-panel
  (fn [db _]
    (get-in db [:router :current-panel])))
