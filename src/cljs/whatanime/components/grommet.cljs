(ns whatanime.components.grommet
  (:refer-clojure :exclude [Box List])
  (:require-macros [whatanime.components.grommet :refer [def-components def-icons]])
  (:require [reagent.core :refer [adapt-react-class]]
            [oops.core :refer [oget]]))

(def-components
  ;; Layout
  Box
  Split
  
  ;; Structure
  App
  Article
  Footer
  Header
  Section
  Sidebar
  Value

  ;; Text
  Heading
  Headline
  Label
  Markdown
  Paragraph
  Title

  ;; Controls
  Anchor
  Button
  Menu

  ;; Listing
  Tiles
  Tile

  ;; Icons
  SVGIcon

  ;; Visualization
  Meter
  )

(def-icons
  SearchIcon
  ServerClusterIcon
  UpdateIcon
  CircleQuestionIcon
  DocumentTextIcon
  SocialFacebookIcon
  SocialGooglePlusIcon
  SocialGithubIcon
  MailIcon
  DesktopIcon
  ActionIcon
  PlatformChromeIcon
  PlatformFirefoxIcon
  PlatformOperaIcon
  ChatIcon
  CodeIcon
  )

