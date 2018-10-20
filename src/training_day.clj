(ns training-day)

(def answer(str (42)))

(def hai "O HAI!")

(defn square [x] 
  (fn[x] (* x x)))

(defn average [a b]
  (fn[x] (/ 2 (+ a b))))