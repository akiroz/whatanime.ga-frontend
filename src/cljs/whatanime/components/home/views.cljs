(ns whatanime.components.home.views
  (:require [reagent.core :refer [as-element]]
            [re-frame.core :refer [dispatch]]
            [whatanime.components.grommet :as g]
            [whatanime.components.icon :refer [WhatanimeIcon SocialPatreonIcon]]
            [whatanime.components.router.views :as router.views]
            [whatanime.components.router.events :as router.events]
            ))

(defmethod router.views/content :home [_]
  [g/Article
   [g/Header {:direction  :column
              :justify    :between}
    [g/Box {:full       :horizontal
            :pad        :medium
            :direction  :row
            :align      :center}
     [WhatanimeIcon {:type :logo}]
     [g/Button {:plain    true
                :label    "Image Search"
                :onClick  #(dispatch [::router.events/to-route :image-search])}]
     [g/Button {:plain    true
                :label    "Server Status"
                :onClick  #(dispatch [::router.events/to-route :server-status])}]
     [g/Button {:plain    true
                :label    "Changelog"
                :onClick  #(dispatch [::router.events/to-route :changelog])}]
     [g/Button {:plain    true
                :label    "FAQ"
                :onClick  #(dispatch [::router.events/to-route :faq])}]
     [g/Button {:plain    true
                :label    "Legal"
                :onClick  #(dispatch [::router.events/to-route :legal])}]
     ]
    [g/Box {:direction  :column
            :align      :center
            :margin     {:vertical :large}}
     [g/Headline {:size   :large
                  :strong true}
      "WAIT"]
     [g/Headline {:strong true
                  :align  :center}
      "What Anime Is This?"]
     [g/Paragraph {:align :center}
      "Life is too short to answer all the \"what anime is this?\" questions."[:br]
      "Let computers do that for you."]]
    [g/Box {:direction  :row
            :align      :center
            :pad        :large
            :responsive false}
     [g/Anchor {:href   "https://www.facebook.com/whatanime.ga/"
                :target :_blank
                :icon   (as-element [g/SocialFacebookIcon])}]
     [g/Anchor {:href   "https://plus.google.com/communities/115025102250573417080"
                :target :_blank
                :icon   (as-element [g/SocialGooglePlusIcon])}]
     [g/Anchor {:href   "https://github.com/soruly/whatanime.ga"
                :target :_blank
                :icon   (as-element [g/SocialGithubIcon])}]
     [g/Anchor {:href   "https://www.patreon.com/soruly"
                :target :_blank
                :icon   (as-element [SocialPatreonIcon {:size :small}])}]
     [g/Anchor {:href   "mailto:help@whatanime.ga"
                :icon   (as-element [g/MailIcon])}]
     ]]

   [g/Section {:direction   :column
               :align       :center
               :textAlign   :center
               :colorIndex  :light-2}
    [g/Heading {:strong true} "Image Search for Anime"]
    [g/Paragraph
     "whatanime.ga is a proof-of-concept prototype search engine that "
     "helps users trace back the original anime by screenshot. "
     "It searches over 22300 hours of anime and find the best matching "
     "scene to tell you what anime it is, from which episode and the "
     "time that scene appeared."]]

   [g/Section {:direction   :column
               :align       :center
               :textAlign   :center
               :pad         :medium}
    [g/Heading {:strong true} "Get Started"]
    [g/Tiles {:justify  :center
              :margin   {:vertical :large}}
     [g/Tile
      [g/Box {:size   :medium
              :align  :center
              :margin :medium}
       [g/Box {:margin {:bottom :medium}}
        [g/DesktopIcon {:size :large}]]
       [g/Heading {:tag :h2}
        "Web App"]
       [g/Paragraph {:size    :large
                     :margin  :small}
        "Search anime screenshots from your browser."]
       [g/Button
        {:label "Try it out!"
         :onClick #(dispatch [::router.events/to-route :image-search])}]]]
     [g/Tile
      [g/Box {:size   :medium
              :align  :center
              :margin :medium}
       [g/Box {:margin {:bottom :medium}}
        [g/ActionIcon {:size :large}]]
       [g/Heading {:tag :h2}
        "Browser Plugin"]
       [g/Paragraph {:size    :large
                     :margin  :small}
        "Instantly lookup any anime screenshots online."]
       [g/Box {:direction   :row
               :justify     :center
               :responsive  false}
        [g/Anchor {:href   "https://chrome.google.com/webstore/detail/search-anime-by-screensho/gkamnldpllcbiidlfacaccdoadedncfp"
                   :target :_blank
                   :icon   (as-element [g/PlatformChromeIcon {:size :medium}])}]
        [g/Anchor {:href   "https://addons.mozilla.org/en-US/firefox/addon/search-anime-by-screenshot/"
                   :target :_blank
                   :icon   (as-element [g/PlatformFirefoxIcon {:size :medium}])}]
        [g/Anchor {:href   "https://addons.opera.com/en/extensions/details/search-anime-by-screenshot/"
                   :target :_blank
                   :icon   (as-element [g/PlatformOperaIcon {:size :medium}])}]]]]
     [g/Tile
      [g/Box {:size   :medium
              :align  :center
              :margin :medium}
       [g/Box {:margin {:bottom :medium}}
        [g/ChatIcon {:size :large}]]
       [g/Heading {:tag :h2}
        "Telegram Bot"]
       [g/Paragraph {:size    :large
                     :margin  :small}
        "Share and discover anime with your friends."]
       [g/Button {:label  "@WhatAnimeBot"
                  :target :_blank
                  :href   "https://telegram.me/WhatAnimeBot"}]]]
     [g/Tile
      [g/Box {:size   :medium
              :align  :center
              :margin :medium}
       [g/Box {:margin {:bottom :medium}}
        [g/CodeIcon {:size :large}]]
       [g/Heading {:tag :h2}
        "HTTP API"]
       [g/Paragraph {:size    :large
                     :margin  :small}
        "Develop your own application that requires anime search."]
       [g/Button
        {:label   "Read the Docs"
         :target  :_blank
         :href    "https://soruly.github.io/whatanime.ga"}]]]
     ]]

   [g/Section {:direction   :column
               :align       :center
               :colorIndex  :light-2}
    [g/Heading {:strong true} "Special Thanks"]
    [g/Box {:pad    {:vertical :small}
            :align  :center}
     [g/Title "Dr. Mathias Lux - "
      [g/Anchor {:label  "LIRE Project"
                 :target :_blank
                 :href   "http://www.lire-project.net/"}]]
     [g/Paragraph {:margin :small}
      "The technology that powers this image search."]]
    [g/Box {:pad    {:vertical :small}
            :align  :center}
     [g/Title "Josh - "
      [g/Anchor {:label  "AniList"
                 :target :_blank
                 :href   "https://anilist.co/"}]]
     [g/Paragraph {:margin :small}
      "The source of anime data we provide."]]
    [g/Box {:pad    {:vertical :small}
            :align  :center}
     [g/Title "All the Patreons"]
     [g/Paragraph {:margin :small}
      "The people who help keep this project running."]
     [g/Button {:size   :small
                :label  "Become a Patreon!"
                :href   "https://www.patreon.com/soruly"}]]
    ]])

