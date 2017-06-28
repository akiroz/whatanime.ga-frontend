(ns whatanime.core
  (:require [reagent.core :refer [render-component]]
            [re-frame.core :refer [dispatch-sync clear-subscription-cache!]]
            [re-frisk.core :refer [enable-re-frisk!]]
            [akiroz.re-frame.whatanime :as whatanime]
            [whatanime.components.router.events :as router.events]
            [whatanime.components.sidebar.events :as sidebar.events]
            [whatanime.components.router.views :refer [App]]
            ;; all view namespaces must be explicitly required
            [whatanime.components.home.views]
            [whatanime.components.image-search.views]
            [whatanime.components.server-status.views]
            [whatanime.components.changelog.views]
            [whatanime.components.faq.views]
            [whatanime.components.legal.views]
            ))


(enable-console-print!)

(goog-define enable-re-frisk false)
(goog-define whatanime-api-token "")

(defn render-app []
  (->> (.getElementById js/document "app")
       (render-component [App])))

(defn fig-reload []
  (clear-subscription-cache!)
  (render-app))

(defn main []
  ;; setup re-frisk
  (when enable-re-frisk
    (enable-re-frisk! {:kind->id->handler? true}))

  ;; register whatanime fx
  (whatanime/reg-fx! {:token whatanime-api-token})

  ;; initialize app
  (dispatch-sync [::router.events/initialize])
  (dispatch-sync [::sidebar.events/initialize])
  (render-app))

(set! js/window.onload main)
