(ns whatanime.components.home.views
  (:require [reagent.core :refer [as-element]]
            [re-frame.core :refer [dispatch]]
            [whatanime.components.grommet :as g]
            [whatanime.components.icon :refer [WhatanimeIcon SocialPatreonIcon]]
            [whatanime.components.router.views :as router.views]
            [whatanime.components.router.events :as router.events]
            ))

(defn Feature [{:keys [icon heading description]} action]
  [g/Tile
   [g/Box {:size   :medium
           :align  :center
           :margin :medium}
    [g/Box {:margin {:bottom :medium}}
     [icon {:size :large}]]
    [g/Heading {:tag :h2}
     heading]
    [g/Paragraph {:size    :large
                  :margin  :small}
     description]
    action]])

(defn Credit [{:keys [credit work link remark]} action]
  [g/Box {:pad    {:vertical :small}
          :align  :center}
   [g/Title (str credit (when work " - "))
    (when work
      [g/Anchor {:target :_blank
                 :label  work
                 :href   link}])]
   (when remark
     [g/Paragraph {:margin :small}
      remark])
   action])

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
     [Feature {:icon        g/DesktopIcon
               :heading     "Web App"
               :description "Search anime screenshots from your browser."}
      [g/Button {:label "Try it out!"
                 :onClick #(dispatch [::router.events/to-route :image-search])}]]
     [Feature {:icon        g/ActionIcon
               :heading     "Browser Plugin"
               :description "Instantly lookup any anime screenshots online."}
      [g/Box {:direction   :row
              :justify     :center
              :responsive  false}
       [g/Anchor {:target :_blank
                  :href   "https://chrome.google.com/webstore/detail/search-anime-by-screensho/gkamnldpllcbiidlfacaccdoadedncfp"
                  :icon   (as-element [g/PlatformChromeIcon {:size :medium}])}]
       [g/Anchor {:target :_blank
                  :href   "https://addons.mozilla.org/en-US/firefox/addon/search-anime-by-screenshot/"
                  :icon   (as-element [g/PlatformFirefoxIcon {:size :medium}])}]
       [g/Anchor {:target :_blank
                  :href   "https://addons.opera.com/en/extensions/details/search-anime-by-screenshot/"
                  :icon   (as-element [g/PlatformOperaIcon {:size :medium}])}]]]
     [Feature {:icon        g/ChatIcon
               :heading     "Telegram Bot"
               :description "Share and discover anime with your friends."}
      [g/Button {:target :_blank
                 :label  "@WhatAnimeBot"
                 :href   "https://telegram.me/WhatAnimeBot"}]]
     [Feature {:icon        g/CodeIcon
               :heading     "HTTP API"
               :description "Develop your own application that requires anime search."}
      [g/Button {:target  :_blank
                 :label   "Read the Docs"
                 :href    "https://soruly.github.io/whatanime.ga"}]]
     ]]

   [g/Section {:direction   :column
               :align       :center
               :colorIndex  :light-2}
    [g/Heading {:strong true} "Special Thanks"]
    [Credit {:credit  "Dr. Mathias Lux"
             :work    "LIRE Project"
             :link    "http://www.lire-project.net/"
             :remark  "The technology that powers this image search."}]
    [Credit {:credit  "Josh"
             :work    "AniList"
             :link    "https://anilist.co/"
             :remark  "The source of anime data we provide."}]
    [Credit {:credit  "All the Patreons"
             :remark  "The people who help keep this project running."}
     [g/Button {:size   :small
                :target :_blank
                :label  "Become a Patreon!"
                :href   "https://www.patreon.com/soruly"}]]
     ]])

