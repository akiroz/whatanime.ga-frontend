(ns whatanime.components.router.subs
  (:require [re-frame.core :refer [reg-sub]]))

(reg-sub
  ::current-panel
  (fn [db _]
    :image-search
    #_(get-in db [:storage :current-panel])))
