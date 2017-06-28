(ns whatanime.components.sidebar.views
  (:require [reagent.core :refer [as-element]]
            [re-frame.core :refer [dispatch subscribe]]
            [whatanime.components.grommet :as g]
            [whatanime.components.icon :refer [WhatanimeIcon SocialPatreonIcon]]
            [whatanime.components.router.events :as router.events]
            [whatanime.components.router.subs :as router.subs]
            ))

(defn Sidebar []
  (let [current-panal (subscribe [::router.subs/current-panel])]
    (fn Sidebar-render []
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
         [g/Anchor {:onClick    #(dispatch [::router.events/to-route :image-search])
                    :className  (when (= @current-panal :image-search) :active)
                    :label      "Image Search"
                    :icon       (as-element [g/SearchIcon])}]
         [g/Anchor {:onClick    #(dispatch [::router.events/to-route :server-status])
                    :className  (when (= @current-panal :server-status) :active)
                    :label      "Server Status"
                    :icon       (as-element [g/ServerClusterIcon])}]
         [g/Anchor {:onClick    #(dispatch [::router.events/to-route :changelog])
                    :className  (when (= @current-panal :changelog) :active)
                    :label      "Changelog"
                    :icon       (as-element [g/UpdateIcon])}]
         [g/Anchor {:onClick    #(dispatch [::router.events/to-route :faq])
                    :className  (when (= @current-panal :faq) :active)
                    :label      "FAQ"
                    :icon       (as-element [g/CircleQuestionIcon])}]
         [g/Anchor {:onClick    #(dispatch [::router.events/to-route :legal])
                    :className  (when (= @current-panal :legal) :active)
                    :label      "Legal"
                    :icon       (as-element [g/DocumentTextIcon])}]
         ]]
       [g/Footer {:flex   :grow
                  :align  :end}
        [g/Menu {:primary true
                 :colorIndex :grey-4}
         [g/Anchor {:href   "https://www.facebook.com/whatanime.ga/"
                    :target :_blank
                    :label  "Facebook"
                    :icon   (as-element [g/SocialFacebookIcon])}]
         [g/Anchor {:href   "https://plus.google.com/communities/115025102250573417080"
                    :target :_blank
                    :label  "Google+"
                    :icon   (as-element [g/SocialGooglePlusIcon])}]
         [g/Anchor {:href   "https://github.com/soruly/whatanime.ga"
                    :target :_blank
                    :label  "Github"
                    :icon   (as-element [g/SocialGithubIcon])}]
         [g/Anchor {:href   "https://www.patreon.com/soruly"
                    :target :_blank
                    :label  "Patreon"
                    :icon   (as-element [SocialPatreonIcon {:size :small}])}]
         [g/Anchor {:href   "mailto:help@whatanime.ga"
                    :label  "Email"
                    :icon   (as-element [g/MailIcon])}]
         ]]])))

