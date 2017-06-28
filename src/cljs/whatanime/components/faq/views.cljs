(ns whatanime.components.faq.views
  (:require [whatanime.components.grommet :as g]
            [whatanime.components.router.views :as router.views]
            ))

(defmethod router.views/content :faq [_]
  [:p "hello"])
