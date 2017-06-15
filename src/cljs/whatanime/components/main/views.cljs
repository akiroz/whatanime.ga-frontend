(ns whatanime.components.main.views
  (:require [reagent.core :refer [as-element]]
            [whatanime.components.grommet :as g]
            [whatanime.components.icon :refer [WhatanimeIcon SocialPatreonIcon]]
            ))

(defn app []
  [g/App {:centered false}
   [g/Split {:flex :right}
    [g/Sidebar {:colorIndex :neutral-4
                :size       :small}
     [g/Header {:pad :medium}
      [g/Anchor {:href   "#"
                 :label  " "
                 :icon   (as-element [WhatanimeIcon {:type :logo}])}]]
     [g/Box {:flex :grow}
      [g/Menu {:primary true}
       [g/Anchor {:href   "#"
                  :label  "Image Search"
                  :icon   (as-element [g/SearchIcon])}]
       [g/Anchor {:href   "#"
                  :label  "Server Status"
                  :icon   (as-element [g/ServerClusterIcon])}]
       [g/Anchor {:href   "#"
                  :label  "Changelog"
                  :icon   (as-element [g/UpdateIcon])}]
       [g/Anchor {:href   "#"
                  :label  "FAQ"
                  :icon   (as-element [g/CircleQuestionIcon])}]
       [g/Anchor {:href   "#"
                  :label  "Terms"
                  :icon   (as-element [g/DocumentIcon])}]
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
       ]]]
    [g/Article
     [g/Header {:pad :medium}
      [g/Title "Lorem Ipsum"]]
     ]]])

