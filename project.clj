(defproject whatanime/front-end "0.1.0-SNAPSHOT"
  :description "Front end for whatanime.ga"
  :url "https://whatanime.ga/"

  :min-lein-version "2.6.1"
  :plugins [[lein-figwheel "0.5.10"]
            [lein-cljsbuild "1.1.6"]
            [lein-garden "0.3.0"]]

  :dependencies [;; language core
                 [org.clojure/clojure "1.9.0-alpha17"]
                 [org.clojure/clojurescript "1.9.671"]
                 ;; utilities
                 [binaryage/devtools "0.9.4"]
                 [re-frisk "0.4.5"]
                 [binaryage/oops "0.5.5"]
                 ;; framework
                 [reagent "0.7.0"]
                 [re-frame "0.9.4"]
                 ;[cljsjs/grommet "1.3.4-0"]
                 [akiroz.re-frame/storage "0.1.2"]
                 [akiroz.re-frame/whatanime "0.1.0-SNAPSHOT"]
                 ]

  :profiles
  {:dev
   {:dependencies [[clj-http "3.6.1"]
                   [com.cemerick/url "0.1.1"]]
    :source-paths ["src/dev_server"]}}

  ;; command aliases
  :aliases {"build" ["do"
                     ["clean"]
                     ;["garden" "once"]
                     ["cljsbuild" "once" "production"]]
            }

  ;; clean generated files
  :clean-targets ^{:protect false} ["resources/public/index.js"
                                    "resources/public/index.css"
                                    "resources/public/out"
                                    "target"]

  ;; watch CSS file changes
  :figwheel {:css-dirs      ["resources/public"]
             :server-ip     "localhost"
             :ring-handler  whatanime.dev/api-proxy}

  ;; compile CSS
  ;:garden
  ;{:builds
  ; [{:source-paths ["src/garden"]
  ;   :stylesheet whatanime.styles/screen
  ;   :compiler {:preamble [(clojure.java.io/resource
  ;                           "cljsjs/grommet/production/grommet.min.inc.css")]
  ;              :output-to "resources/public/index.css"
  ;              :pretty-print? false}}]}

  ;; compile JS
  :cljsbuild
  {:builds
   [{:id "dev"
     :source-paths ["src/cljs"]
     :figwheel {:on-jsload whatanime.core/fig-reload}
     :compiler {:main whatanime.core
                :output-to "resources/public/index.js"
                :output-dir "resources/public/out"
                :asset-path "out"
                :source-map-timestamp true
                :language-in :ecmascript5
                :closure-defines
                {akiroz.re-frame.whatanime/api-host "http://localhost:3449"
                 whatanime.core/whatanime-api-token "d4fe1a446f66de196aa397d8f0da13224ff03e10"
                 whatanime.core/enable-re-frisk     true}
                :preloads [devtools.preload]}}

    {:id "production"
     :source-paths ["src/cljs"]
     :compiler {:main whatanime.core
                :output-to "resources/public/index.js"
                :output-dir "target/out"
                :language-in :ecmascript5
                :closure-defines
                {whatanime.core/whatanime-api-token "d4fe1a446f66de196aa397d8f0da13224ff03e10"}
                :optimizations :advanced
                :pretty-print false}}]}
  )
