(ns whatanime.components.sidebar.subs
  (:require [re-frame.core :refer [reg-sub]]))

(reg-sub
  ::expand?
  (fn [db _]
    (get-in db [:sidebar :expand?])))
