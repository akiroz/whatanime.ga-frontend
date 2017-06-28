(ns whatanime.components.router.views
  (:require [re-frame.core :refer [subscribe]]
            [whatanime.components.grommet :as g]
            [whatanime.components.sidebar.views :refer [Sidebar]]
            [whatanime.components.router.subs :as router.subs]
            [whatanime.components.sidebar.subs :as sidebar.subs]
            ))

(defmulti content
  (fn [panel] panel))

(defmethod content :default [_]
  [g/Header {:splash  true
             :justify :center}
   [g/Title "Error: Page Not Found"]])

(defn App []
  (let [current-panel   (subscribe [::router.subs/current-panel])
        expand-sidebar? (subscribe [::sidebar.subs/expand?])]
    (fn App-render []
      [g/App {:centered false}
       [g/Split {:flex      :right
                 :priority  (if @expand-sidebar?
                              :left
                              :right)}
        (if (= @current-panel :home)
          [:div]
          [Sidebar])
        (content @current-panel)]])))


