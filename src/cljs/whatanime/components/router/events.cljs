(ns whatanime.components.router.events
  (:require [bidi.bidi :as bidi]
            [pushy.core :as pushy]
            [re-frame.core :refer [reg-fx dispatch-sync]]
            [whatanime.utils :refer [reg-event-db reg-event-fx]]))

(def routes
  ["/" [[""               :home]
        ["image-search"   :image-search]
        ["server-status"  :server-status]
        ["changelog"      :changelog]
        ["faq"            :faq]
        ["legal"          :legal]
        [true             :not-found]
        ]])

(def history
  (pushy/pushy
    (fn [{:keys [handler]}]
      (dispatch-sync [::set-panel handler]))
    (fn [path]
      (bidi/match-route routes path))))

(defn start-router! []
  (pushy/start! history))

(reg-fx
  ::set-token!
  (fn [token]
    ;; async hack, since this will dispatch-sync ::set-panel
    ;; and you can't dispatch-sync inside an event
    (js/requestAnimationFrame
      #(pushy/set-token! history token))))

(reg-event-db
  ::set-panel
  (fn [db [panel]]
    (assoc-in db [:router :current-panel] panel)))

(reg-event-fx
  ::to-route
  (fn [_ [panel]]
    {::set-token! (bidi/path-for routes panel)}))
