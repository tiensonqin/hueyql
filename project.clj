(defproject lending-relay "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [com.datomic/datomic-free "0.9.5130" :exclusions [joda-time]]
                 [overtone/at-at "1.2.0"]
                 [ring "1.3.2"]
                 [ring/ring-json "0.3.1"]
                 [compojure "1.3.1"]])
