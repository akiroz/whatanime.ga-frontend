(ns whatanime.components.faq.views
  (:require-macros [whatanime.utils :refer [slurp-resource]])
  (:require [whatanime.components.grommet :as g]
            [whatanime.components.router.views :as router.views]
            ))

(defmethod router.views/content :faq [_]
  [g/Article {:pad :large}
   [g/Markdown {:components {:h3 {:props {:strong true}}}
                :content (slurp-resource "content/faq.md")}]])

