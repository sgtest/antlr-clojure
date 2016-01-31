(in-ns 'ns1)

(def var1 1)

(in-ns 'ns2)

(def var2 (+ ns1/var1 2))

(def var3 (+ var2 ns1/var1))

;;going back to namespace, should resolve already defined names
(in-ns 'ns1)

(def var4 (+ var1 ns2/var2 ns2/var3 ns1/var1))
