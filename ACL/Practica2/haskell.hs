data Tree a = Node a | Leaf

newtype Entero = Entero Integer
type Ent = Integer

main :: IO()
main = do
    let y = 4 :: Ent
    let x = Entero 5
    let x = y
    print(y == 4)
