(ns whatanime.components.server-status.views
  (:require [reagent.core :refer [as-element]]
            [re-frame.core :refer [dispatch subscribe]]
            [whatanime.components.grommet :as g]
            [whatanime.components.router.views :as router.views]
            [whatanime.components.server-status.events :as server-status.events]
            [whatanime.components.server-status.subs :as server-status.subs]
            ))

(defmethod router.views/content :server-status [_]
  [g/Article {:pad        :large
              :textAlign  :center}
   [g/Header {:separator  :bottom
              :justify    :center}
    [g/Heading "Server Status"]]
   [g/Tiles {:justify :center
             :align   :center}
    [g/Tile
     [g/Box {:justify :center
             :margin  :large
             :size    :small}
      [g/Value {:value 571
                :units "Million"
                :label "Frames Analyzed"
                :size  :large}]]]
    [g/Tile
     [g/Box {:justify :center
             :margin  :large
             :size    :small}
      [g/Meter {:type :arc
                :value 16}]
      [g/Value {:value "17/105"
                :units "GB"
                :label "Cached in RAM"
                :size  :small}]]]
    [g/Tile
     [g/Tile
     [g/Box {:margin    :large
             :size      :small}
      [g/Box {:direction :row}
       [g/Meter {:type     :bar
                 :vertical true
                 :max      100
                 :series   [{:value 25}
                            {:value 31}
                            {:value 29}]}]
       [g/Box {:direction :column}
        [g/Value {:value 24.9
                  :units "%"
                  :label "1 min load avg."
                  :size  :small
                  :align :start}]
        [g/Value {:value 30.8
                  :units "%"
                  :label "5 min load avg."
                  :size  :small
                  :align :start}]
        [g/Value {:value 28.5
                  :units "%"
                  :label "15 min load avg"
                  :size  :small
                  :align :start}]]]]]]
    ]])

