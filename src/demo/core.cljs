(ns demo.core
  (:require ["react-native" :as rn]
            [reagent.core :as r]))

;; Log when the component is rendered
(defn app []
  (js/console.log "✅ ClojureScript app component loaded")
  [:> rn/View {:style {:flex 1 :justifyContent "center" :alignItems "center"}}
   [:> rn/Text {:style {:fontSize 20}} "Hello from ClojureScript! 🚀"]])

;; Ensure this returns a valid function component
(defn root-component []
  (js/console.log "✅ Root component function executed")
  (r/create-class
   {:reagent-render (fn [] [app])}))  ;; ✅ Using create-class for compatibility

(defn ^:export init []
  (js/console.log "✅ ClojureScript init function called")
  (.registerComponent (.-AppRegistry rn) "main" (fn [] (r/as-element [root-component])))) ;; ✅ Ensure function is passed
