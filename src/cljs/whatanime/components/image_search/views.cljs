(ns whatanime.components.image-search.views
  (:require [re-frame.core :refer [dispatch subscribe]]
            [whatanime.components.grommet :as g]
            [whatanime.components.router.views :as router.views]
            [whatanime.components.image-search.events :as image-search.events]
            [whatanime.components.image-search.subs :as image-search.subs]
            ))

(defmethod router.views/content :image-search [_]
  [:p "hello"])
