
(defproject clansi "1.3.1-LPG-SNAPSHOT"
  :description "ANSI style and color codes for Clojure."
  :dependencies [[org.clojure/clojure "1.10.1"]]
  :main ^:skip-aot clansi.core
  :profiles {:uberjar {:aot :all}})
