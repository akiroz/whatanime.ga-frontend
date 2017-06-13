(ns whatanime.components.main.views
  (:require [whatanime.components.grommet :refer [App Split Sidebar Header Title]]))

(defn app []
  [App
   [Title "Hello World"]
   [:p "Hello from a Grommet page!"]])
