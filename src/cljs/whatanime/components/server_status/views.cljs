(ns whatanime.components.server-status.views
  (:require [re-frame.core :refer [dispatch subscribe]]
            [whatanime.components.grommet :as g]
            [whatanime.components.router.views :as router.views]
            [whatanime.components.server-status.events :as server-status.events]
            [whatanime.components.server-status.subs :as server-status.subs]
            ))

(defmethod router.views/content :server-status [_]
  [:p "hello"])
