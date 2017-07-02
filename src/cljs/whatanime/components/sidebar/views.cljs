(ns whatanime.components.sidebar.views
  (:require [reagent.core :refer [as-element]]
            [re-frame.core :refer [dispatch subscribe]]
            [whatanime.components.grommet :as g]
            [whatanime.components.icon :refer [WhatanimeIcon SocialPatreonIcon]]
            [whatanime.components.router.events :as router.events]
            [whatanime.components.router.subs :as router.subs]
            ))

(defn Internal-Link [{:keys [panel label icon]}]
  (let [current-panel (subscribe [::router.subs/current-panel])]
    (fn []
      [g/Anchor {:onClick    #(dispatch [::router.events/to-route panel])
                 :className  (when (= panel @current-panel) :active)
                 :label      label
                 :icon       (as-element [icon])}])))

(defn External-Link [{:keys [href label icon]}]
  [g/Anchor {:href   href
             :label  label
             :target :_blank
             :icon   (as-element [icon])}])

(defn Sidebar []
  [g/Sidebar {:colorIndex :neutral-4
              :size       :small
              :fixed true}
   [g/Header {:pad :small}
    [g/Button {:onClick #(dispatch [::router.events/to-route :home])}
     [g/Box {:direction :row
             :align     :center}
      [WhatanimeIcon {:type :logo}]
      [g/Box {:margin {:left :small}}
       [g/Title "WAIT:"]
       [g/Paragraph {:margin  :none
                     :size    :small}
        "What Anime Is This?"]]]]]
   [g/Box {:flex :grow}
    [g/Menu {:primary true}
     [Internal-Link {:panel :image-search
                     :label "Image Search"
                     :icon  g/SearchIcon}]
     [Internal-Link {:panel :server-status
                     :label "Server Status"
                     :icon  g/ServerClusterIcon}]
     [Internal-Link {:panel :changelog
                     :label "Changelog"
                     :icon  g/UpdateIcon}]
     [Internal-Link {:panel :faq
                     :label "FAQ"
                     :icon  g/CircleQuestionIcon}]
     [Internal-Link {:panel :legal
                     :label "Legal"
                     :icon  g/DocumentTextIcon}]
     ]]
   [g/Footer {:flex   :grow
              :align  :end}
    [g/Menu {:primary true
             :colorIndex :grey-4}
     [External-Link {:href  "https://www.facebook.com/whatanime.ga/"
                     :label "Facebook"
                     :icon  g/SocialFacebookIcon}]
     [External-Link {:href  "https://www.facebook.com/whatanime.ga/"
                     :label "Google+"
                     :icon  g/SocialGooglePlusIcon}]
     [External-Link {:href  "https://github.com/soruly/whatanime.ga"
                     :label "Github"
                     :icon  g/SocialGithubIcon}]
     [External-Link {:href  "https://www.patreon.com/soruly"
                     :label "Patreon"
                     :icon  SocialPatreonIcon}]
     [External-Link {:href  "mailto:help@whatanime.ga"
                     :label "Email"
                     :icon  g/MailIcon}]
     ]]])

