;; -------------------------------------------------------------------
;; clj-fuzzy Sorensen Dice Coefficient Tests
;; -------------------------------------------------------------------
;;
;;
;;   Author: PLIQUE Guillaume (Yomguithereal)
;;   Version: 0.1
;;
(ns clj-fuzzy.dice-test
  (:require [clojure.test :refer :all]
            [clj-fuzzy.dice :refer :all]))

(deftest coefficient-test
  (is (= 1.0 (coefficient "healed" "healed")))
  (is (= 0.8 (coefficient "healed" "sealed")))
  (is (= 0.5454545454545454 (coefficient "healed" "healthy")))
  (is (= 0.4444444444444444 (coefficient "healed" "heard")))
  (is (= 0.4 (coefficient "healed" "herded")))
  (is (= 0.25 (coefficient "healed" "help")))
  (is (= 0.0 (coefficient "healed" "sold")))
  (is (= 1.0 (coefficient "tomato" "tomato")))
  (is (= 0.0 (coefficient "h" "help")))
  (is (= 1.0 (coefficient "h" "h")))
  (is (= 1.0 (coefficient "" "")))
  (is (= 0.0 (coefficient "h" "g")))
  (is (= 1.0 (coefficient "bar" "baz" :n 0)))
  (is (= 0.6666666666666666 (coefficient "bar" "baz" :n 1)))
  (is (= 0.5 (coefficient "bar" "baz" :n 2)))
  (is (= 0.0 (coefficient "bar" "baz" :n 3))))
