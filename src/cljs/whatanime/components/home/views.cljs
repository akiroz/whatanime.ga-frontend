(ns whatanime.components.home.views
  (:require [whatanime.components.grommet :as g]
            [whatanime.components.router.views :as router.views]))

(defmethod router.views/content :home [_]
  [g/Title "Hello World!"])
