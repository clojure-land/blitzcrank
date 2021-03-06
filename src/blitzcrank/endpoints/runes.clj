(ns blitzcrank.endpoints.runes
  "API methods for [runes-v3](https://developer.riotgames.com/api-methods/#runes-v3)"
  (:require [blitzcrank.endpoints
             [api :as api]
             [summoner :as summoner]]
            [clojure.core.strint :refer [<<]]))

(defn by-id
  "Get all rune pages for a summoner by summoner ID"
  [summoner-id & [options]]
  (api/resource-body "platform" "runes/by-summoner/~{summoner-id}" options))

(defn by-name
  "Get all rune pages for a summoner by summoner name"
  [name & [options]]
  (by-id (summoner/id-by-name name) options))