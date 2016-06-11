(defproject sv/system.sente "0.1.0-SNAPSHOT"
  :description "Components and helper functions to use sente in a
                sv/system-based application."
  :url "https://github.com/SimpleValue/sv.system.sente"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/core.async "0.2.374"]
                 [org.clojure/tools.logging "0.3.1"]
                 [com.taoensso/sente "1.8.1"]
                 [ring/ring-core "1.5.0"]
                 [sv/system.main "0.1.0"]
                 [sv/system.core "0.1.0"]])
