(ns whatanime.components.grommet
  (:require-macros [whatanime.components.grommet :refer [import-components]])
  (:require [reagent.core :refer [adapt-react-class]]
            [cljsjs.grommet]))

(import-components
  App
  Split
  Sidebar
  Header
  Title)
