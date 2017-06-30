(ns whatanime.components.grommet)

(defmacro def-components
  [& components]
  `(do
     ~@(map (fn [sym]
              `(def ~sym
                 (~'adapt-react-class (~'oget ~'js/Grommet ~(str sym)))))
            components)))

(defmacro def-icons
  [& icons]
  `(do
     ~@(map (fn [sym]
              `(def ~sym
                 (~'adapt-react-class (~'oget ~'js/Grommet ~(str "Icons.Base." sym)))))
            icons)))
