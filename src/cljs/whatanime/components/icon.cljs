(ns whatanime.components.icon
  (:require [whatanime.components.grommet :as g]))

(defn WhatanimeIcon [props]
  [g/SVGIcon (assoc props
                    :viewBox "0 0 100 100"
                    :version "1.1")
   [:rect {:width 100 :height 100}]
   [:circle {:cy 50 :cx 25 :r 15 :fill "#FFF"}]
   [:circle {:cy 50 :cx 75 :r 15 :fill "#FFF"}]
   [:polygon {:points "50,67 38,87 62,87" :fill "#FFBFBF"}]
   ])

(defn SocialPatreonIcon [props]
  [g/SVGIcon (assoc props
                    :viewBox "0 0 541 541"
                    :version "1.1")
   [:g {:transform "translate(-78.58618,-210.44369)"}
    [:path {:fill "#3B5998" :d "m 349.30493,273.28744 c -114.80003,0 -207.875,93.07494 -207.875,207.875 l 0,123.90625 0,83.75 0,62.8125 83.1875,0 0,-270.25 c 0,-68.64109 55.64016,-124.3125 124.28125,-124.3125 68.64109,0 124.28125,55.67141 124.28125,124.3125 0,68.64109 -55.64016,124.28125 -124.28125,124.28125 -25.09566,0 -48.463,-7.45836 -68,-20.25 l 0,89.34375 c 13.09042,8.05513 42.97659,13.74429 78.03125,14.03125 110.32856,-5.03362 198.25,-96.05383 198.25,-207.625 0,-114.80006 -93.07493,-207.875 -207.875,-207.875 z m -8.71875,415.53125 c 2.8876,0.1191 5.80191,0.21875 8.71875,0.21875 3.07049,0 6.11821,-0.087 9.15625,-0.21875 l -17.875,0 z"}]]
   ])