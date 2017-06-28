(ns whatanime.components.changelog.views
  (:require [whatanime.components.grommet :as g]
            [whatanime.components.router.views :as router.views]
            ))

(defmethod router.views/content :changelog [_]
  [:p "hello"])
