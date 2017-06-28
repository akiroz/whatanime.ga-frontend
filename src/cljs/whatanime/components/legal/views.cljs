(ns whatanime.components.legal.views
  (:require [whatanime.components.grommet :as g]
            [whatanime.components.router.views :as router.views]
            ))

(defmethod router.views/content :legal [_]
  [:p "hello"])
