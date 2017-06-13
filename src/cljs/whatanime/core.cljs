(ns whatanime.core
  (:require [reagent.core :refer [render-component force-update-all]]
            [re-frame.core :refer [dispatch-sync clear-subscription-cache!]]
            [re-frisk-remote.core :refer [enable-re-frisk-remote!]]
            [akiroz.re-frame.whatanime :as whatanime]
            [whatanime.components.main.views :as main.views]
            [whatanime.components.main.events :as main.events]
            ))


(enable-console-print!)

(goog-define enable-re-frisk false)
(goog-define whatanime-api-token "")

(defn fig-reload []
  (clear-subscription-cache!)
  (force-update-all))

(defn ^:export main []
  ;; setup re-frisk
  (when enable-re-frisk
    (enable-re-frisk-remote!))

  ;; register whatanime fx
  (whatanime/reg-fx! {:token whatanime-api-token})

  ;; initialize app
  (dispatch-sync [::main.events/initialize])
  (render-component
    [main.views/app]
    (.getElementById js/document "app")))

(set! js/window.onload main)
